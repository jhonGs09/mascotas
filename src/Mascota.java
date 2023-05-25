import java.util.ArrayList;
import java.util.Scanner;

class Mascota {

	int identificacion;
	String nombre;
	String especie;
	int edad;

	public Mascota(int identificacion, String nombre, String especie, int edad) {

		this.identificacion = identificacion;
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;

	}

	public class IMCArraylist {

		static ArrayList<Mascota> mascotas = new ArrayList<>();

		public static void main(String[] args) {

		
			Scanner scanner = new Scanner(System.in);
			boolean continuar = true;

			while (continuar) {

				System.out.print("Ingrese su numero de ID : ");
				int identificacion = Integer.parseInt(scanner.nextLine());

				System.out.print("Ingrese el nombre : ");
				String nombre = scanner.nextLine();

				System.out.print("Ingrese la especie :");
				String especie = scanner.nextLine();

				System.out.print("Ingrese la edad : ");
				int edad = Integer.parseInt(scanner.nextLine());

				mascotas.add(new Mascota(identificacion, nombre, especie, edad));

				System.out.print("¿Desea agregar otra mascota? (s/n): ");
				String respuesta = scanner.nextLine();

				if (respuesta.equalsIgnoreCase("n")) {
					continuar = false;
				}
				
				
			}
			imprimirTodosLosRegistros(mascotas);
		}
	

	

	private static void imprimirTodosLosRegistros(ArrayList<Mascota> mascotas) {
			for (Mascota mascota : mascotas) {
				System.out.println("---------------------------");
				System.out.println("ID: " + mascota.identificacion);
				System.out.println("Nombre: " + mascota.nombre);
				System.out.println("Especie: " + mascota.especie);
				System.out.println("Edad: " + mascota.edad);
				System.out.println("---------------------------");
			}

		}
	
	
	}
}
