package tasca8.N2ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> numeros= new ArrayList<>();
		numeros.add(3);
		numeros.add(55);
		numeros.add(44);
		
		numeros.stream().map(e->(e%2==0 ? "e":"o") + e).forEach(e->System.out.print(e+", "));
		
	}
}
