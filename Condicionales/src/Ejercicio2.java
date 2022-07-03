import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		
		/*Cree un algoritmo que calcule e imprima lo que debe pagar un paciente a un
hospital debido a un tratamiento teniendo como entradas el costo del
tratamiento, el número de días de hospitalización y el costo de los
medicamentos. Cada día de hospitalización cuesta $100000
Tenga en cuenta qué si el paciente es subsidiado se le realizará un descuento
del 10% sobre el valor total del valor a pagar.
Sino, por motivos de cumpleaños de la empresa, tan solo se descontará el 5%;
*/
	{
		
		System.out.println("BIENVENIDO");
		int sub = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si es subsidiado, si no lo es ingrese 2"));
		double trata = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del tratamiento"));
		double medi = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de los medicamentos"));
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias de hospitalizacion"));
		int oper = (dias*100000);
		double total = (trata+medi+oper);
		
		System.out.println("El valor de su tratamiento es de: " + trata);
		System.out.println("El valor de su medicamento es de: " + medi);
		System.out.println("Usted estuvo hospitalizado " + dias + " dias");
		
		if (sub == 1) {  
			System.out.println("Usted es subsidiado, su total a pagar es: "+ total*0.10);
		}
		
		else if (sub == 2) {
			System.out.println("El total a pagar es: "+ total*0.5);
		}
		
		

	}

}
