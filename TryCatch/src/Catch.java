
public class Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			  alert('Inicio de intentos de prueba');  // (1) <--

			  // ...no hay errores aquí

			  alert('Fin de las ejecuciones de try');   // (2) <--

			} catch (err) {

			  alert('Se ignora catch porque no hay errores'); // (3)

			}

	}

}
