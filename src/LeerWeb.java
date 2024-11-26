import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class LeerWeb {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indicame tres páginas webs separadas por @ (www.uv.es@www.uji.es@www.ua.es)");
        String paginas = sc.nextLine();

        ProcessBuilder pb = new ProcessBuilder("java", "Visitaweb.java",paginas);
        pb.directory(new File("C:\\Users\\dani_\\IdeaProjects\\EjerciciosRepasarExamenProcesos\\src"));
        Process p = pb.start();
        InputStream is = p.getInputStream();
        int c;
        while ((c = is.read()) != -1) {
            System.out.print((char) c);

        }
    }
}
