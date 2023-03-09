package tasca8.N1ejercicio4;

import java.util.ArrayList;

/*
 * Crea una lista con los nombres de los meses del año.
 *  Imprime todos los elementos de la lista con una lambda.
 * */


public class Main {

	public static void main(String[] args) {
		ArrayList<String> nombreMeses = new ArrayList<>();
		
		nombreMeses.add("enero");
		nombreMeses.add("febrero");
		nombreMeses.add("marzo");
		nombreMeses.add("abril");
		nombreMeses.add("mayo");
		nombreMeses.add("junio");
		nombreMeses.add("julio");
		nombreMeses.add("agosto");
		nombreMeses.add("setiembre");
		nombreMeses.add("octubre");
		nombreMeses.add("noviembre");
		nombreMeses.add("diciembre");

		nombreMeses.stream().forEach(System.out::println);

	}

}
