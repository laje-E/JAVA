package tp1;

import java.util.Scanner;
import java.util.Random;
public class ejercicio_8 {

	public static void main(String[] args) {
		Random random = new Random();					//se llama a la funcion random para poder generar un numero aleatorio
		Scanner scanner = new Scanner(System.in);
		
		int numero_random;								//variable en la que se va a almacenar el numero aleatorio
		do {
		numero_random = random.nextInt(101);			//el numero aleatorio va a ir del 0 al 100
		}while (numero_random == 0);					//hago esta condicion para evitar que el numero aleatorio sea 0
		int numero;
		int cont_random = 0;
		do {
			System.out.println("ingrese el numero que cree que es el random");
			numero = scanner.nextInt();
			if (numero < numero_random) {
				System.out.println("EL NUMERO INGRESADO ES MENOR AL RANDOM");
				cont_random ++;
			}
			else if (numero > numero_random) {
				System.out.println("EL NUMERO INGRESADO ES MAYOR AL RANDOM");
				cont_random ++;
			}
			else if (numero == numero_random) {
				System.out.println("FELICITACIONES USTED ADIVINO EL NUMERO!!!");
				cont_random ++;
			}
			else if (numero < 1 || numero > 100) {
				System.out.println("ERROR: el numero no esta dentro del rango de los randoms");
				cont_random ++;
			}
			
		}while(numero != numero_random);
		
		scanner.close();
		
		System.out.println("");
		System.out.println("La cantidad de intentos utilizados fue: " + cont_random);
	}

}
