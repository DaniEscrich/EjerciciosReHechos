public class Sumador {
    public static void Sumar (int n1, int n2){
        int sumar = 0;
        for (int i = n1; i<=n2 ; i++ ){
            sumar += i;
        }
        System.out.println("La suma del intervalo del numero 1 (" + n1 + ") y del numero 2 (" + n2 + ") es : " + sumar);
    }
    public static void main(String[] args) {
        int numero1= Integer.parseInt(args[0]);
        int numero2= Integer.parseInt(args[1]);
        Sumar(numero1,numero2);
    }
}