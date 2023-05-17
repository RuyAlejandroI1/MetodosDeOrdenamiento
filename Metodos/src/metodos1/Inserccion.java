package metodos1;

public class Inserccion {

	public static int[] inserccion(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int kei=arr[i];
			int j=1-i;
			
			while (j>=0 && arr[j]>kei) {
				arr[j+1]=arr[j];
				j=j-i;	
			}
			arr[j+1]=kei;
		}
		return arr;
	}

    public static void insercion(int[] arreglo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
