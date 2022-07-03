package Trabajadores;

import javax.swing.JOptionPane;

public class Procesos {
	
	public void llenarDatos() {
		
		Trabajadores obj1=new Trabajadores();
		
		obj1.documento= JOptionPane.showInputDialog("Ingrese el documento");
		obj1.nombre= JOptionPane.showInputDialog("Ingrese el nombre");
		obj1.edad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
		obj1.estrato = Integer.parseInt(JOptionPane.showInputDialog(""));
		obj1.Aumento = CalcularAumento(obj1.estrato, obj1.salario);
		obj1.salarioFinal = CalcularSueldoFinal(obj1.Aumento, obj1.salario);

	}
	
	public void CalcularAumento(int estrato, double salario) {
		double aumento = 0;
		double multiplicacion = 0;
		switch (estrato) {
		case 1:{
			aumento = 0.1;
			multiplicacion = salario*aumento;
			break;
		}
        case 2:{
        	aumento = 0.2;
        	multiplicacion = salario*aumento;
			break;
        }
		default:{
			System.out.println("El estrato es invaido");
			break;
		}
		

	}
		return multiplicacion;
	}
	
	public void CalcularSueldoFinal(double Aumento, double salario) {
		
		
	}
	
	


	

}
