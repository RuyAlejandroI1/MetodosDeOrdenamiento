
package metodos1;

public class Seleccion {
   
	    public static void seleccion(int[] arreglo) {
	        int n = arreglo.length;
	        for (int i = 1; i < n; i++) {
	            int key = arreglo[i];
	            int j = i - 1;
	            while (j >= 0 && arreglo[j] > key) {
	                arreglo[j + 1] = arreglo[j];
	                j--;
	            }
	            arreglo[j + 1] = key;
	        }
	    }

    }
