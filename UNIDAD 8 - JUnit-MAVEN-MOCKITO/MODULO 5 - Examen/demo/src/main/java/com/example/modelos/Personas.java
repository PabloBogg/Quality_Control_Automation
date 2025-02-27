package demo.src.main.modelos;


public class Personas {
    private String nombre;
    private int edad;

    
    public Personas(String nombre, int edad) {
        this.nombre = validar(nombre);
        this.edad = edad;
    }


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

    public String validar(String nombre){
        if (nombre.equals(null)){
            return "Nombre sin especificar";
        }
    } 

}
