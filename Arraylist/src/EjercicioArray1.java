import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EjercicioArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> listaNombres= new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			listaNombres.add(JOptionPane.showInputDialog("ingrese el nombre en la posicion: " + i));
			
			
		}
		
		System.out.println(listaNombres);
		System.out.println();
		
		
	   for (int i = 0; i < listaNombres.size(); i++) {
		   System.out.println("posicion "+i+" = "+listaNombres.get(i));
		
	}

	}

}
