import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int edad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
		String cedula=JOptionPane.
				showInputDialog("Presenta cedula? (SI)(NO)");
		
		if (edad>=18 && cedula.equalsIgnoreCase("si")) {
			System.out.println("La persona es mayor de edad, Puede entrar");
		}
		
		else {
			System.out.println("La persona es menor de edad, No puede entrar");
		}
			

		}
}
		