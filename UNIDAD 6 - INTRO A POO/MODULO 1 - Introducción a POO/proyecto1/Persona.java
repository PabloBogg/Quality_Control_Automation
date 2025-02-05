package proyecto1;
/*
 * ✏️  Actividad: Creación de un objeto “Persona”
Objetivo: Aplicar los conceptos de programación orientada a objetos mediante la creación de una clase llamada Persona, con instancias que contengan datos personalizados.

Instrucciones:

Abre tu editor de código y crea un nuevo proyecto Java."

Define la clase Persona:

Crea una clase llamada Persona en tu proyecto.

Declara al menos dos atributos para esta clase: nombre y edad.

Agrega un método para imprimir datos: Dentro de la clase Persona, crea un método llamado imprimirDatos. Este método debe mostrar en la consola una presentación de la persona, incluyendo sus atributos.

Implementa el punto de entrada del proyecto: Incluye en tu proyecto una clase principal que contenga un método main. Este será el punto de ejecución del programa.

Crea y utiliza instancias de Persona:

En el método main, crea un objeto a partir de la clase Persona.

Asigna valores a los atributos nombre y edad del objeto creado.

Invoca el método imprimirDatos para mostrar en consola la presentación del objeto.

Crea un segundo objeto:

Crea otro objeto del tipo Persona.

Asigna valores diferentes a sus atributos.

Llama al método imprimirDatos para imprimir sus datos en la consola.

Valida el funcionamiento: Asegúrate de que ambos objetos muestran correctamente sus datos al ejecutar el programa.
 */

public class Persona{
    private String nombre;
    private int edad;


public Persona(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
}

public void imprimirDatos(){
System.out.println("Nombre: "+nombre+" - Edad: "+edad);
}

}