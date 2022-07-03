
import javax.swing.JOptionPane;
public class arreglo1 {

	public static void main(String[] args) {
		// 1. Dados dos arreglos de m y n elementos respectivamente, determinar si son guales o no.
		int arreglo1 []= new int[5];
		int arreglo2 []= new int[5];
		
		for (int i = 0; i < arreglo1.length; i++) {
			arreglo1[i]=Integer.parseInt(JOptionPane.showInputDialog("Arreglo 1. \n"
					+ "Ingrese el numero en la posicion "+i));
		}
		System.out.println("Datos del arreglo 1: ");
		for (int i = 0; i < arreglo1.length; i++) {
			System.out.println("Posicion "+i+": "+arreglo1[i]);
		}
		for (int i = 0; i < arreglo2.length; i++) {
			arreglo2[i]=Integer.parseInt(JOptionPane.showInputDialog("Arreglo 2. \n"
					+ "Ingrese el numero en la posicion "+i));
		}
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Datos del arreglo 2: ");
		for (int i = 0; i < arreglo2.length; i++) {
			System.out.println("Posicion "+i+": "+arreglo2[i]);
		}
		for (int i = 0; i < 1; i++) {
			if (arreglo1[i] == arreglo2[i]) {
				System.out.println("Los arreglos son iguales");
			}
			else {
				System.out.println("Los arreglos no son iguales");
			}
		}
		
	}

}
