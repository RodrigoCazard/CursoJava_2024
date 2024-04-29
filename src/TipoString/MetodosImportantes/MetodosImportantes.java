package TipoString.MetodosImportantes;

public class MetodosImportantes {

    public static void main(String[] args) {
        
        String nombre = "Valentin ";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Valentin\") = " + nombre.equals("Valentin"));
        System.out.println("nombre.equals(\"valentin\") = " + nombre.equals("valentin"));
        System.out.println("nombre.equalsIgnoreCase(\"valentin\") = " + nombre.equalsIgnoreCase("valentin"));
        System.out.println("nombre.compareTo(\"Valentin\") = " + nombre.compareTo("Valentin"));
        System.out.println("nombre.compareTo(\"valentin\") = " + nombre.compareTo("valentin"));
        System.out.println("nombre.compareToIgnoreCase(\"valentin\") = " + nombre.compareToIgnoreCase("valentin"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(7,8) = " + nombre.substring(7,8));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));

        System.out.println("nombre.replace(\"a\", \".\") = " + nombre.replace("a", "."));
        System.out.println("nombre.indexOf('t') = " + nombre.indexOf('n'));
        System.out.println("nombre.lastIndexOf('a') = " + nombre.lastIndexOf('n'));
        System.out.println("nombre.lastIndexOf('z') = " + nombre.lastIndexOf('z'));
        System.out.println("nombre.contains(\"v\") = " + nombre.contains("V"));
        System.out.println("nombre.startsWith(\"Valen\") = " + nombre.startsWith("Valen"));
        System.out.println("nombre.endsWith(\"tin\") = " + nombre.endsWith("tin"));
        System.out.println("nombre.trim() = " + nombre.trim());




        
    }
    
}
