package proyectoComplementario;

public class Auto{
    private String marca;
    private String modelo;
    private int año;
    

    public Auto(){
      //  this.marca = null;
      //  this.modelo =null;
      //  this.año = 0;
      
    }

    public Auto(String marca){
        this.marca = marca;
      //  this.modelo =null;
      //  this.año = 0;
      
    }

    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo =modelo;
      //  this.año = 0;
      
    }

    public Auto(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo =modelo;
        this.año = año;
        
    }

    public void imprimirDatos(){
        System.out.println("Datos del Auto: \n" +
        "Marca: " + (this.marca!=null ? this.marca : "No especificada") + "\n " +
        "Modelo: " + (this.modelo!=null ? this.modelo : "No especificado") + "\n " +
        "Año: " + (this.año!=0 ? this.año : "No especificado"));
        System.out.println("-------------------------");
    }

}
