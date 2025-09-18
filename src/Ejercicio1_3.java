import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        System.out.print("Escribe el nombre del fichero: ");
        respuesta = teclado.nextLine();

        File fichero = new File(respuesta);
        try {
            if (fichero.createNewFile()){
                System.out.println("El archivo acaba de ser creado");
            }
            else{
                System.out.println("El arhivo ya existe");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
