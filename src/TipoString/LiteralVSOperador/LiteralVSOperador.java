package TipoString.LiteralVSOperador;

public class LiteralVSOperador {

    public static void main(String[] args) {

        String curso = "Programacion Java";
        String curso2 = new String("programacion Java");

        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);
        
        esIgual = curso.equals(curso2);
        System.out.println("esIgual con metodo equals = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual con metodo equalsIgnoreCase = " + esIgual);

        String curso3 = "Programacion Java";

        esIgual = curso == curso3;
        System.out.println("esIgual comparando declaraciones literales = " + esIgual);

    }

}
