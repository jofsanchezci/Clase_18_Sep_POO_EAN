public class Atleta {
    // Atributos de instancia
    private int id;
    private String nombre;
    private double tiempo;

    // Atributos estáticos
    private static int contador = 0;
    private static String seleccion = "Colombia";
    private static double tiempoEquipo = 0;

    // Constructor
    public Atleta(String nombre, double tiempo) {
        this.id = ++contador;  // Incrementar el contador y asignarlo como ID
        this.nombre = nombre;
        this.tiempo = tiempo;
        tiempoEquipo += tiempo;  // Sumar el tiempo del atleta al tiempo total del equipo
    }

    // Método para correr 400 metros
    public void correr400Metros(double nuevoTiempo) {
        tiempoEquipo = tiempoEquipo - this.tiempo + nuevoTiempo;
        this.tiempo = nuevoTiempo;
    }

    // Método estático para imprimir el nombre de la selección
    public static void imprimirSeleccion() {
        System.out.println("Selección: " + seleccion);
    }

    // Método estático para imprimir el tiempo total del equipo
    public static void imprimirTiempoEquipo() {
        System.out.println("Tiempo total del equipo: " + tiempoEquipo + " segundos");
    }

    // Método para imprimir la información del atleta
    public void imprimirInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Tiempo: " + tiempo + " segundos");
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Alejandro Perlaza", 9.55);
        Atleta atleta2 = new Atleta("Anthony Zambrano", 9.28);
        Atleta atleta3 = new Atleta("Diego Palomeque", 9.53);
        Atleta atleta4 = new Atleta("Gilmar Herrera", 9.29);

        atleta1.imprimirInfo();
        atleta2.imprimirInfo();
        atleta3.imprimirInfo();
        atleta4.imprimirInfo();

        imprimirSeleccion();
        imprimirTiempoEquipo();
    }
}
