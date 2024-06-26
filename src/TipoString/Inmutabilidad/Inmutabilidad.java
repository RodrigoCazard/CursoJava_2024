package TipoString.Inmutabilidad;

public class Inmutabilidad {

    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(" ").concat(profesor);

        System.out.println("Curso = " + curso);

        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform((c) -> {

            return c + " con " + profesor;

        });

        System.out.println("Curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        // No cambia nada si no lo asignamos a una nueva instancia de String.
        resultado.replace("a", "A");

        System.out.println("resultado = " + resultado);

        String resultado3 = resultado.replace("a", "A");

        System.out.println("resultado3 = " + resultado3);

    }
}
