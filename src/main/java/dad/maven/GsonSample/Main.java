package dad.maven.GsonSample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Persona p = new Persona();
		
		String nombre, apellidos;
		Integer edad;
		
		System.out.print("Nombre: ");
		nombre = in.nextLine();
		p.setNombre(nombre);
		
		System.out.print("Apellidos: ");
		apellidos = in.nextLine();
		p.setApellidos(apellidos);
		
		System.out.print("Edad: ");
		edad = in.nextInt();
		p.setEdad(edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		in.close();
	}

}
