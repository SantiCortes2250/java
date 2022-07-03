import javax.swing.JOptionPane;

public class Dias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JOptionPane.showMessageDialog(null, "Bienvenido");
		JOptionPane.showMessageDialog(null, "ESTOS SON LOS CODIGOS DEPENDIENDO EL DIA:\"\r\n"
				+ "				+ \"1= LUNES,\"\r\n"
				+ "				+ \"2= MARTES, \"\r\n"
				+ "				+ \"3= MIERCOLES, \"\r\n"
				+ "				+ \"4= JUEVES, \"\r\n"
				+ "				+ \"5= VIERNES, \"\r\n"
				+ "				+ \"6= SABADO, \"\r\n"
				+ "				+ \"7= DOMINGO\\");
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del dia"));
		
		switch(cod) {
        case 1: JOptionPane.showConfirmDialog(null, "LUNES");
        break;
                
        case 2: JOptionPane.showConfirmDialog(null, "MARTES");
        break;
        
        
        case 3: JOptionPane.showConfirmDialog(null, "MIERCOLES");
        break;
        
        case 4: JOptionPane.showConfirmDialog(null, "JUEVES");
        break;
        
        case 5: JOptionPane.showConfirmDialog(null, "VIERNES");
        break;
        
        case 6: JOptionPane.showConfirmDialog(null, "SABADO");
        break;
        
        case 7: JOptionPane.showConfirmDialog(null, "DOMINGO");
        break;
        
        default: JOptionPane.showMessageDialog(null, "Ingrese el codigo correcto del dia que desea");
              

	}

 }
}
