package tablas8;

/**
 * Implementa un método Java llamado calcularModa que
 * calcule la moda de una tabla Java. La moda es el valor con mayor
 * frecuencia que aparece en una colección de datos. Por ejemplo, si
 * tenemos la tabla: {1, 1, 2, 1, 4, 1, 2, 1} la moda es 1.
 */

public class Ejercicio1 {

	public static int calcularModa(int[] tabla) {
        int moda = 0;
        int maxFrecuencia = 0;
        
        for (int i = 0; i < tabla.length; i++) {
            int frecuencia = 0;
            
            for (int j = 0; j < tabla.length; j++) {
                if (tabla[j] == tabla[i]) {
                    frecuencia++;
                }
            } 
            if (frecuencia > maxFrecuencia) {
                moda = tabla[i];
                maxFrecuencia = frecuencia;
            }
        }
        return moda;
    }
	public static void main(String[] args) {
        int[] tabla = {1, 1, 2, 1, 4, 1, 2, 1};
        int moda = calcularModa(tabla);
        System.out.println("La moda de la tabla es: " + moda);
    }
}