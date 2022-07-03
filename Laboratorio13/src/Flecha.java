import javax.swing.JOptionPane;
//Se crea la clase Flecha 

public class Flecha 
//En esta clase se desarrollara la logica del sistema,en ella se evidencia el uso de la POO para modularizar nuestro sistema.
{
	//Se crean los atributos; longitud y color

	int longitud;
	String color;

	//Creamos los constructores llamados Flecha.
	//Estos constructores tienen la función de «Construir» nuestro sistema, 
	//o darle los valores iniciales a los atributos del objeto Flecha.

	public Flecha() 
	{
		//Se le pide al usuario que ingrese la longitud de la flecha por medio de un imput, y el color queda por defecto.
		longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha"));
		color = "negro";
	}
	
	public Flecha(int longitud,String color)
	{
		this.longitud= longitud;
		this.color= color;
	}
	
	//Se crea el metodo imprimirEspacio el cual esta encargado de imprimir los espacios entra las flachas
	public void imprimirEspacio() 
	{
		System.out.println();
	}
	
	
	//Creamos el metodo costruirFlecha el cual esta encargado de como dice su nombre, imprimir cada flecha dependiendo su longitud
	public void construirFlecha()
	{
		//Este for me imprime la flecha del tamaño de la longitud y llama al metodo imprime para poner su color
		for (int i = 0; i < longitud; i++) {
			imprime("-");
		}
		imprime(">");
	}
	
	//Este metodo me imprime las flechas y sus colores
	private void imprime(String simbolo) 
	{
		if (color.equals("negro")) {
			System.out.print(simbolo);
		}else {
			//se usa un mensaje de error para simular el color de la flecha, para eso se hace uso este ciclo
			System.err.print(simbolo);
		}
	}
}
	
	


