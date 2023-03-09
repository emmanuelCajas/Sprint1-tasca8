package tasca8.N1ejercicio8;

import tasca8.N1ejercicio8.InterfaceFuncionalReverse;

/*
 * Crea una Functional Interface que contenga un método llamado reverse(). Este método debe recibir y debe 
 * devolver un String. En el main() de la clase principal, inyecta a la interfaz creada mediante una lambda,
 *  el cuerpo del método, de manera que vuelva la misma cadena que recibe como parámetro pero al revés. 
 *  Invoca la instancia de la interfaz pasándole una cadena y comprueba si el resultado es correcto.
 */
public class Main {

	public static void main(String[] args) {
		
		InterfaceFuncionalReverse cadena = (e) -> {			
			return new StringBuilder(e).reverse().toString();
		};		
		
		
		
		System.out.println(cadena.reverse("juan"));
		
		
	}

}
