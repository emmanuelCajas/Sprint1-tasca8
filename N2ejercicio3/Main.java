package tasca8.N2ejercicio3;

public class Main {
	
	
	public static void main(String[] args) {
			
		float a=10f, b=30f;
		
		InterfaceFuncional suma = (x,y)-> x+y;
		InterfaceFuncional resta = (x,y)-> x-y;
		InterfaceFuncional multiplicacion = (x,y)-> x*y;
		InterfaceFuncional division = (x,y)-> x/y;
		
		System.out.println(suma.operacion(a, b));
		System.out.println(resta.operacion(a, b));
		System.out.println(multiplicacion.operacion(a, b));
		System.out.println(division.operacion(a, b));
		
	}
}
