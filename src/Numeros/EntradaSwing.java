package Numeros;

import javax.swing.*;

public class EntradaSwing {

    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;

        try {

            numeroDecimal = Integer.parseInt(numeroStr);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero entero");

            main(args);

            System.exit(0);

        }

        String textoBinario = "Numero binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String textoOctal = "Numero octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String textoHexadecimal = "Numero hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = textoBinario + "\n" + textoOctal + "\n" + textoHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);

    }


}