package com.example;
import java.util.ArrayList;
import com.example.modelos.Personas;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personas> personas = new ArrayList<>();
        personas.add(new Personas("pepe",20));
        personas.add(new Personas("",25));

        

    }

    public void recorrer(ArrayList<Personas> personas){
        for (Personas persona : personas) {
            System.out.println("Nombre: "+persona.getNombre()+ " - Edad: "+persona.getEdad());
        }
    }

    public void saludarPersonas(ArrayList<Personas> personas) {
        for (Personas p : personas) {
        System.out.println("¡Hola, " + p.getNombre() + "!");
}
    }
}



