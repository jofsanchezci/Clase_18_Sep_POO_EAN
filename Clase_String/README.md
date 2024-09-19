
# Clase String en Java

## Descripción General
La clase `String` en Java maneja cadenas de caracteres inmutables. Una vez creada, la cadena no puede ser modificada; cualquier operación que parezca modificarla crea un nuevo objeto `String`.

## Métodos Principales

### Obtención de caracteres
- **`charAt(int index)`**: Retorna el carácter en la posición especificada.
- **`substring(int inicio, int fin)`**: Retorna una subcadena desde `inicio` hasta `fin-1`.

### Longitud y concatenación
- **`length()`**: Retorna la longitud de la cadena.
- **`concat(String str)`**: Concatena la cadena especificada al final de esta cadena.

### Comparación
- **`compareTo(String otraCadena)`**: Compara dos cadenas lexicográficamente.
- **`equals(Object anObject)`**: Compara esta cadena con el objeto especificado para la igualdad.
- **`equalsIgnoreCase(String otraCadena)`**: Compara dos cadenas ignorando diferencias de mayúsculas y minúsculas.

### Modificación de Strings
- **`replace(char viejo, char nuevo)`**: Crea una nueva cadena reemplazando cada aparición del carácter `viejo` por `nuevo`.
- **`toLowerCase()`**: Convierte todos los caracteres de la cadena a minúsculas.
- **`toUpperCase()`**: Convierte todos los caracteres de la cadena a mayúsculas.
- **`trim()`**: Elimina los espacios blancos iniciales y finales.

### Conversión de otros tipos a String
- **`String.valueOf(Object obj)`**: Retorna la representación en forma de cadena del objeto.

### Búsqueda de caracteres
- **`indexOf(int ch)`**: Retorna el índice de la primera aparición del carácter especificado, o -1 si no se encuentra.

Estos métodos facilitan la manipulación de texto, proporcionando operaciones de comparación, búsqueda, modificación y conversión.


# Manipulación de Strings en Java

## Descripción del Problema
Se desea construir un programa que dado un String con valor inicial de: "Programación Orientada a Objetos ", realice las siguientes operaciones:

1. **Obtener la longitud** del String.
2. **Eliminar los espacios en blanco** del String obtenido en el paso anterior.
3. **Convertir todos los caracteres** del String a mayúsculas.
4. **Concatenar** al String el valor "12345".
5. **Extraer un substring** de la posición 10 al 15.
6. **Reemplazar** en el String el carácter 'o' por 'O'.
7. **Comparar** el String con "Programación".

Después de cada paso, se debe mostrar el resultado en pantalla.

## Instrucciones
- Implementar las operaciones mencionadas.
- Mostrar los resultados paso a paso.

Este enunciado guía la creación de un programa que manipula cadenas de texto mediante métodos específicos de la clase String en Java, demostrando transformaciones y comparaciones.

```java
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
```

## Ejercicios

- Hacer una clase que contenga métodos que realicen las siguientes acciones:
1. Un método que reciba como parámetro un String y calcule cuántas mayúsculas tiene.
2. Un método que reciba como parámetro un String y una letra, y determine cuántas veces está la letra en el String (la letra puede estar en mayúscula o minúscula).
3. Un método que reciba como parámetro un String, y que elimine todos sus espacios en blanco y escriba en pantalla el String resultante.
4. Un método que reciba como parámetro un String, y obtenga el String escrito al revés.

