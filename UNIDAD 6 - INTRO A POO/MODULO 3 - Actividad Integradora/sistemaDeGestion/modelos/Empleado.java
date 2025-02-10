package sistemaDeGestion.modelos;

/*
 * Crea una carpeta “modelos” donde alojarás la clase “Empleado” con los 
 * atributos nombre, edad, salario y departamento. Todos sus atributos 
 * deben ser declarados como privados y deben contar con sus métodos getter y setter. 

Crea un arreglo de 10 posiciones, para almacenar objetos del tipo empleado. 
Crea al menos 4 objetos para poder realizar futuras pruebas en los métodos 
desarrollados con posterioridad.
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    
    //Constructor sin parametros
    public Empleado() {
    }

    // Constructor con todos los parametros
    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Getters - Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    

    

    
}
