public class SistemasNumericos {

    public static void main(String[] args) {

        int numeroDecimal = 42;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario =  Integer.parseInt(Integer.toBinaryString(numeroDecimal));
        System.out.println("numeroBinario = " + numeroBinario);

       int numeroDecimal2 = Integer.parseInt("1100",2);

        System.out.println("numeroDecimal = " + numeroDecimal2);

    }
}
