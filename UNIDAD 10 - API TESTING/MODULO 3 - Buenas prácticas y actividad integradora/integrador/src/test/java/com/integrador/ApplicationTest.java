package com.integrador;

import org.junit.jupiter.api.Test;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashMap;
import java.util.Map;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class ApplicationTest {

	private final Faker faker = new Faker();

	@Test
	@DisplayName("Prueba metodo get y delete")
	void testGet() {

		RestAssured.baseURI = "https://67e4887b2ae442db76d4b72e.mockapi.io/api/v1";

		Response response = given()
				.when()
				.get("/agregar")
				.then()
				.log().all()
				.statusCode(200)
				.extract()
				.response();

		if (response.jsonPath().getList("$").size() > 0) {
			response.jsonPath().getList("id").forEach(id -> {
				given()
						.when()
						.delete("/agregar/" + id)
						.then()
						.statusCode(200);

				System.out.println("Usuario con Id " + id + " eliminado.");
			});
		} else {
			System.out.println("No hay usuarios en el endpoint");
		}

		given()
				.when()
				.get("/agregar")
				.then()
				.log().all()
				.statusCode(200)
				.body("size()", equalTo(0));
	}

	@Test
	@DisplayName("Prueba del post")
	void testPost() {
		RestAssured.baseURI = "https://67e4887b2ae442db76d4b72e.mockapi.io/api/v1";

		for (int i = 1; i <= 10; i++) {
			Map<String, String> user = new HashMap<>();
			user.put("name", faker.name().fullName());
			user.put("username", faker.name().username());
			user.put("password", faker.internet().password());

			given()
					.contentType(ContentType.JSON)
					.body(user)
					.when()
					.post("/agregar")
					.then()
					.statusCode(201)
					.body("name", equalTo(user.get("name")))
					.body("username", equalTo(user.get("username")));

			System.out.println("Usuario agregado " + user);
		}

	}

	@Test
	@DisplayName("Prueba de PUT")
	void testPut() {
		RestAssured.baseURI = "https://67e4887b2ae442db76d4b72e.mockapi.io/api/v1";

		given()
				.contentType(ContentType.JSON)
				.body("{\"password\":\"ABCDEFG.2310\"}")
				.when()
				.put("/agregar/2")
				.then()
				.statusCode(200);
	}
}
