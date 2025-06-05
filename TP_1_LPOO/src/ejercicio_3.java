import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);									//Declaro un scanner para poder guardar el numero de forma temporal
																					//Es necesario importar java.uti.scanner para trabajar con los mismos
		int numero;
		int no_primo = 0;
		do {																		//Hago un ciclo do while del que no voy a salir hasta que el numero sea primo
			
			System.out.println("ingrese un numero mayor a 100 y que sea primo");   
			numero = scanner.nextInt();												//Hago un scan al numero guardar el valor de la variable y 
																					//asi poder trabajar con el numero mas tarde
			no_primo = 0;
			int i = 2;
			do {
				if (numero%i == 0) {
					no_primo++;
				}
				i++;
			}while (no_primo == 0 && i<numero);										//compruebo si el numero es primo, si no es primo sale directamente
			if (no_primo != 0) {
				System.out.println("ERROR: su numero no es primo");
			}
			if (numero <= 100) {
				System.out.println("ERROR: su numero es menor a 100");
			}
		}while (no_primo != 0 || numero <= 100);
		System.out.println("el numero ingresado es correcto, su numero es: " + numero);
	}

}
