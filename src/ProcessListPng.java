import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ProcessListPng {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crea un proyecto llamado ProcessListPNG con un programa que le pida al usuario que introduzca\n" +
                "una ruta (por ejemplo, /micarpeta/fotos) y luego inicie un proceso que muestre una lista de todas las\n" +
                "imágenes PNG encontradas en esta ruta.\n");

        System.out.println("\n" + "Introduce una ruta y te mostrare todas las png de la carpeta: ");
        String ruta = sc.next();
        File fichero = new File(ruta);

        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "dir *.png");
        pb.directory(fichero);


            Process p = pb.start();
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);

        }
    }
}