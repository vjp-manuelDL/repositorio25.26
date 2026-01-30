package entregable_17;

public class ENTREGABLE_17 {
    
    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10); // números del 0 al 9
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void ordenarDescendente(int[] array) {
        // Ordenación por selección (de mayor a menor)
        for (int i = 0; i < array.length - 1; i++) {
            int indiceMayor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[indiceMayor]) {
                    indiceMayor = j;
                }
            }
            // Intercambiar
            int temp = array[i];
            array[i] = array[indiceMayor];
            array[indiceMayor] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int[10];

        rellenarArray(numeros);

        System.out.print("Array original: ");
        mostrarArray(numeros);

        ordenarDescendente(numeros);

        System.out.print("Array ordenado (mayor a menor): ");
        mostrarArray(numeros);
    }
}

