package tasca8.N1ejercicio1;

import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<>();
		
		lista1.add("enero");
		lista1.add("febrero");
		lista1.add("marzo");
		lista1.add("abril");
		lista1.add("mayo");
		lista1.add("junio");
		lista1.add("julio");
		lista1.add("agosto");
		lista1.add("setiembre");
		lista1.add("octubre");
		lista1.add("noviembre");
		lista1.add("diciembre");
		
	
		lista1.stream().filter(e->e.contains("o")).forEach(System.out::println);
		
	}
	
}
