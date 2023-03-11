package tasca8.N2ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;






public class Main {

	/**
	 * Crea una lista que contenga algunas cadenas de texto y números.

		Ordenalas por:
		Alfabéticamente por el primer carácter. (Nota: charAt(0) devuelve el código numérico del primer carácter)
		Las cadenas que contienen una "e" primero, el resto de cadenas después. Pone el código directamente a la lambda.
		Modifica todos los elementos de la lista que tienen una 'a'. Modifica la 'a' por un '4'.
		Muestra sólo los elementos que son numéricos. (Aunque estén guardados como Strings).
	 */
	
	public static void main(String[] args) {
		
		List<Object> lista = new ArrayList<>();
		lista.add("juan");
		lista.add("estanque");
		lista.add(1234);
		lista.add("Emmanuel");
		lista.add("34");
		lista.add("Juan");
		
		
		System.out.println("Lista alfabéticamente por el primer carácter");
		lista.stream().sorted(Comparator.comparing(e->e.toString().toLowerCase().charAt(0))).forEach(System.out::println);		
		
		System.out.print("");
		
		System.out.println("Las cadenas que contienen una e primero");
		lista.stream().sorted(Comparator.comparing(e->e.toString().charAt(0)=='e').reversed()).forEach(System.out::println);
		
		System.out.println("");
		
		System.out.println("Modifica la 'a' por un '4' de todos los elementos");
		lista.stream().map(e -> e.toString().replace('a', '4')).forEach(System.out::println);
		
		System.out.println("");
		
		System.out.println("Muestra sólo los elementos que son numéricos");
		lista.stream().filter(e -> e.toString().matches("\\d+")).forEach(System.out::println);
		
	}

}
