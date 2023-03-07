package tasca8.N1ejercicio6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/*
 * Crea una lista con números y cadenas de texto y ordena la lista con las cadenas de más corta a más larga.
 */
public class Main {
	public static void main(String[] args) {
		
		List<Object> lista = new ArrayList<>();
		
		lista.add("enero");
		lista.add(12);
		lista.add(3);
		lista.add("noviembre");
				
		lista.sort(Comparator.comparing(a -> a.toString().length()));
		lista.forEach(System.out::println);
		
	}
}
