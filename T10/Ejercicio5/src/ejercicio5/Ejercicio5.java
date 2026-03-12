package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal del Ejercicio 5.
 * Gestiona una lista de números enteros: los recibe, busca el mayor par y el menor impar,
 * e intercambia sus posiciones.
 */
public class Ejercicio5 {

    /**
     * Método principal.
     * Coordina el flujo: rellenar lista → mostrar → buscar índices → intercambiar → mostrar resultado.
     */
    public static void main(String[] args) {
        // Lista donde se guardan los números introducidos por el usuario
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Rellenar y mostrar lista original
        rellenarLista(numeros);
        System.out.println("La lista original es la siguiente:");
        mostrarLista(numeros);
        
        // Buscar índices: mayor par y menor impar
        int par = indiceMayorPar(numeros);
        int impar = indiceMenorImpar(numeros);
        
        // Validar existencia de ambos valores antes de intercambiar
        if(par == -1 || impar == -1){
            System.out.println("No hay suficientes pares/impares para hacer el intercambio");
        }else{
            // Mostrar valores encontrados y realizar intercambio
            System.out.println("Mayor que: " + numeros.get(par));
            System.out.println("Menor que: " + numeros.get(impar));
            intercambiar(numeros, par, impar);
            System.out.println("Lista modificada");
            mostrarLista(numeros);
        }
    }
    
    /**
     * Rellena la lista con números enteros introducidos por el usuario.
     */
    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner scanner = new Scanner(System.in);
        
        String respuesta;
        int numero;
        
        do {
            System.out.println("Introduce un numero");
            numero = scanner.nextInt();
            
            lista.add(numero);
            scanner.nextLine();  // Limpiar buffer de entrada
            
            System.out.print("Deseas introducir otro numero (s/n)");
            respuesta = scanner.nextLine();
        }while(respuesta.equalsIgnoreCase("s"));
        
        scanner.close();  // Cerrar recurso
    }
    
    /**
     * Muestra por consola todos los elementos de la lista.
     */
    public static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("Lista: ");
        
        for(int n : lista) {
            System.out.println(n);
        }
    }
    
    /**
     * Busca y devuelve el índice del número par más grande de la lista.
     */
    public static int indiceMayorPar(ArrayList<Integer> lista) {
        int indice = 0;
        
        // Buscar primer número par
        while(indice < lista.size() && lista.get(indice) % 2 != 0){
            indice++;
        }
        
        if(indice == lista.size()){
            return -1;  // No hay pares
        }
        
        // Recorrer para encontrar el mayor par
        for(int i = indice + 1; i < lista.size(); i++){
            int valor = lista.get(i);
            if(valor % 2 == 0 && valor > lista.get(indice)){
                indice = i;
            }
        }
        
        return indice;  // Retorna la posición, no el valor
    }
    
    /**
     * Busca y devuelve el índice del número impar más pequeño de la lista.
     */
    public static int indiceMenorImpar(ArrayList<Integer> lista) {
        int indice = 0;
        
        // Buscar primer número impar
        while(indice < lista.size() && lista.get(indice) % 2 == 0){
            indice++;
        }
        
        if(indice == lista.size()){
            return -1;  // No hay impares
        }

        // Recorrer para encontrar el menor impar
        for(int i = indice + 1; i < lista.size(); i++){
            int valor = lista.get(i);
            if(valor % 2 != 0 && valor < lista.get(indice)){
                indice = i;
            }
        }
        return indice;  // Retorna la posición, no el valor
    }
    
    /**
     * Intercambia dos elementos de la lista según sus índices.
     */
    public static void intercambiar(ArrayList<Integer> lista, int i, int j){
        int aux = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, aux);
    }
}