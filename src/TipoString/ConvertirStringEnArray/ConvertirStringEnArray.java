package TipoString.ConvertirStringEnArray;

public class ConvertirStringEnArray {

    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray().toString());

        char[] arr = trabalenguas.toCharArray();
        System.out.println("arr = " + arr.toString());

        int lgth = arr.length;
        System.out.println("lgth = " + lgth);

        for(int i = 0; i < lgth; i ++){
            System.out.println("arr[i] = " + arr[i]);
        }

        System.out.print("arr[i] = ");
        for(int i = 0; i < lgth; i ++){
            System.out.print(arr[i]);
        }

        System.out.println("\ntrabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] arr2 = trabalenguas.split("a");
        int lgth2 = arr2.length;

        for(int j=0; j<lgth2; j++){
            System.out.println(arr2[j]);
        }

        String archivo = "algun.archivo.js";
        System.out.println("archivo = " + archivo);

        String[] archivoArr = archivo.split("\\."); // [.]
        System.out.println("archivoArr[0] = " + archivoArr[0]);
        System.out.println("archivoArr[1] = " + archivoArr[1]);

        int archivoLgth = archivoArr.length;
        System.out.println("archivoLgth = " + archivoLgth);

        for(int i = 0 ; i < archivoLgth; i++){
            System.out.println(archivoArr[i]);
        }

        String extension = archivoArr[archivoLgth - 1];
        System.out.println("extension = " + extension);
        
    }

}
