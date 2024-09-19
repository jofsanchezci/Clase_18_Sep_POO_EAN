public class ManipulacionString {
    public static void main(String[] args) {
        String textoOriginal = "Programación Orientada a Objetos ";
        
        // Paso 1: Obtener la longitud del String
        int longitud = textoOriginal.length();
        System.out.println("Longitud del String original: " + longitud);

        // Paso 2: Eliminar los espacios en blanco
        String sinEspacios = textoOriginal.trim();
        System.out.println("String sin espacios: '" + sinEspacios + "'");

        // Paso 3: Convertir todo a mayúsculas
        String enMayusculas = sinEspacios.toUpperCase();
        System.out.println("String en mayúsculas: " + enMayusculas);

        // Paso 4: Concatenar con "12345"
        String concatenado = enMayusculas + "12345";
        System.out.println("String concatenado: " + concatenado);

        // Paso 5: Extraer substring de la posición 10 a 15
        String substring = concatenado.substring(10, 15);
        System.out.println("Substring desde posición 10 a 15: " + substring);

        // Paso 6: Reemplazar 'o' por 'O'
        String reemplazado = concatenado.replace('o', 'O');
        System.out.println("String después de reemplazar 'o' por 'O': " + reemplazado);

        // Paso 7: Comparar con "Programación"
        boolean esIgual = reemplazado.equalsIgnoreCase("PROGRAMACIÓN");
        System.out.println("El String es igual a 'Programación': " + esIgual);
    }
}
