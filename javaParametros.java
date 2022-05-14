public class  javaParametros {
    public static void saludar(String nombre, int edad) {
        System.out.println("HOLA "+nombre+" tu tienes "+edad+" años");
    }
    public static void main(String[] args) {
        saludar(" jose", 19);
        saludar("juana", 12); 
        saludar("juan", 12); 
        //Los metodos en java reciben parametros con los cuales podemos trabajar 
        //para añadirlos solo especificamos el tipo de variable y seguido de una coma para añadir mas 
    }
}
