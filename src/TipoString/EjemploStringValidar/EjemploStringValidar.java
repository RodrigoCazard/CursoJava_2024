package TipoString.EjemploStringValidar;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(!esNulo){
            System.out.println(curso.toUpperCase());
        }
        System.out.println(curso.concat(" desde cero!"));


        //podes validar con .length == 0
        // .isEmpty() si hay espacio vacio es true
        // isBlank(), si hay espacio vacio es false
        //
    }
}
