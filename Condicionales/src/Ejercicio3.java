import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		
		/*Algoritmo que calcule lo que gana un empleado con base a las horas
trabajadas teniendo en cuenta que cada hora se paga a 2000, adicionalmente
se le realiza unos descuentos con respecto a un impuesto de seguridad del
10% sobre su salario.
*/
	
	{
		String nom = (JOptionPane.showInputDialog("Ingrese su nombre"));
		int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
		int pago = 2000;
		double salario = ((hora*pago)/0.10);
		System.out.println("Usted trabajo "+ hora+ " horas");
		
		if (hora == 1) {
			System.out.println("Señor "+ nom + ", Su salario es de: "+ salario);
		}
		
		else if (hora == 2) {
			System.out.println("Señor "+ nom + ", Su salario es de: "+ salario);
		}
		else if (hora == 3) {
			System.out.println("Señor "+ nom + ", Su salario es de: "+ salario);
		}
		else if (hora == 4) {
			System.out.println("Señor "+ nom + ", Su salario es de: "+ salario);
		}
		else if (hora == 5) {
			System.out.println("Señor "+ nom + ", Su salario es de: "+ salario);
		}
		else if (hora == 6) {
			System.out.println("Señor "+ nom + ", Su salario es de: "+ salario);
		}
		
		
		

	}

}
