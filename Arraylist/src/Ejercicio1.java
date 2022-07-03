
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	public static void main(String[] args) {
		    
		 
		    String nombre;
		    int documento;
			int edad=0;
			int pregProfesion = 0;
			String profesion;
			int guardarMayores=0;
			int guardarMenores=0;
			int CantidadIngresos=0;
			String preg;
			ArrayList<Integer> CantPersonas=new ArrayList<Integer>();
			ArrayList<Integer> MayoresEdad=new ArrayList<Integer>();
			ArrayList<Integer> MenoresEdad=new ArrayList<Integer>();

					

			do {
				nombre=JOptionPane.showInputDialog("Ingrese su nombre");
				documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de documento"));
				edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
				if(edad>=18) {
					guardarMayores++;
				}else {
					guardarMenores++;
				}
				pregProfesion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si tiene una profesion, sino ingrese 2"));
				if (pregProfesion == 1) {
				profesion=JOptionPane.showInputDialog("Ingrese su profesion");
				System.out.println(nombre + " con numero de documento " + documento + ", usted tiene " + edad + " años y su profesion es " + profesion);
				}
				else {
				System.out.println(nombre + " con numero de documento " + documento + ", usted tiene " + edad + " años ");
				}
				System.out.println("******************************************************************************");
				preg = JOptionPane.showInputDialog("Ingrese SI para seguir calculando, NO para salir: ");
				CantidadIngresos++;
			}while(preg.equalsIgnoreCase("si"));
			for (int i = 0; i < 1; i++) {
				CantPersonas.add(CantidadIngresos);			
			}
			System.out.println("La cantidad de personas ingresadas: " + CantPersonas);
			for (int i = 0; i < 1; i++) {
				MayoresEdad.add(guardarMayores);			
			}
			System.out.println("La cantidad de personas mayores de edad es: " + MayoresEdad);
			for (int i = 0; i < 1; i++) {
				MenoresEdad.add(guardarMenores);			
			}
			System.out.println("La cantidad de personas menores de edad es: " + MenoresEdad);
		}
}



