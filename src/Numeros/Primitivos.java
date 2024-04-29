package Numeros;

public class Primitivos {

    public static void main(String[] args) {
        byte numero1 = 25; // 8 bits  [-128, 127]
        short numero2 = 20022; // 2 bytes - 16 bits [-32.768, 32.767]
        int numero3 = 123123123; // 4 bytes - 32 bits  -2**31 a 2**31-1.
        long numero4 = 9223372036854775807L; // 8 bytes - 62 bits  -2**63 a 2**63-1.


        float numero5 = 22222222222.22222222222f; // 4 bytes - 32 bits  1.4x10**-45 a 3.4028235x10**38
        double numero6 = 22222231231231231123123123.1231231231231231231212312d; // 8 bytes - 62 bits  4.9x10**-324 a 1.7976931348623157x10**308

        boolean isRed = true;
        char caracter = 'a'; // solo acepta ''

        //estos 3 son lo mismo
        char arrobaDecimal = 64;
        char arrobaUnicode = '\u0040';
        char arroba = '@';

        char retornoCarro = '\r'; //bora toda la linea hacia atras
        char retroceso = '\b'; //bora pa tras

//        System.lineSeparator() // para hacer un salto de linea

    }
}
