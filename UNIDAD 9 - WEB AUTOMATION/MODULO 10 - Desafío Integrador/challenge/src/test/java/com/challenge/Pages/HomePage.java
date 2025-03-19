package com.challenge.Pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Driver {

    public HomePage(WebDriver driver, String url) {

        super(driver, url);

    }

    // El cuadro de texto para username y password
    @FindBy(id = "user-name")
    WebElement textoUserName;

    @FindBy(id = "password")
    WebElement textoPassword;

    // Cuadro de texto

    // El botón de login
    @FindBy(id = "login-button")
    WebElement botonLogin;

    // La lista de usuarios disponibles en la aplicación
    @FindBy(id = "login_credentials")
    WebElement listaUsuarios;

    public String getListaUsuarios(int index) {
        // Dividir el texto en una lista, eliminando la primera línea
        String usuarios = listaUsuarios.getText();
        List<String> userList = Arrays.asList(usuarios.split("\n")).subList(1, usuarios.split("\n").length);
        return userList.get(index);
    }

    // Las contraseñas de los usuarios.
    @FindBy(className = "login_password")
    WebElement listaPassword;

    public String getPassword() {
        String password = listaPassword.getText();
        List<String> passwordList = Arrays.asList(password.split("\n")).subList(1, password.split("\n").length);
        return passwordList.get(0);
    }

    // Un método para cargar el usuario y la contraseña, y luego iniciar sesión.
    public void login(String usuario, String clave) {
        textoUserName.sendKeys(usuario);
        textoPassword.sendKeys(clave);
        botonLogin.click();

    }

}
