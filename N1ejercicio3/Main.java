package tasca8.N1ejercicio3;

import java.util.ArrayList;

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
		
//		nombreMeses.forEach((e) -> System.out.println(e));
		
		nombreMeses.stream().forEach(e->System.out.println(e));
		
	}

}
