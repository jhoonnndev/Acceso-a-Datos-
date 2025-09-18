import java.io.File;
import java.util.Scanner;

public class Ejercicio1_7 {

    //1.7 Dado un directorio muestra el nombre de todos los archivos
    // que contenga, o si está vacío
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        System.out.print("Escribe el nombre del directorio: ");
        respuesta = teclado.nextLine();

        File directorio = new File(respuesta);

        //Tambien comprueba si exitse
        if(directorio.isDirectory()){
            String[] listaFicheros = directorio.list();
            if (listaFicheros.length ==  0){
                System.out.println("Carpeta vacia");
            }
            else {
                for (String s : listaFicheros) {
                    System.out.println(s);
                }
            }
        }
        else {
            System.out.println("No se trata de un direcetorio");
        }
    }
}
