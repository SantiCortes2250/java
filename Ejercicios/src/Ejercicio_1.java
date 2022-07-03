import javax.swing.JOptionPane;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bienvenido");
		System.out.println("----------------------------------");
		System.out.println("ESTOS SON LOS CODIGOS DEPENDIENDO EL DIA:"
				+ "1= LUNES,"
				+ "2= MARTES, "
				+ "3= MIERCOLES, "
				+ "4= JUEVES, "
				+ "5= VIERNES, "
				+ "6= SABADO, "
				+ "7= DOMINGO");
		
		
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del dia"));
		
		
		if(cod == 1) {
			System.out.println("LUNES");
		}
		else if(cod == 2) {
			System.out.println("MARTES");
		}
		
		else if(cod == 3) {
				System.out.println("MIERCOLES");
		}
				
	    else if(cod == 4) {
					System.out.println("JUEVES");
			
		}
	    else if(cod == 5) {
			System.out.println("VIERNES");
	
       }
	    else if(cod == 6) {
			System.out.println("SABADO");
	
       }
	    else if(cod == 7) {
			System.out.println("DOMINGO");
	
       }
		
		
		


	}

}
