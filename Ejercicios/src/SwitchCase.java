import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JOptionPane.showMessageDialog(null, "Bienvenido");
		JOptionPane.showMessageDialog(null, "\"ESCOJA QUE TIPO DE OPERACION QUIERE REALIZAR SEGUN SU CODIGO = \"\r\n"
				+ "				+ \"1= SUMA\"\r\n"
				+ "				+ \"2= RESTA\"\r\n"
				+ "				+ \"3= MULTIPLICACION\"\r\n"
				+ "				+ \"4= DIVISION\"");

		int cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la operacion que requiere"));
		JOptionPane.showMessageDialog(null, "Ingrese los valores para realizar la operacion");
		double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor 1"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor 2"));
        
        switch(cod) {
        case 1: JOptionPane.showConfirmDialog(null, a + b);
        break;
                
        case 2: JOptionPane.showConfirmDialog(null, a - b);
        break;
        
        
        case 3: JOptionPane.showConfirmDialog(null, a * b);
        break;
        
        case 4: JOptionPane.showConfirmDialog(null, a / b);
        break;
        
        default: JOptionPane.showMessageDialog(null, "ingrese el codigo correcto de la operacion que desea");
              
		}

	}

}
