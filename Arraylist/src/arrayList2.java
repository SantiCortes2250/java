
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class arrayList2 {

	public static void main(String[] args)  {
		ArrayList<String> listaNombres=new ArrayList<String>();
		listaNombres.add("Andrea");
		listaNombres.add("Viky");
		listaNombres.add("Cris");
		listaNombres.add("Diego");
		listaNombres.add("Oscar");
		listaNombres.add("Felipe");
		listaNombres.add("Juan");
		System.out.println();
		System.out.println(listaNombres);
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre que desea buscar");
		//Con esta forma recorremos cada elemento de la lista preguntando por cada posición.
		System.out.println("Forma1");
		for (int i = 0; i < listaNombres.size(); i++) {
		if (nombre==listaNombres.get(i)) {
		System.out.println("El nombre "+nombre+" se encuentra en la posición "+i);
		}
		}
		//Con esta forma validamos directamente usando "contains"
		//y usando la función indexOf obtenemos el indice del mismo
		System.out.println("\nForma2");
		if (listaNombres.contains(nombre))
		System.out.println("El nombre "+nombre+" si está, se "
		+ "encuentra en la pos "+listaNombres.indexOf(nombre));
		else
		System.out.println("El nombre No está en la lista");
		}


}
