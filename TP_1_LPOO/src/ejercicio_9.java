package tp1;

import java.util.Scanner;
public class ejercicio_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero_1, numero_2, numero_3;												//se declaran las 3 variables
		System.out.println("ingrese los 3 numeros deseados para ser comparados");		//el usuario ingresa el valor deseado para esas variables
		System.out.println("");
		numero_1 = scanner.nextInt();
		System.out.println("");
		numero_2 = scanner.nextInt();
		System.out.println("");
		numero_3 = scanner.nextInt();
		
		int max = numero_1;				//se le asigna un valor inicial al max, ya que si los numeros son negativos, no me va a dar el numero maximo entre ellos
		int max_num = 1;				//se le asigna un valor inicial

		if (max < numero_2) {			//se compara el valor maximo con otra variable para determinar si realmente es el maximo
			max = numero_2;
			max_num = 2;
		}
		if (max < numero_3) {			//se compara el valor maximo con otra variable
			max = numero_3;
			max_num = 3;
		}
		System.out.println("");
		System.out.println("El maximo valor entre estos 3 numeros es: " + max + " y es el valor n°" + max_num); 
		//el valor maximo, ya comparado con todas las variables, se imprime

	}

}
