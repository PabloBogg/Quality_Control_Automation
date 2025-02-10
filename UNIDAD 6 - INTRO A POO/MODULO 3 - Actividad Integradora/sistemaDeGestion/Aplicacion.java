package sistemaDeGestion;

import sistemaDeGestion.modelos.Empleado;

public class Aplicacion {

    
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[10];
    empleados[0]=new Empleado("Naileth",20,1500,"Marketing");
    empleados[1]=new Empleado("Luciano",22,1000,"Administracion");
    empleados[2]=new Empleado("Richard",25,1600,"IT");
    empleados[3]=new Empleado("Pablo",25,100,"Ingreso");

    for (Empleado empleado : empleados) {
        
    }
    }

    
}
