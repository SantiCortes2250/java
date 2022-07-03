import javax.swing.JOptionPane;
//1. Aplicación secuencial usando una sola clase sin métodos.

//se crea una clase principal en esta caso llamada: Aplicacion

public class Aplicacion 
{
	//el método main desarrolla toda la lógica necesaria para resolver el problema.
	public static void main ( String args[] )
	
	{
		// Se crean los atributos para despues ser llamados y ejecutados, 
		//hay un atributo String(cadena) que resive cadena de caracteres y 3 double(ladoA, ladoB, resultado) que resiven enteros o decimales
		String cadena;
		double ladoA;
		double ladoB;
		double resultado;
		
		//Se llama el atributo cadena, el cual contiene un Input,
		//que me dice cuales son los valor que tengo que ingresar por consola
		cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado A: ");
		ladoA = Double.parseDouble( cadena );
		
		//los atributos (ladoA y ladoB), me guardan el dato anteriormente ingresado para despues ser ejecutado o mostrado.
		
		cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado B: ");
		ladoB = Double.parseDouble( cadena );
		
		//el atributo resultado me crea la operacion(ladoA*ladoB), la cual se ejecutara y mostrara por consola.
		resultado = ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado );
	
	}
	
}// Fin de la clase Aplicacion

