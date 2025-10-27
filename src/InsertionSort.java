public class InsertionSort {

    // Enteros
    static void ordenarEnteros(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int clave = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > clave) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = clave;
        }
    }

    static void ordenarCadenas(String[] a) {
        for (int i = 1; i < a.length; i++) {
            String clave = a[i];
            int j = i - 1;
            while (j >= 0 && esMenor(clave, a[j])) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = clave;
        }
    }

    static boolean esMenor(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int min = a.length() < b.length() ? a.length() : b.length();
        for (int i = 0; i < min; i++) {
            if (a.charAt(i) < b.charAt(i)) return true;
            if (a.charAt(i) > b.charAt(i)) return false;
        }
        return a.length() < b.length();
    }

    static void ordenarPersonasPorNombre(Persona[] p) {
        for (int i = 1; i < p.length; i++) {
            Persona clave = p[i];
            int j = i - 1;
            while (j >= 0 && esMenor(clave.nombre, p[j].nombre)) {
                p[j + 1] = p[j];
                j--;
            }
            p[j + 1] = clave;
        }
    }

    static void ordenarPersonasPorEdad(Persona[] p) {
        for (int i = 1; i < p.length; i++) {
            Persona clave = p[i];
            int j = i - 1;
            while (j >= 0 && p[j].edad > clave.edad) {
                p[j + 1] = p[j];
                j--;
            }
            p[j + 1] = clave;
        }
    }
}








