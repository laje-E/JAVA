package tp;

import java.util.Scanner;
import java.util.Random;
public class ejercicio_20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int n;
		System.out.println("ingrese la cantidad de caracteres que desea que tenga su contrasenia");		//le solicito al cliente que indique la longitud de la contraseña
		n = scanner.nextInt();
		String contraseña = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";			//todas las opciones que tiene para escribir la contraseña
		int longitud = contraseña.length();																//la longitud de todos los caracteres que puede tener la contraseña
		int i = 0;
		char caracter_contraseña;
		
		System.out.println("la contraseña es: ");
		while (i<n) {
			caracter_contraseña = contraseña.charAt(random.nextInt(longitud));							//se guarda cada caracter en una variable para luego ser imprimida
			
			System.out.print(caracter_contraseña);														//se imprime cada caracter
			
			i++;
		}
		
		
		scanner.close();

	}

}
