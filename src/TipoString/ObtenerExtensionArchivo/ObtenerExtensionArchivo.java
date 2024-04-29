package TipoString.ObtenerExtensionArchivo;

public class ObtenerExtensionArchivo {

    public static void main(String[] args) {

        String archivo = "algun.archivo.jpg";

        int io = archivo.indexOf(".");
        int lio = archivo.lastIndexOf(".");


        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));
        System.out.println("archivo.substring(io) = " + archivo.substring(io));
        System.out.println("archivo.substring(io+1) = " + archivo.substring(io+1));
        System.out.println("archivo.substring(lio+1) = " + archivo.substring(lio+1));


        

    }
}
