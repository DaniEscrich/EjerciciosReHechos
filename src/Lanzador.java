import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Lanzador {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("java", "Sumador.java", "2", "9");
        pb.directory(new File("C:\\Users\\dani_\\IdeaProjects\\EjerciciosRepasarExamenProcesos\\src"));
        Process p = pb.start();
        InputStream is = p.getInputStream();
        int c;
        while ((c = is.read()) != -1) {
            System.out.print((char) c);

        }
    }
}