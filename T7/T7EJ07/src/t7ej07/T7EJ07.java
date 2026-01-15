
package t7ej07;

/**
 *
 * @author alumno
 */
public class T7EJ07 {
    //Método que rellena el vector con números aleatorios entre 0 y 50
    public static void rellenarVector(int [] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 51);
        }
    }
    
    //Método que muestra el contenido completo del vector
    public static void mostrarVector(int [] vector){
        System.out.println("Contenido del array con " + vector.length + " numeros aleatorios:");
        //Recorremos el vector mostrando posición y valor
        for(int i = 0; i < vector.length; i++){
            System.out.println("Posicion " + i + " = " + vector[i]);
        }
    }
    
    //Método que muestra los 10 números mayores del vector
    public static void mostrarDiezMayores(int [] vector){       
        System.out.println("\nLos 10 numeros mayores son:");
        //Repetimos 10 veces hasta encontrar los mayores
        for(int rep = 0; rep < 10; rep++){
            int max = -1;
            int indice = 0;
            //Buscamos el mayor del vector
            for(int i = 0; i < vector.length; i++){
                if(vector[i] > max){
                    max = vector[i];
                    indice = i;
                }
            }
            //Mostramos el mayor encontrado
            System.out.print(max + " ");
            //Marcamos ese valor como usado para no volver a cogerlo
            vector[indice] = -1;
        }
    }
    
    public static void main(String[] args) {
        int[] vector = new int[15];//Creamos un vector de 15 posiciones
        
        rellenarVector(vector);//Lo rellenamos con números aleatorios
        mostrarVector(vector);//Mostramos todo el vector
        mostrarDiezMayores(vector);//Mostramos los 10 valores más altos
    }
}