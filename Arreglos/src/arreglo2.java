
import javax.swing.JOptionPane;

public class arreglo2 {

	public static void main(String[] args) {

		/*
		 *  haga un algoritmo que solicite n cantidad de nombres y los almacene en una lista y los imprima, 
		 *  valide si en la lista ingresan el nombre ingresado
		 */
int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de nombres "));
String arreglo1 []= new String[cant];
		
		
for (int i = 0; i < cant; i++) {
	String x = JOptionPane.showInputDialog("Ingrese el nombre");
	arreglo1[i]=x;
	System.out.println(arreglo1[i]);
}
String nombreHallar = JOptionPane.showInputDialog("Ingrese el nombre que quiere consultar: ");	
for (int i = 0; i < arreglo1.length; i++) {
	if (arreglo1[i].equalsIgnoreCase(nombreHallar)) {
		System.out.println("La lista si contiene el nombre "+nombreHallar +", se encuentra en la posicion "+i);
	}else if(arreglo1[i]!=nombreHallar) {
		System.out.println("La lista no contiene el nombre");
}
	
}
	
}

}
