import javax.swing.JOptionPane;
// Aplicación orientada a objetos usando 2 clases.


//Se crea la clase Entidad
public class Entidad 
//En esta clase se desarrollara la logica del sistema,en ella se evidencia el uso de la POO para modularizar nuestro sistema.
{
	//Se crean dos atributos double privados, ladoA y ladoB
	private double ladoA;
	private double ladoB;
	
	// se crean dos métodos encargados de realizar la lógica, ingresarDatos y calcularArea
	
	//Se crea el metodo ingresarDatos, este metodo esta encargado de pedir los datos correspondientes
	//al usuario para que el los ingrese por consola.
	public void ingresarDatos ()
	{
		//Se crea el atributo cadena
		String cadena;
		
		//Se llama el atributo cadena, el cual contiene un Input,
		//que me dice cuales son los valor que tengo que ingresar por consola
		cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado A: ");
		ladoA = Double.parseDouble( cadena );
		
		//los atributos (ladoA y ladoB), me guardan el dato anteriormente ingresado para despues ser ejecutado o mostrado.
		
		cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado B: ");
		ladoB = Double.parseDouble( cadena );
	}
	
	//Se crea el metodo calcularArea, esta metodo esta encargado de realizar una operacion la cual me arroja el resulatado del area.
	public void calcularArea ()
	{
		//Creo el atributo resultado 
		double resultado;
		
		//El atributo resultado me crea la operacion(ladoA*ladoB), la cual se ejecutara y mostrara por consola.
		resultado = ladoA * ladoB;
		JOptionPane.showInternalMessageDialog(null, "El resulatdo es: " + resultado );
		
	}
}// Fin de la clase Entidad
