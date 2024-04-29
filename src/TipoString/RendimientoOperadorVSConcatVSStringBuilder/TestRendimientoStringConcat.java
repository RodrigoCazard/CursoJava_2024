package TipoString.RendimientoOperadorVSConcatVSStringBuilder;

public class TestRendimientoStringConcat {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 500; i++){

            // c = c.concat(a).concat(b).concat("\n"); // 500 => 3ms
            // c += a+b+"\n"; // 500 => 13ms
            sb.append(a).append(b).append("\n");// => 0ms

        }

        long fin = System.currentTimeMillis();

        System.out.println("c = " + c);
        System.out.println(fin-inicio);
        System.out.println("sb = "+ sb.toString());

    }

}
