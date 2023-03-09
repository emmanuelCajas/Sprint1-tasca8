package tasca8.N2ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> listaNombres = new ArrayList<>();
		listaNombres.add("Juan");
		listaNombres.add("Ana");
		listaNombres.add("Jose");
		listaNombres.add("Alan");

		listaNombres.stream().filter(e -> e.startsWith("A") && e.length() == 3).forEach(System.out::println);

	}

}
