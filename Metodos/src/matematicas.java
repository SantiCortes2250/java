public class matematicas {
	
	public int sumar(int num1, int num2) {
			
		int suma = num1 + num2; 

		return suma;
	}
	
	public void restar(int num1, int num2) {
		
		int resta = num1 - num2;
		System.out.println(resta);
	}
	
	public int multiplicar(int num1, int num2) {
		
		int multiplicacion = num1 * num2;
		System.out.println(multiplicacion);
		return multiplicacion;
	}
	
	public void dividir(int num1, int num2) {
		double division=0;
		if (num2>0) {
			division = num1 / num2;
			System.out.println(division);
		}else {
			System.out.println("Division por cero, ingrese otro valor");
		}
	}
	

}
