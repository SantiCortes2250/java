package EjercicioHashmap;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {

	HashMap<Integer, String>mapaCarros;
	
	String key;
	int placa;
	String marca;
	String color;
	String menu;
	int opcion;
	int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de carros que desea almacenar"));
	
	
	public Procesos() {
		CrearMapa();
		IngresarDatos();
		menu();
		
	}
	
	public void menu() {
		String preg ;
		do {
			menu="QUE DESEA HACER?\n";
			menu+="Buscar Carro: 1\n";
			menu+="Eliminar Carro: 2\n";
			menu+="Imprimir Mapa: 3\n";
			JOptionPane.showMessageDialog(null, menu);
			opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea"));
			switch (opcion) {
			case 1:
				BuscarCarros();
				break;
			case 2:
				EliminarCarro();
				break;
			case 3:
				ImprimirMapa();
				break;
			default:
				break;
			}
			preg = JOptionPane.showInputDialog("Ingrese SI para escoger otra opcion?");
		} while (preg.equalsIgnoreCase("si"));
	}
	
	public void CrearMapa() {
		mapaCarros = new HashMap<>();
	}

	
	
	public void IngresarDatos() {
		for (int i = 0; i < cant; i++) {
			placa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la placa del carro"));
			
			if (mapaCarros.containsKey(placa)==false) {
				marca = JOptionPane.showInputDialog("Ingrese la marca del carro");
				color = JOptionPane.showInputDialog("Ingrese el color del carro");
				mapaCarros.put(placa, marca+ "-color: " + color);


			}else {
				JOptionPane.showMessageDialog(null, "Ya existe!, ingreselo nuevamente");
				i--;
			}
		}
		}
	
	public void EliminarCarro() {
		placa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la placa del carro"));
		JOptionPane.showMessageDialog(null,  mapaCarros.get(placa)+ " se ha eliminado exitosamente");
		mapaCarros.remove(placa);
		System.out.println("CARROS INGRESADOS: ");
		System.out.println(mapaCarros);
	}
	
	public void ImprimirMapa() {
		System.out.println("LA CANTIDAD DE CARROS REGISTRADOS FUERON "+cant);
		System.out.println("CARROS INGRESADOS: ");
		System.out.println(mapaCarros);
	}
	
	public void BuscarCarros() {
		placa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la placa del carro"));
		System.out.println("El carro encontrado fue: ");
		System.out.println(mapaCarros.get(placa));
	}

}
