package Burbuja;


class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(in);
		
		int arreglo[] = {5,4,3,2,1};
		int vector[] = {25,15,34,2,7,85};
		int array[]= {18,21,8,14,62,20};
		
		
		
		
		System.out.println("Metodo quicksort.");
		Quicksort qui = new Quicksort();
		qui.Quicksort(array, 0, array.length-1);
		
		for(int i=0; i< array.length;i++) {
			System.out.println(array[i]);
		}
		
		
		System.out.println("Metodo burbuja.");
		OrdenamientoBurbuja o = new OrdenamientoBurbuja();
		o.OrdenamientoBurbuja(arreglo);
		
		for(int i=0; i< arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
		
		System.out.println("Metodo insercion.");
		Insercion ins = new Insercion();
		ins.Insercion(vector);
		
		for(int i=0; i<vector.length;i++) {
			System.out.println(vector[i]);
		}
	}

}
