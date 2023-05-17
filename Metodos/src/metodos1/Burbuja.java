package metodos1;

public class Burbuja {
        
	public static int[] burbuja(int []arr){
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-1; j++) {
				
				if (arr[j]>arr[j+1]) {
					int temp= arr[j];
					
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
		}
                
                System.out.println("Arreglo no ordenado");
		return arr;
	}

}
