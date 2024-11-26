import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Palindromo {
    public static void pasarCadenaMayusculas(String cadena){
        System.out.println(cadena.toUpperCase());
    }
    public static void adivinarSiEsPalindromo(String cadena){
        File pallindromo = new File("palindromo.txt");
        File noPalindromo = new File("nopalindromo.txt");
        File todas = new File("todas.txt");

        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        if (cadena.equals(cadenaInvertida)){
            System.out.println("La cadena " + cadena + " es palindromo.");
            try {
                FileWriter fw = new FileWriter(pallindromo, true);
                fw.write("La cadena " + cadena + " es un Palindromo\n");
                fw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                FileWriter fw2 = new FileWriter(todas, true);
                fw2.write("La cadena " + cadena + " es un Palindromo\n");
                fw2.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            System.out.println("La cadena " + cadena + " no es palindromo.");
            try {
                FileWriter fw = new FileWriter(noPalindromo, true);
                fw.write("La cadena " + cadena + " no es un Palindromo\n");
                fw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                FileWriter fw2 = new FileWriter(todas, true);
                fw2.write("La cadena " + cadena + " no es un Palindromo\n");
                fw2.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        String mayusculas = args[0];
        String palindromo = args[1];
        pasarCadenaMayusculas(mayusculas);
        adivinarSiEsPalindromo(palindromo);
    }
}
