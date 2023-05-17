package Test;
import java.util.Random;
import java.util.Scanner;

import metodos1.Ackerman;
import metodos1.Burbuja;
import metodos1.Inserccion;
import metodos1.Quicksort;
import metodos1.Seleccion;
import metodos1.Shell;


public class TestMetodos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arreglo[i] = rand.nextInt(100);
        }

        System.out.println("Arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        // Permitir que el usuario elija el tipo de ordenamiento
        System.out.println("Seleccione el tipo de ordenamiento que desea aplicar: ");
        System.out.println("1. Ordenamiento por burbuja");
        System.out.println("2. Ordenamiento por selección");
        System.out.println("3. Ordenamiento por inserción");
        System.out.println("4.Ordenamiento por shell");
        System.out.println("5.Ordenamiento por Ackerman");
        
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();

        // Llamar al método de ordenamiento correspondiente dependiendo de la opción elegida por el usuario
        switch (opcion) {
            case 1:
                Burbuja.burbuja(arreglo);
                break;
            case 2:
                Seleccion.seleccion(arreglo);
                break;
            case 3:
                Inserccion.insercion(arreglo);
                break;
            case 4:
                Shell.shell(arreglo);
                break;
            case 5:
            	
                break;
            default:
                System.out.println("Opción no válida.");

        }
        

        System.out.println("Arreglo ordenado:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
                    
        }
        
    }
}

