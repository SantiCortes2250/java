// Aplicación orientada a objetos usando 2 clases.BONUS
import javax.swing.JOptionPane;

//Se crea la clase Numeros
public class Numeros {
	//Se crean los atributos, tambien se crean dos contadores,
	//neg = para guardar los numeros negativos y par= para guardar los numeros pares
	
		int numer;
		int i,neg = 0,par= 0;
		
		//Se crea un metodo llamado entrada el cual contiene un for que empiza en 0, tiene un tamaño de 5 
		public void entrada()
		{
			//Este for contiene unas condiciones las cuales si se cumplen, 
			//van guardando la cantidad de datos depediendo si es numero par o negativo, para esto se usan los contadores: par++ y neg ++
			for (int i = 0; i < 5; i++) 
			{
				numer = ingresarDatos("digite 1 numero");
				if(numer%2==0) {
					par++;
				}
				if(numer<0) {
					neg++;
				}
			}
			//Muestro el mensaje por consola
		JOptionPane.showInternalMessageDialog(null, "El numero de numeros pares es: "+par+ "\n"
				+ " y el numero de numeros negativos es: "+neg);
		}
		
		//Creo el metodo ingresar datos el cual pide al usuario el ingreso de datos
		public static int ingresarDatos(String mensaje)
		{
			//Creo los atributos cadena y valor
			String cadena;
			int valor;
			//La pide al usario los datos
			cadena = JOptionPane.showInputDialog(null, mensaje);
			//el atributo valor contiene el atributo cadena
			valor = Integer.parseInt(cadena);
			//Se retorna el atributo valor
			return valor;
		}
}//Fin de la clase Numeros


