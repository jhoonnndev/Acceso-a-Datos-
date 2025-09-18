import java.io.File;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        File directorio = new File("directorio.txt");
         directorio.mkdir();
        if(directorio.exists()){
            System.out.println(directorio.getName());
            System.out.println(directorio.length());
            System.out.println(directorio.getAbsolutePath());
        }
        else{
            System.out.println("El archivo no existe");
        }
    }
}
