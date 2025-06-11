package tp;

import java.util.Scanner;
public class ejercicio_25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		do {
		System.out.println("ingrese que operacion desea realizar: 1-suma | 2-resta | 3-multiplicacion | 4-division | 0-salir");
		opcion = scanner.nextInt();
		double numero_1, numero_2;
		System.out.println("ingrese el primer numero (el que va a ser sumado, restado, multiplicado o dividido)");
		numero_1 = scanner.nextInt();
		System.out.println("ingrese el segundo numero");
		numero_2 = scanner.nextInt();
		double resultado = 0;
		switch(opcion) {	//se hace un switch para poder filtrar por las diversas opciones
		case 1:
			resultado = numero_1 + numero_2;	//se hace la operacion solicitada
			System.out.println("el resultado de la suma es: " + resultado);	//y se muestra el resultado
			//asi para todos los case
			break;
		
		case 2:
			resultado = numero_1 - numero_2;
			System.out.println("el resultado de la resta es: " + resultado);
			break;
		
		case 3:
			resultado = numero_1 * numero_2;
			System.out.println("el resultado de la multiplicacion es: " + resultado);
			break;
		
		case 4:
			resultado = numero_1 / numero_2;
			System.out.println("el resultado de la division es: " + resultado);
			break;
		
		case 0:
			System.out.println("Saliendo del programa... ");
			break;
		
		default:
			System.out.println("ERROR: no se encontro la opcion deseada");
			break;
		
		}
		}while(opcion != 0);	//sale del do while si la opcion es 0 = salir
		scanner.close();

	}

}
