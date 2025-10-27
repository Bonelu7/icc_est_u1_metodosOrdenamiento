// App.java
public class App {
    public static void main(String[] args) {

        // Enteros
        int[] numeros = {10, 0, -5, 5, 15, 2};
        System.out.println("Nombre del Estudiante: Boris Puente");
        System.out.println("Arreglo de enteros antes de ordenar:");
        for (int n : numeros) System.out.print(n + " ");
        System.out.println();
        InsertionSort.ordenarEnteros(numeros);
        System.out.println(" Arreglo de enteros después de ordenar:");
        for (int n : numeros) System.out.print(n + " ");
        System.out.println("\n");

        // Cadenas
        String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        System.out.println("Nombre del Estudiante: Boris Puente");
        System.out.println("Arreglo de cadenas antes de ordenar:");
        for (String s : nombres) System.out.print(s + " ");
        System.out.println();
        InsertionSort.ordenarCadenas(nombres);
        System.out.println(" Arreglo de cadenas después de ordenar:");
        for (String s : nombres) System.out.print(s + " ");
        System.out.println("\n");

        // Personas por nombre
        Persona[] personas = {
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28)
        };
        System.out.println("Nombre del Estudiante: Boris Puente");
        System.out.println("Personas antes de ordenar por nombre:");
        for (Persona p : personas) System.out.print(p.imprimir() + " | ");
        System.out.println();
        InsertionSort.ordenarPersonasPorNombre(personas);
        System.out.println("Personas después de ordenar por nombre:");
        for (Persona p : personas) System.out.print(p.imprimir() + " | ");
        System.out.println("\n");

        // Personas por edad
        System.out.println("Nombre del Estudiante: Boris Puente");
        System.out.println("Personas antes de ordenar por edad:");
        for (Persona p : personas) System.out.print(p.imprimir() + " | ");
        System.out.println();
        InsertionSort.ordenarPersonasPorEdad(personas);
        System.out.println("Personas después de ordenar por edad:");
        for (Persona p : personas) System.out.print(p.imprimir() + " | ");
        System.out.println();
    }
}




