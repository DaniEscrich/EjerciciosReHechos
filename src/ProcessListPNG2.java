import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ProcessListPNG2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indicame una ruta y te dire las imagenes png encontradas : ");
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
