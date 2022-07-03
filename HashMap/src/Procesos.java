
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	
	HashMap<Integer, String> mapa;
	
	int key;
	String nombre;
	int documento;
	String menu;
	int opcion;
	int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas que desea almacenar"));
	
	public Procesos() {
		CrearMapa();
		IngresarDatos();
		menu();
	}
	
	public void menu() {
		String preg ;
		do {
			menu="QUE DESEA HACER?\n";
			menu+="Buscar persona: 1\n";
			menu+="Eliminar persona: 2\n";
			menu+="Imprimir mapa: 3\n";
			JOptionPane.showMessageDialog(null, menu);
			opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea"));
			switch (opcion) {
			case 1:
				BuscarPersona();
				break;
			case 2:
				EliminarPersona();
				break;
			case 3:
				ImprimirMapa();
				break;
			default:
				break;
			}
			preg = JOptionPane.showInputDialog("Desea realizar otra accion?");
		} while (preg.equalsIgnoreCase("si"));
	}
	
	public void CrearMapa() {
		mapa = new HashMap<>();
	}

	public void IngresarDatos() {
		for (int i = 0; i < cant; i++) {
			documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento"));
			
			if (mapa.containsKey(documento)==false) {
				nombre = JOptionPane.showInputDialog("Ingrese el nombre");
				mapa.put(documento, nombre);

			}else {
				JOptionPane.showMessageDialog(null, "Ya existe!, ingreselo nuevamente");
				i--;
			}
		}
	}
	
	public void EliminarPersona() {
		documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento de la persona que quiere eliminar"));
		JOptionPane.showMessageDialog(null,  mapa.get(documento)+" se ha eliminado exitosamente");
		mapa.remove(documento);
		System.out.println("PERSONAS INGRESADAS: ");
		System.out.println(mapa);
	}
	
	public void ImprimirMapa() {
		System.out.println("LA CANTIDAD DE PERSONAS REGISTRADAS FUERON "+cant);
		System.out.println("PERSONAS INGRESADAS: ");
		System.out.println(mapa);
	}
	
	public void BuscarPersona() {
		documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento de la persona que quiere buscar"));
		System.out.println("La persona encontrada fue: ");
		System.out.println(mapa.get(documento));
	}
	
}

