package com.banca;

public class Usuario {

    // Atributos
    private String name;
    private Integer edad;
    private String email;

    // Constructor
    public Usuario(String name, Integer edad, String email) {
        this.name = name;
        this.edad = edad;
        this.email = email;
    }

    // Getters y Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
