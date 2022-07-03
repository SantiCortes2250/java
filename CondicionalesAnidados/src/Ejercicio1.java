import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		
		/*1. Algoritmo que ingrese un número y si es negativo lo convierta a positivo y lo
imprima, de lo contrario lo imprime normalmente.*/
	{
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
		
		if (num < 0) {
			System.out.println(num=num-(num*2));
			
		}
		
		else if(num > 0) {
			System.out.println(num);
		}
		

	
	}

}
