import java.io.File;
import java.util.Scanner;

public class Ejercicio1_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        System.out.print("Escribe el nombre del directorio: ");
        respuesta = teclado.nextLine();

        File directorio = new File(respuesta);

        if (directorio.isDirectory() && directorio.exists()){
            directorio.delete();
            System.out.println("Directorio eliminado");
        }
        else {
            System.out.println("No existe o no es un directorio");
        }



    }
}
