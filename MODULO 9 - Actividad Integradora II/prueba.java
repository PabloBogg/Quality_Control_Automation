public class prueba { 
    public static void main(String[] args) { 
        String texto = "Hola Mundo! Esto es una prueba."; 
        int mayusculas = contarMayusculas(texto); 
        int minusculas = contarMinusculas(texto); 
        System.out.println("Número de letras mayúsculas: " + mayusculas); 
        System.out.println("Número de letras minúsculas: " + minusculas); 
    } 

    public static int contarMayusculas(String texto) { 
        int longitudOriginal = texto.length(); 
        int longitudSinMayusculas = texto.replaceAll("[A-Z]", "").length(); 
        return longitudOriginal - longitudSinMayusculas; 
    } 

    public static int contarMinusculas(String texto) 
    { int longitudOriginal = texto.length(); 
        int longitudSinMinusculas = texto.replaceAll("[a-z]", "").length(); 
        return longitudOriginal - longitudSinMinusculas; 
    } 
}
