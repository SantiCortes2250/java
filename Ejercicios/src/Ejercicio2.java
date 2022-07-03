import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bienvenido");
		System.out.println("----------------------------------");
		System.out.println("ESCOJA QUE TIPO DE OPERACION QUIERE REALIZAR SEGUN SU CODIGO = "
				+ "1= SUMA"
				+ "2= RESTA"
				+ "3= MULTIPLICACION"
				+ "4= DIVISION");
		System.out.println("----------------------------------------------------------------");

		System.out.println("Ingrese los valores para realizar la operacion");
		System.out.println("-----------------------------------------------");
		double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor 1"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor 2"));
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la operacion que requiere"));
		
		
		if(cod == 1) {
			System.out.println(a + b);
		}
		else if(cod == 2) {
			System.out.println(a - b);
		}
		
		else if(cod == 3) {
				System.out.println(a * b);
		}
				
	    else if(cod == 4) {
					System.out.println(a / b);
					
	    }

		
	}
}


