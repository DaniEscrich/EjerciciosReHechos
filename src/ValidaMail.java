public class ValidaMail {
    public static void main(String[] args) {
        try {
            String cadena  = args[0];
            if (!cadena.contains("@")) {
                System.err.println("El email no contiene una @!");

            }
            String[] identificador = cadena.split("@");

            if (identificador.length != 2 || identificador[1].isEmpty()) {
                System.err.println("No existe segundo identificador!");
            }
            if (identificador[0].length()<3) {
                System.err.println("El primer identificador ha de tener una longitud mínima de 3 caracteres!");
            }
            String dominio = identificador[1];

            if (!dominio.contains(".")) {
                System.err.println("El dominio no tiene un punto (.)!");
                return;
            }
            String extDominio = dominio.substring(dominio.lastIndexOf("."));
            if (!extDominio.equals(".com") && !extDominio.equals(".es") && !extDominio.equals(".org")) {
                System.err.println("El dominio no es ni .com, .es, ni .org!");
                return;
            }

            System.out.println("Funciona correctamente");
        }catch (Exception e) {
            e.printStackTrace();

        }
    }
}