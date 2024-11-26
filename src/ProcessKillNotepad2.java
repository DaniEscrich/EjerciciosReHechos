import java.io.IOException;

public class ProcessKillNotepad2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("notepad");
        Process p = pb.start();
        Thread.sleep(10000);
        p.destroy();
    }
}
