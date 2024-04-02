package tablas8;

/**
 * Implementa un método Java llamado incrementarValores, el
 * cual recibe una tabla y un valor numérico, y devuelve todos los elementos
 * de la tabla multiplicados por dicho valor, excepto el primero y el último.
 */

public class Ejercicio2 {

	
	public static int[] incrementarValores(int[] tabla, int valor) {
        int[] resultado = new int[tabla.length];
        
        resultado[0] = tabla[0];
        
        for (int i = 1; i < tabla.length - 1; i++) {
            resultado[i] = tabla[i] * valor;
        }
        
        resultado[tabla.length - 1] = tabla[tabla.length - 1];
        
        return resultado;
    }
	public static void main(String[] args) {
        int[] tabla = {1, 2, 3, 4, 5};
        int valor = 2;
        
        int[] resultado = incrementarValores(tabla, valor);
        
        System.out.println("Tabla original: ");
        for (int elemento : tabla) {
            System.out.print(elemento + " ");
        }
        
        System.out.println("\nTabla modificada: ");
        for (int elemento : resultado) {
            System.out.print(elemento + " ");
        }
    }
	
}
