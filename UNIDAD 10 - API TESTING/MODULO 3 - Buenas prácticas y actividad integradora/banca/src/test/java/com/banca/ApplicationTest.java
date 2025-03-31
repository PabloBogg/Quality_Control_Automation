package com.banca;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashSet;
import java.util.List;

import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

class ApplicationTest {

    @Test
    /*
     * Prueba 1- Verificar y limpiar el endpoint:
     * 1-Envía una solicitud GET al endpoint y verifica si la respuesta está vacía.
     * 2-Si el endpoint contiene datos, usa una solicitud DELETE para eliminarlos.
     * 3-Confirma que después de la eliminación, el endpoint está vacío enviando
     * otra
     * solicitud GET.
     */
    void Test1_VerificarLimpiarEndpoint() {

        // PARTE 1
        List<String> ids = given()
                .when()
                .get("https://67e5d28018194932a587553b.mockapi.io/api/v1/usuarios")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .getList("id", String.class);
        System.out.println("----");
        System.out.println(" 1-Envía una solicitud GET al endpoint y verifica si la respuesta está vacía.");
        System.out.println("Se encontraron " + ids.size() + " usuarios.");
        System.out.println("----");

        // PARTE 2
        if (!ids.isEmpty()) {
            for (String id : ids) {
                given()
                        .when()
                        .delete("https://67e5d28018194932a587553b.mockapi.io/api/v1/usuarios/" + id)
                        .then()
                        .statusCode(200);
                System.out.println("Usuario " + id + " eliminado.");

            }

            // PARTE 3
            int datasize = given()
                    .when()
                    .get("https://67e5d28018194932a587553b.mockapi.io/api/v1/usuarios")
                    .then()
                    .statusCode(200)
                    .body("size()", equalTo(0))
                    .extract()
                    .path("size()");
            System.out.println("----");
            System.out.println(
                    "3-Confirma que después de la eliminación, el endpoint está vacío enviando otra solicitud GET.");
            System.out.println("Finalmente quedaron" + datasize + " usuarios.");
            System.out.println("----");

        }

    }

    @Test
    /*
     * Prueba 2 - Crear usuarios aleatorios y validar unicidad de correos:
     * 1-Crea una clase Usuario con los atributos nombre, email y edad.
     * 2-Genera 10 usuarios aleatorios asegurándote de que sus correos electrónicos
     * sean únicos.
     * 3-Usa una estructura de datos adecuada para evitar duplicados.
     * 4-Envía una solicitud POST con la lista de usuarios en formato JSON.
     * 5-Verifica que la respuesta tenga un código 201 (Created).
     */
    void Test2_UsuariosAleatoriosVerificarUnicidad() throws JsonProcessingException {

        // PARTE 2
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            String name = faker.name().fullName();
            Integer edad = faker.number().numberBetween(1, 100);
            String email = faker.internet().emailAddress();
            Usuario usuario = new Usuario(name, edad, email);
            // PARTE 4
            ObjectMapper objectMapper = new ObjectMapper();
            String requestBody = objectMapper.writeValueAsString(usuario);
            System.out.println(requestBody);
            given()
                    .contentType("application/json")
                    .body(requestBody)
                    .when()
                    .post("https://67e5d28018194932a587553b.mockapi.io/api/v1/usuarios/")
                    .then()
                    .statusCode(201);
        }

    }

    @Test
    /*
     * Prueba 3 - Validar que no haya correos duplicados:
     * 1-Envía una solicitud GET para obtener la lista de usuarios.
     * 2-Extrae los correos electrónicos de la respuesta.
     * 3-Verifica que no haya correos duplicados.
     */
    void Test3_CorreosDuplicados() {
        // PARTE 1 y 2
        List<String> emails = given()
                .when()
                .get("https://67e5d28018194932a587553b.mockapi.io/api/v1/usuarios")
                .then()
                .extract()
                .jsonPath()
                .getList("email", String.class);

        // PARTE 3
        HashSet<String> emailsUnicos = new HashSet<>(emails);
        Assertions.assertEquals(emails.size(), emailsUnicos.size());

    }

    @Test
    /*
     * Prueba 4 - Actualizar un número de cuenta:
     * 1-Envía una solicitud PUT o PATCH para actualizar el número de cuenta de un
     * usuario existente.
     * 2-Verifica que la respuesta tenga un código de estado 200 (OK).
     * 3-Envía una solicitud GET para confirmar que la actualización se realizó
     * correctamente.
     */

    void Test4_ActualizarNumeroCuenta() {

        // PARTE 1 Y 2
        String requestbody = "{\"name\": \"nuevo nombre 2\"}";
        String id = "10";
        given()
                .contentType("application/json")
                .body(requestbody)
                .when()
                .put("https://67e5d28018194932a587553b.mockapi.io/api/v1/usuarios/" + id)
                .then()
                .statusCode(200);

        // PARTE 3
        JSONObject jsonObject = new JSONObject(requestbody);
        String nuevoNombre = jsonObject.getString("name");

        given()
                .when()
                .get("https://67e5d28018194932a587553b.mockapi.io/api/v1/usuarios/" + id)
                .then()
                .body("name", equalTo(nuevoNombre));

    }

    @Test
    /*
     * Prueba 5 - Validar depósito de dinero:
     * 1-Envía una solicitud POST o PATCH para depositar dinero en una cuenta.
     * 2-Verifica que la respuesta tenga un código de estado 200 (OK).
     * 3-Envía una solicitud GET para comprobar que el saldo se incrementó
     * correctamente.
     */

    void Test5_ValidarDeposito() {
        /*
         * Similar al test anterior pero con otro campo a actualizar
         */
    }

    @Test
    /*
     * Prueba 6 - Validar extracción de dinero:
     * 1-Envía una solicitud POST o PATCH para retirar dinero de una cuenta.
     * 2-Verifica que la respuesta tenga un código de estado 200 (OK).
     * 3-Envía una solicitud GET para comprobar que el saldo disminuyó
     * correctamente.
     * 4-Asegúrate de probar casos como:
     * 5-Retiro mayor al saldo disponible (debería fallar).
     * 6-Retiro de un monto exacto.
     */
    void Test6_ExtraccionDinero() {

        // PARTE 1 Y 2
        String extraccion = "150";
        String id = "10";
        String requestbody = "{\"saldo\": \"" + extraccion + "\"}";
        
        given()
                .contentType("application/json")
                .body(requestbody)
                .when()
                .patch("https://67e5d28018194932a587553b.mockapi.io/api/v1/usuarios/" + id)
                .then()
                .statusCode(200);
    }

}
