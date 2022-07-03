import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	
	/*
	 * 
	 */
	
	
	//Estudiante est1;
	ArrayList<Estudiante> estudianteList;
	int contGanan,contPierden,contRecupera;
	public Procesos() {
		
		estudianteList=new ArrayList<Estudiante>();
		
		System.out.println("Ingresa al constructor sin parametro");
		String continua="";
		
		do {
			llenarDatos();
			continua=JOptionPane.showInputDialog("Ingrese si para ingresar otro estudiante");
		} while (continua.equalsIgnoreCase("si"));
		
		imprimirInformacion();	
	}
	
	
	public void llenarDatos() {
		
			Estudiante est1=new Estudiante();
			
			est1.doc=JOptionPane.showInputDialog("Ingrese el documento");
			est1.nombre=JOptionPane.showInputDialog("Ingrese el nombre");
			est1.n1=obtenerNota("nota 1");
			est1.n2=obtenerNota("nota 2");	
			est1.n3=obtenerNota("nota 3");
			
			estudianteList.add(est1);
		}
	
	public double obtenerNota(String numero) {
		double nota=0;
		
		do {
			nota=Double.parseDouble(JOptionPane.
					showInputDialog("Ingrese la "+numero));
			
			if (nota<0 || nota>5) {
				JOptionPane.showMessageDialog(null, ""
						+ "La nota está fuera de rango, ingrese nuevamente");
			}
		} while (nota<0 || nota>5);
		
		return nota;
	}
	
	public void imprimirInformacion() {
		
		for (int i = 0; i < estudianteList.size(); i++) {
			Estudiante est=estudianteList.get(i);
			est.identificarse();
			calcularPromedio(est);
			//estudianteList.get(i).identificarse();
		}
		
	}
	
	public void calcularPromedio(Estudiante est1) {
		double prom=(est1.n1+est1.n2+est1.n3)/3;
		est1.promedio=prom;
		if (prom>=3.5) {
			est1.resultado="GANA LA MATERIA";
			contGanan++;
		}else {
			if (prom>2) {
				est1.resultado="PIERDE PERO PUEDE RECUPERAR";
				contRecupera++;
			}else {
				est1.resultado="PIERDE LA MATERIA, SIN RECUPERACIÓN";
				contPierden++;
			}
		}
		
		est1.imprimirResultados();
		
	}

}
