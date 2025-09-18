import java.util.Scanner;
import java.io.File;
public class Ejercicio1_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respuesta;

        System.out.print("Escribe el nombre del fichero que deseae eliminar: ");
        respuesta = teclado.nextLine();

        File fichero = new File(respuesta);

        if(fichero.exists()){
            fichero.delete();
            System.out.println("Fichero Eliminado");
        }
        else {
            System.out.println("El fichero no existe");
        }

    }
}
