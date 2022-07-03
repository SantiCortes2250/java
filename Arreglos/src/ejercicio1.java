import javax.swing.JOptionPane;
public class ejercicio1 {

		public static void main(String[] args) {
			//1. Haga un arreglo que permita almacenar el valor de 5 números enteros y obtenga la sumatoria.
			int array1[];
			array1 = new int [5];
			int suma = 0;
			for (int i = 0; i < array1.length; i++) {
				array1[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor en la posicion "+i));
				suma+= array1[i];
			}
			System.out.println(suma);
		}

}
