package Burbuja;

public class Insercion {

	
	public void Insercion(int[] vector) {
		
		int aux;
		int cont1,cont2;
		
		for(cont1=1;cont1<vector.length;cont1++) {
			aux=vector[cont1];
			for(cont2=cont1-1;cont2 >= 0 && vector[cont2] > aux; cont2--) {
				vector[cont2+1] = vector[cont2];
				vector[cont2] = aux;
			}
		}
	}
	
}
