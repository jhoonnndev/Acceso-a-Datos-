import java.io.File;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        File archivo1 = new File("ejemplo1.txt");

        if(archivo1.exists()){
            System.out.println("El archivo existe");
            System.out.println("Nombre: " + archivo1.getName());
            System.out.println("Longitud: " + archivo1.length());
            System.out.println("Ruta: " + archivo1.getAbsolutePath());
        }
        else {
            System.out.println("El archivo no existe");
        }
        System.out.println(archivo1.exists());
    }
}
