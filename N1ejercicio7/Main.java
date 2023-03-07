package tasca8.N1ejercicio7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Object> lista = new ArrayList<>();
		
		lista.add("enero");
		lista.add(12);
		lista.add(3);
		lista.add("noviembre");
				
		lista.sort(Comparator.comparing(a -> a.toString().length()).reversed());
		lista.forEach(System.out::println);
	}

}
