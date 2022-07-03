import javax.swing.JOptionPane;

public class ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z = Integer.parseInt(JOptionPane.showInputDialog("Quieres seguir seguir usando esta aplicacion"));
        
		while(z == 1) {
			JOptionPane.showMessageDialog(null, "Bienvenido");
			JOptionPane.showMessageDialog(null, "Estos son los codigos segun la operacion"
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
			
			
			break;
			
	
			
			
		
		}

	
		}

	}


