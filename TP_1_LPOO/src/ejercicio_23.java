package tp;

import java.util.Scanner;
public class ejercicio_23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] ciudades = {"CABA", "Rosario", "Miramar", "Rawson", "Madryn"};		//se declara el array de strings con las ciudades
		
		String busqueda;
		System.out.println("ingrese una ciudad para buscar");
		busqueda = scanner.nextLine();
		int cont_busqueda = 0;			//se genera un contador de la busqueda, donde si vale 0 significa que no se encontro la ciudad buscada
		
		for(String ciudad:ciudades) {					//ciudad va a explorar todas las posiciones de "ciudades"
			if(ciudad.compareTo(busqueda) == 0) {		//compara el string ciudad, que es una de las 5 ciudades, con la busqueda, si son iguales da 0
				System.out.println("se encontro la ciudad " + busqueda);	
				cont_busqueda++;
			}
		}
		if (cont_busqueda == 0) {	//en caso de que con_busqueda valga 0 significa que no se encontro la ciudad buscada
			System.out.println("no se encontro la ciudad buscada");
		}

	}

}
