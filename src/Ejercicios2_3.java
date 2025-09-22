
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicios2_3 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe el numero de archivos que quieres escribir: ");
        int respuesta = teclado.nextInt();

        for(int i = 0; i <= respuesta; i++){
            File fichero = new File("nombre" + i + ".txt");
            FileWriter fw = new FileWriter(fichero);
            fw.write("Este es el fichero nombre" + i + ".txt");

            fw.close();
        }





    }
}
