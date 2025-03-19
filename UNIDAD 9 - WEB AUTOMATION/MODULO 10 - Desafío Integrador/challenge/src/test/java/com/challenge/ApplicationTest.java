package com.challenge;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.challenge.Pages.HomePage;
import com.challenge.Pages.Inventory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class ApplicationTest {

    private WebDriver driver;
    private HomePage home;
    private Inventory inventory;

    @BeforeEach
    public void setUp() {
        driver = new EdgeDriver();
        String urlHomePage = "https://www.saucedemo.com/v1/index.html";
        home = new HomePage(driver, urlHomePage);
        
    }

    @Test
    /*
     * Intenta iniciar sesión sin ingresar el usuario ni la contraseña. Evalúa si es
     * necesario agregar una espera y verifica el mensaje de error en la vista.
     */
    void testLoginUsuarioVacio() throws InterruptedException {
        Thread.sleep(2000);
        home.login("", "");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement mensajeError = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3[data-test='error']")));

        Assertions.assertEquals("Epic sadface: Username is required", mensajeError.getText());
        Thread.sleep(2000);

    }

    @Test
    /*
     * Ingresa un usuario válido de la lista,
     * pero con una contraseña incorrecta e intenta iniciar sesión.
     * Evalúa si es necesario agregar una espera y verifica el mensaje de error en
     * la vista.
     */
    void testLoginContraInvalida() throws InterruptedException {
        Thread.sleep(2000);
        home.login(home.getListaUsuarios(0), "dfhhfdfh");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement mensajeError = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3[data-test='error']")));

        Assertions.assertEquals("Epic sadface: Username and password do not match any user in this service",
                mensajeError.getText());
        Thread.sleep(2000);

    }

    @Test
    /*
     * Ingresa un usuario válido de la lista junto con la contraseña correcta e
     * inicia sesión.
     * Evalúa si es necesario agregar una espera y verifica la redirección de la
     * vista.
     */
    void testLoginValido() throws InterruptedException {
        Thread.sleep(2000);
        home.login(home.getListaUsuarios(0), home.getPassword());
        Thread.sleep(2000);
        assertEquals("https://www.saucedemo.com/v1/inventory.html", driver.getCurrentUrl());
        Thread.sleep(2000);
        

    }

    // -- ETAPA 2--
    @Test
    /*
     * Iniciar sesión con el primer usuario.
     * 
     * Verificar que el inicio de sesión sea exitoso.
     * 
     * Acceder al menú desplegable y cerrar sesión.
     * 
     * Verificar que el cierre de sesión haya sido exitoso.
     * 
     * Repetir la secuencia para todos los usuarios.
     */
    void testLoginLogout() throws InterruptedException {
        Thread.sleep(2000);
        home.login(home.getListaUsuarios(0), home.getPassword());
        Thread.sleep(2000);
        assertEquals("https://www.saucedemo.com/v1/inventory.html", driver.getCurrentUrl());
        Thread.sleep(2000);
        inventory.logOut();



    }

    @AfterEach
    public void quit() {
        home.quit();
    }
}
