package tasca8.N1ejercicio5;


/*
 * Crea una Functional Interface con un método llamado getPiValue() que debe devolver un double.
 * Desde el main() de la clase principal, instancia la interfaz y asignándole el valor 3.1415.
 * Invoca el método getPiValue() e imprime el resultado.
 */
public class Main {
	
	public static void main(String[] args){
		
		InterfaceFuncional ifuncional = () -> 3.1415  ;		
		System.out.println(ifuncional.getPiValue());
	}


}
