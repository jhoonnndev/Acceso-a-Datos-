import java.io.File;
import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        System.out.print("Escribe el nombre de la carpeta: ");
        respuesta = teclado.nextLine();

        File carpeta = new File(respuesta);


        if(!carpeta.isDirectory()){
            carpeta.mkdir();
        }
        else{
            System.out.println("Esta carpeta ya existe");
        }

    }
}
