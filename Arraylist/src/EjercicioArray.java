import java.util.ArrayList;
public class EjercicioArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*add = agregar_nuevo_valor
		 * get = obtener_datos
		 * set = cambiar_datos_dependiendo_la_posicion
		 * size= tamaño_de_lista
		 * contains= para_buscar_datos
		 * indexOF= para_buscar_la_posicion_donde_se_encuentra_cada_dato
		 * remove= eliminar_datos
		 * clear= vaciar_lista
		 * 
		 * */
		
		ArrayList<String> listaNombres= new ArrayList<String>();
		
		listaNombres.add("Cristian");
		listaNombres.add("Maria");
		listaNombres.add("Juan");
		listaNombres.add("Santi");
		listaNombres.add("Kevin");
		
		System.out.println(listaNombres);
		
		String nombre = listaNombres.get(2);
		System.out.println(nombre);
		
		
		listaNombres.set(3, "santiago");
		System.out.println(listaNombres);
		
		
		System.out.println("tamaño de la lista: " +listaNombres.size());
		
		
		boolean res=listaNombres.contains("Juan");
		System.out.println(res);
		
		
		System.out.println(listaNombres.indexOf("Juan"));
		
		listaNombres.remove("Maria");
		System.out.println(listaNombres);
				

	}

}
