
import javax.swing.JOptionPane;
public class ejercicio7 {

	public static void main(String[] args) {
		// Investigue en que consiste el algoritmo de ordenamiento burbuja, haga un ejemplo aplicado.
		
		int arreglo[], aux;
		int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros que desea"));
		
		arreglo = new int [cant];
		
			for (int i = 0; i < arreglo.length; i++) {
				arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion "+(i+1)));
			}
			
			
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < (cant-1); j++) {
				if(arreglo[j] > arreglo[j+1]) {
					aux = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+i] = aux;
				}
			}
		}
		System.out.println("arreglo ordenado en forma creciente:");
		for (int i = 0; i<cant; i++) {
			System.out.println(arreglo[i]+ "  -   ");
			
		}
		System.out.println("arreglo ordenado en forma decreciente:");
		for (int i = (cant-1);i>=0;i--) {
			System.out.println(arreglo[i]+ "  -   ");
		


	}
	}

}
