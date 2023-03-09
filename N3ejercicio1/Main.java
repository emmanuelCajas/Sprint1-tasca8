package tasca8.N3ejercicio1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		
		
		ArrayList<Alumno> listaAlumnos = new ArrayList<>();
		listaAlumnos.add(new Alumno("Juan",18,"Java",10));
		listaAlumnos.add(new Alumno("Karina",25,"JavaScript",8));
		listaAlumnos.add(new Alumno("Raul",23,"PHP",4));
		listaAlumnos.add(new Alumno("Maria",22,"PHP",5));
		listaAlumnos.add(new Alumno("Sara",20,"Java",6));
		listaAlumnos.add(new Alumno("Julio",17,"Java",8));// edad>18
		listaAlumnos.add(new Alumno("Carlos",38,"PHP",7));
		listaAlumnos.add(new Alumno("Susan",27,"Java",4));
		listaAlumnos.add(new Alumno("Arturo",37,"JavaScript",4));
		listaAlumnos.add(new Alumno("Susan",40,"JavaScript",5));
		
		listaAlumnos.stream().forEach(e->System.out.println(e.getNombre()+" "+ e.getEdad()));
		
		List<Alumno> lista1 = listaAlumnos.stream().filter(e->e.getCurso()=="PHP").collect(Collectors.toList());
		lista1.stream().forEach(System.out::println);
		
		listaAlumnos.stream().filter(e->e.getNota()>=5).forEach(System.out::println);
		
		listaAlumnos.stream().filter(e->e.getNota()>=5 && e.getCurso()!="PHP").forEach(System.out::println);
		
		listaAlumnos.stream().filter(e->e.getCurso()=="Java" && e.getEdad()>=18).forEach(System.out::println);
		
	}
	
}
