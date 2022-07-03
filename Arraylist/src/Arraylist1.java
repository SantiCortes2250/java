import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Arraylist1 {

	public static void main(String[] args) {
			// 1. Dados dos arreglos de m y n elementos respectivamente, determinar si son guales o no.
			ArrayList<Integer> arraylist1= new ArrayList <Integer>(5);
			ArrayList<Integer> arraylist2= new ArrayList <Integer>(5);
			
			for (int i = 0; i < 5; i++) {
				arraylist1.add(Integer.parseInt(JOptionPane.showInputDialog("Arreglo 1. \n"
						+ "Ingrese el numero en la posicion "+(i+1))));
			}
			System.out.println("Datos del arreglo 1: ");
			for (int i = 0; i < 5; i++) {
				System.out.println("Posicion "+(i+1)+": "+arraylist1.get(i));
			}
			for (int i = 0; i < 5; i++) {
				arraylist2.add(Integer.parseInt(JOptionPane.showInputDialog("Arreglo 2. \n"
						+ "Ingrese el numero en la posicion "+(i+1))));
			}
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("Datos del arreglo 2: ");
			for (int i = 0; i < 5; i++) {
				System.out.println("Posicion "+(i+1)+": "+arraylist2.get(i));
			}
			for (int i = 0; i < 1; i++) {
				if (arraylist1.get(i) == arraylist2.get(i)) {
					System.out.println("Los arreglos son iguales");
				}
				else {
					System.out.println("Los arreglos no son iguales");
				}
				
			}
				

	
	}

}
