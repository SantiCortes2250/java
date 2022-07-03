
import javax.swing.JOptionPane;

public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu= "PROMEDIO\n\n";
		menu+="1. Realizar Promedio\n";
		menu+="2. Salir\n";
		
		
		int cod=2;
		do{
			
		cod=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
	    if(cod == 1){
		int nota1 = 0;
		do {
			nota1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ingrese la nota 1"));
			if(nota1< 0 || nota1> 5) {
				JOptionPane.showMessageDialog(null,"Debe ingresar numeros entre 0 y 5,"
						+ " intentenlo nuevamente","ERROR",JOptionPane.WARNING_MESSAGE);
				
			}
			
		}while(!(nota1>= 0 && nota1<= 5));
		
		
		int nota2 = 0;
		do {
			nota2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ingrese la nota 2"));
			if(nota2< 0 || nota2> 5) {
				JOptionPane.showMessageDialog(null,"Debe ingresar numeros entre 0 y 5,"
						+ " intentenlo nuevamente","ERROR",JOptionPane.WARNING_MESSAGE);
				
			}
			
		}while(!(nota2>= 0 && nota2<= 5));
		
		
		int nota3 = 0;
		do {
			nota3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ingrese la nota 3"));
			if(nota3< 0 || nota3> 5) {
				JOptionPane.showMessageDialog(null,"Debe ingresar numeros entre 0 y 5,"
						+ " intentenlo nuevamente","ERROR",JOptionPane.WARNING_MESSAGE);
				
			}
			
		}while(!(nota3>= 0 && nota3<= 5));
	


		
		double prom = (nota1+nota2+nota3)/3;
		
		String mensaje="NOTAS\n";
		
		mensaje+="Nota1="+nota1+"\n";
		mensaje+="Nota2="+nota2+"\n";
		mensaje+="Nota3="+nota3+"\n";
		mensaje+="promedio= "+prom+"\n";
		
		JOptionPane.showMessageDialog(null, mensaje);
		
	    }
		
		}while(cod!=2);
		JOptionPane.showMessageDialog(null,"GRACIAS POR USAR LA APLICACION");
		

		
		
		
	}


	



}
