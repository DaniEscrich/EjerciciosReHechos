import java.io.IOException;

public class ProcessKillNotepad {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Crea un proyecto llamado ProcessKillNotepad con un programa que arranque el bloc de notas o\n" +
                "cualquier editor de texto similar desde tu sistema operativo. Luego, el programa esperará 10 segundos\n" +
                "a que “finalice” el subproceso y, transcurrido ese periodo, será destruido. Para dormir 10 segundos,\n" +
                "utilice estas instrucciones: Thread.sleep(10000);");
        ProcessBuilder pb = new ProcessBuilder("notepad");
            Process p = pb.start();
            Thread.sleep(10000);
            p.destroy();
    }
}
