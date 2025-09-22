import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2_0 {
    public static void main(String[] args) throws IOException {
        //Escribir Fichero
        String nombreFichero = "ejemplo20.txt";
        String frase = "Hola buenos dias";

        FileWriter fileWriter = new FileWriter(nombreFichero,true);
        fileWriter.write(frase);

        fileWriter.close();

        //Leer contenido
        FileReader fr = new FileReader(nombreFichero);

        int letra;
        while((letra =fr.read()) != -1){
            System.out.print((char)letra);
        }
    }
}
