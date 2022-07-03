import javax.swing.JOptionPane;
public class Condicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bienvenido al Calculador de IMC");
		String nombre = (JOptionPane.showInputDialog("Ingrese su Nombre"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Peso"));
		double talla = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Talla"));
		double IMC = peso / (talla*talla);
		
		System.out.println("El IMC es:" + IMC);
		
		if(IMC<18) {
			System.out.println(nombre + "Usted presenta Anorexia");
		}
		else if(IMC >=18 && IMC <20) {
			System.out.println("Usted presenta Delgadez");
		}
		
		else if(IMC >=20 && IMC <27) {
				System.out.println("Usted presenta Normalidad en su IMC");
		}
				
	    else if(IMC >=27 && IMC <30) {
					System.out.println("Usted presenta Obesidad(Grado 1)");
			
		}
	    else if(IMC >=20 && IMC <35) {
			System.out.println("Usted presenta Obesidad(Grado 2)");
	
       }
	    else if(IMC >=35 && IMC <40) {
			System.out.println("Usted presenta Obesidad(Grado 3)");
	
       }
	    else if(IMC <=40) {
			System.out.println("Usted presenta Obesidad Morbida");
	
       }
		
		
		


	}

}
