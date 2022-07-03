import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numSemillas = 0;
		double valorSem = 0;
		double costoSem = 0;
		String preg;
		String nom = "";
		String verd = "";
		
		
		
		String menu ="VERDURAS\n";
		menu+="1. Tomate \n";
		menu+="2. Repollo\n";
		menu+="3. Papa\n";
		menu+="4. Cebolla\n";
		menu+="Seleccione que tipo de verdura desea\n";
		
		JOptionPane.showMessageDialog(null, menu);
		
		do {
		
		int verdura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la verdura"));
		
		numSemillas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de semillas"));
		
		if (verdura == 1) {
			verd = "tomate";
			
			String menu1 ="ESCOJA QUE TIPO DE TOMATE DESEA\n";
			menu1+="1. Chonto \n";
			menu1+="2. Ensalada\n";
			menu1+="Seleccione que tipo\n";
			
			JOptionPane.showMessageDialog(null, menu1);
			int tomate = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de tomate"));
			
			if (tomate == 1) {
				valorSem = 15;
				nom = "chonto";
			}
			
			else if (tomate == 2) {
				valorSem = 20;
				nom = "Ensalada";
			}
		}
		
		else if (verdura == 2) {
			valorSem = 10;
			verd = "repollo";
			

		}
		
		else if (verdura == 3) {
			verd = "papa";
			String menu2 ="ESCOJA QUE TIPO DE PAPA DESEA\n";
			menu2+="1. Criolla \n";
			menu2+="2. Pastusa\n";
			menu2+="3. Salentuna\n";
			menu2+="Seleccione que tipo\n";
			
			JOptionPane.showMessageDialog(null, menu2);
			int papa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de papa"));
			
			if (papa == 1) {
				valorSem = 8;
				nom = "criolla";
			}
			
			else if (papa == 2) {
				valorSem = 9;
				nom = "pastusa";
			}
			
			else if (papa == 3) {
				valorSem = 11;
				nom = "salentuna";
			}
		}
		
		else if (verdura == 4) {
			verd = "cebolla";
			String menu3 ="ESCOJA QUE TIPO DE CEBOLLA DESEA\n";
			menu3+="1. Larga \n";
			menu3+="2. De huevo\n";
			menu3+="Seleccione que tipo\n";
			
			JOptionPane.showMessageDialog(null, menu3);
			int cebolla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de cebolla"));
			
			if (cebolla == 1) {
				valorSem = 15;
				nom = "larga";
			}
			
			else if (cebolla == 2) {
				valorSem = 13;
				nom = "de huevo";
			}
			

		}
		
		else if(verdura > 4) {
			System.out.println("INGRESE LOS VALORES CORRECTOS");
		}
		
		
		costoSem = numSemillas*valorSem;
		System.out.println("Usted lleva " + numSemillas + " semillas de "+ verd +" "+ nom + ", El costo total de sus semillas es de "+ costoSem);
		
		preg = JOptionPane.showInputDialog("Ingrese " + "'SI'" + " para seguir calculando: ");
		}while(preg.equalsIgnoreCase("si"));
		
			

			
		}
			
		
    

	
    
  }




