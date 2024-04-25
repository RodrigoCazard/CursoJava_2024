import java.util.Scanner;

public class EntradaScaner {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese un numero entero");



            int numeroDecimal = 0;

            try {

                numeroDecimal = scanner.nextInt();

            } catch (Exception e) {

                System.out.println("error debe ingresar un numero entero");

                main(args);

                System.exit(0);

            }


            String textoBinario = "Numero binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            String textoOctal = "Numero octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            String textoHexadecimal = "Numero hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

            String mensaje = textoBinario + "\n" + textoOctal + "\n" + textoHexadecimal;

            System.out.println(mensaje);

        }



}
