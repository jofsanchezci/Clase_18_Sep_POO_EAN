
# Atributos y Métodos Estáticos en Java

## Atributos Estáticos
Los atributos estáticos, también conocidos como variables de clase, están asociados con la clase misma y no con alguna instancia particular de la clase. Esto significa que una variable estática es compartida por todas las instancias de la clase. Por lo tanto, si un atributo estático es modificado por una instancia, este cambio se refleja en todas las demás instancias.

Se define un atributo estático en Java usando la palabra clave `static`. Aquí está la sintaxis para definir un atributo estático:

\`\`\`java
static tipoAtributo atributo;
\`\`\`

## Métodos Estáticos
Los métodos estáticos, al igual que los atributos estáticos, están asociados con la clase en lugar de con cualquier objeto de la clase. Esto significa que puedes llamar a un método estático sin necesidad de crear una instancia de la clase. Un método estático solo puede acceder a atributos estáticos y otros métodos estáticos directamente.

Se define un método estático con la palabra clave `static` de la siguiente manera:

\`\`\`java
static tipoRetorno método(parámetros);
\`\`\`

## Llamada a Métodos Estáticos
Para llamar a un método estático, utilizas el nombre de la clase seguido del nombre del método. No es necesario crear una instancia de la clase para hacer esta llamada. Aquí está la sintaxis para llamar a un método estático:

\`\`\`java
NombreClase.nombreMétodo(argumentos);
\`\`\`

## Limitaciones
Los métodos y atributos estáticos tienen algunas restricciones:

1. **Acceso a Miembros No Estáticos:** Un método estático no puede acceder directamente a miembros (atributos o métodos) no estáticos de su clase. Solo pueden acceder a otros miembros estáticos.
2. **Sobrecarga, No Redefinición:** Los métodos estáticos pueden ser sobrecargados, lo que significa que puedes tener varios métodos con el mismo nombre pero con diferentes listas de parámetros. Sin embargo, los métodos estáticos no pueden ser redefinidos (override), que es una característica de la herencia en la que una clase hija proporciona una implementación específica de un método que ya está definido en su clase padre.

Esta organización permite que los métodos y atributos estáticos sean muy útiles para realizar operaciones que son comunes a todos los objetos de la clase, como contar el número de instancias de una clase o almacenar una constante relacionada con la clase.

# Enunciado: Clase Atleta

## Descripción
Realizar un programa en Java que permita modelar un atleta, con los siguientes atributos de instancia y estáticos.

## Atributos de Instancia
- **Identificador del atleta:** tipo `int`.
- **Nombre del atleta:** tipo `String`.
- **Tiempo en realizar una prueba de 400 metros por relevos:** tipo `double`.

## Atributos Estáticos
- **Contador de atletas:** Sirve como identificador de un atleta.
- **Selección:** tipo `String`, valor "Colombia".
- **Tiempo Equipo:** Suma los valores de tiempo obtenidos por un equipo de atletas.

## Constructor
Debe recibir los parámetros: nombre y tiempo de cada atleta y inicializar el identificador del atleta con base en el contador estático.

## Métodos Requeridos
- **Correr 400 metros:** Actualiza el tiempo total de carrera del equipo sumando el tiempo de carrera de cada atleta.
- **Imprimir Selección:** Imprime el nombre de la selección de atletismo.
- **Imprimir Tiempo Equipo:** Imprime el tiempo total obtenido por el equipo de atletismo.

## Método Main
Debe crear cuatro atletas que conforman el equipo de relevos de 400 metros, con los valores de la siguiente tabla y imprimir la información relevante.

### Tabla 3.1. Objetos Atletas

| Objeto  | Nombre            | Tiempo (segundos) |
|---------|-------------------|-------------------|
| atleta1 | Alejandro Perlaza | 9.55              |
| atleta2 | Anthony Zambrano  | 9.28              |
| atleta3 | Diego Palomeque   | 9.53              |
| atleta4 | Gilmar Herrera    | 9.29              |

El método `main` debe imprimir la información de cada atleta, el nombre de la selección y el tiempo total obtenido por el equipo.

# Ejercicios
## **Clase Temperatura**

- Objetivo: Definir una clase Temperatura que contenga dos métodos estáticos:
- Un método para convertir grados Fahrenheit a Celsius, que debe recibir como parámetro un valor de temperatura en grados Fahrenheit.
- Un método para convertir grados Celsius a Fahrenheit, que debe recibir como parámetro un valor de temperatura en grados Celsius.

## **Clase Empleado**

- Objetivo: Definir una clase Empleado que tenga como atributos: identificador del empleado, nombre, apellidos, y salario mensual.
- El identificador es un número consecutivo que se incrementa cada vez que un empleado se crea. 
- Además, se requiere un método estático que calcule el total de la nómina de empleados de la empresa.
