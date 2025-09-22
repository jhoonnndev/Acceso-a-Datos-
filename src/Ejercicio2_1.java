import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2_1 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe el nombre del fichero: ");
        String respuesta = teclado.nextLine();

        File fichero = new File(respuesta);

        FileReader fr = new FileReader(fichero);
        int letra;
        while((letra = fr.read()) != -1){
            System.out.print((char)letra);
        }

        fr.close();

    }
}
