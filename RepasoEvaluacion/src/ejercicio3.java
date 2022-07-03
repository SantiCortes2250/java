import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String[] args) {
		/* Hallar   los   divisores   de   un   entero   positivo   dado   por   el   usuario, 
		esteproceso lo deberá realizar las veces que el usuario decida, para esto debeusar ciclos anidados */
		
		
		String preg;
		do {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

	
		for (int i = 1; i <= a; i++) {
			
			if(a % i == 0) {
				
				System.out.println(i);
				
			}
			
		}


		preg = JOptionPane.showInputDialog("Ingrese si para seguir calculando: ");
		}while(preg.equals("si"));

		

	}


}
