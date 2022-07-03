import javax.swing.JOptionPane;

public class ejercicio2 {

	public static void main(String[] args) {
		/*Dados a y b, enteros positivos, calcular a x b usando únicamente sumas sucesivas.*/
 

		int suma = 0;
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
		
		for (int i = 1; i <= b; i++) {
			
			suma = suma + a;
			
		}
		System.out.println(suma);
		
		
	
	
	
	}

}
