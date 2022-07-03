import javax.swing.JOptionPane;

// crear objetos
// llamar metodos
public class principal {
	public static void main(String[] args) {
		System.out.println("Estoy en Principal");
		matematicas objeto1 = new matematicas(); //creacion objeto
		procesos misProcesos=new procesos();
		
		String menu="1. Sumar \n";
		menu+="2. Restar \n";
		menu+="3. Multiplicar \n";
		menu+="4. Dividir \n";
		menu+="5. Salir\n";
		
		int opcion =0;
		
		do {
			opcion = Integer.parseInt(JOptionPane.
					showInputDialog("Elija la opcion deseada: \n"+menu));
			
			misProcesos.iniciar(opcion,objeto1);
		} while (opcion!=5);
		
	}


}
