import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe el nombre del fichero: ");
        String respuesta = teclado.nextLine();

        File fichero = new File(respuesta);

        FileReader fr = new FileReader(fichero);

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        int letras;
        int contador = 0;
        while ((letras = fr.read()) != -1 ){
            char c = (char) letras;
            for(int i = 0; i<vocales.length; i++){
                if (letras == vocales[i]){
                    contador++;
                }
            }
        }

        System.out.println(contador);

        fr.close();

    }
}
