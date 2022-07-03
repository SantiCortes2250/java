import javax.swing.JOptionPane;

public class procesos {

	public void iniciar(int opcion,matematicas objeto1) {
		System.out.println("Estoy en procesos!");
		int num1=0,num2=0;
		if (opcion!=5) {
			num1 = Integer.parseInt(JOptionPane
					.showInputDialog("Escriba el primer numero: "));
			num2 = Integer.parseInt(JOptionPane
					.showInputDialog("Escriba el segundo numero: "));
		}
		
		switch (opcion) {
		case 1:
			int suma = objeto1.sumar(num1, num2); //llamado metodo
			JOptionPane.showMessageDialog(null,"La suma es: "+suma);
			System.out.println("La suma es: "+suma);
			break;
			
		case 2:
			objeto1.restar(num1, num2);
			break;
			
		case 3:
			objeto1.multiplicar(num1, num2);
			break;
			
		case 4:
			objeto1.dividir(num1, num2);
			break;
		case 5:
			System.out.println("CHAO!");
			break;
		default:System.out.println("NO es una opción valida");
			break;
		}
		
	}
	
}
