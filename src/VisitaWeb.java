import java.io.IOException;

public class VisitaWeb {
    public static void main(String[] args) throws IOException {
        System.out.println("dsadas");
        String cadena = args[0];
        String [] separar = cadena.split("@");

        String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        if(separar.length == 1){
            System.out.println("1");
            new ProcessBuilder(chromePath, separar[0]).start();
        } else if (separar.length == 2) {
            new ProcessBuilder(chromePath, separar[0]).start();
            new ProcessBuilder(chromePath, separar[1]).start();
        } else if (separar.length == 3) {
            System.out.println("3");
            new ProcessBuilder(chromePath, separar[0]).start();
            new ProcessBuilder(chromePath, separar[1]).start();
            new ProcessBuilder(chromePath, separar[2]).start();
        }else {
            System.out.println("ERROR Demasiadas Webs!");
        }
    }
}
