import javax.swing.JOptionPane;
//2. Aplicación usando una clase y métodos.

//se crea una clase principal en esta caso llamada: Aplicacion1
public class Aplicacion1 
{

	// se crean dos métodos encargados de realizar la lógica para resolver el problema, en este caso: ingresarDatos y calcularArea
	public static void main( String args[] ) 
		 
	{
		//Se crean dos atributos double, los cuales reciben numeros enteros y decimales
		double ladoA;
		double ladoB;
		// Se llaman los atributos que contienen el metodo ingresarDatos, las cuales piden que se ingrese cada lado
		ladoA = ingresarDatos ( "Ingrese la longitud del lado A: ");
		ladoB = ingresarDatos ( "Ingrese la longitud del lado B: ");
		
		//Se llama el metodo calcularArea, el cual contiene el ladoA y ladoB, que despues seran ejecutados por medio de una operacion
		calcularArea ( ladoA, ladoB );
	}
		
	//Se crea el metodo ingresarDatos, como dice su nombre sera el encargado se recibir datos
		public static double ingresarDatos ( String mensaje )
		{
			//Se crean los atributos cadena y valor
			String cadena;
			double valor;
			
			//Se llama el atributo cadena, el cual contiene un Input,
			//que me dice cuales son los valor que tengo que ingresar por consola
			cadena = JOptionPane.showInputDialog(null, mensaje);
			//el atributo valor contiene el atributo cadena
			valor = Double.parseDouble ( cadena );
			
			//retorno el valor
			return valor;
		}
		
		//Se crea el metodo calcularArea, esta metodo esta encargado de realizar una operacion la cual me arroje el resulatado del area.
		public static void calcularArea ( double a, double b )
		{
			//Creo la variable resultado
			double resultado;
			
			//Llamo la variable resultado, la cual me crea una operacion de (a * b)
			resultado = a * b;
			
			//Muestro por consola el resultado final.
			JOptionPane.showMessageDialog(null, "El resultado es: " + resultado );
		}
		}// Fin de la clase Aplicacion1 



