import javax.swing.JOptionPane;
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double descuento = 0;
		double sueldoActual = 0;
		double porcentajeDescuento = 0;
		String preg;
		
		
		String menu ="ESTRATO\n";
		menu+="1. Estrato 1 y 2 \n";
		menu+="2. Estrato 3 y 4\n";
		menu+="3. Estrato 5\n";
		menu+="4. Estrato 6\n";
		menu+="Seleccione su estrato\n";
		
		JOptionPane.showMessageDialog(null, menu);
		do {
	    sueldoActual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de su sueldo"));
		int estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estrato"));

			
		switch (estrato) {
		case 1:
			porcentajeDescuento = 0.02; break;
		case 2:
			porcentajeDescuento = 0.04; break;
		case 3:
			porcentajeDescuento = 0.08; break;
		case 4:
			porcentajeDescuento = 0.010; break;
			
		default: System.out.println("Ingrese los valores correctos");
			break;
		}
		
		descuento = sueldoActual * porcentajeDescuento;
		
		System.out.println("Su estrato es de " + estrato + ", por lo tanto se descuento es de:" + descuento);
		preg = JOptionPane.showInputDialog("Ingrese si para seguir calculando: ");
	}while(preg.equals("si"));
		
		
			
			
			
		}

	}



