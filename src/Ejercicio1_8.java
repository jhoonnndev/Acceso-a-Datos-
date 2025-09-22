import java.io.File;

public class Ejercicio1_8 {
    public static void main(String[] args) {
        String nombreCarpeta = "Jhon";
    
        mostrarContenido(new File(nombreCarpeta));
    }

    static void mostrarContenido(File carpeta){
        File[] contenido = carpeta.listFiles();

        for (File f: contenido){
            if(f.isDirectory()){
                System.out.println("/" + f.getName() + "/");
                mostrarContenido(f);

            }
            else{
                System.out.println(f);
            }
        }
    }
}
