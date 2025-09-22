import java.io.*;
import java.util.Scanner;

public class Ejercicio2_4 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String respuesta = "";
        File fichero = new File("ejemplo2_4.txt");
        while (!respuesta.equals("fin")){
            System.out.print("Escribe una frase: ");
            respuesta = teclado.nextLine();
            if (!respuesta.equals("fin")) {
                FileWriter fw = new FileWriter(fichero, true);
                fw.write(respuesta + "\n");

                fw.close();
            }
        }

        String linea;
        BufferedReader br = new BufferedReader(new FileReader(fichero));
        while ((linea = br.readLine()) != null){
            System.out.println(linea);
        }
    }
}
