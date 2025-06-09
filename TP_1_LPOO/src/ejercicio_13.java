package tp1;

import java.util.Scanner;
public class ejercicio_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcion;
		do {
		System.out.println("ingrese que conversion quiere realizar: 1=celsius a fahrenheit  o 2=fahrenheit a celsius");		//se le pregunta al usuario que accion quiere realizar
		opcion = scanner.nextInt();
		} while(opcion < 1 || opcion > 2);		// se valida los datos, evitando que el usuario ingrese un valor erroneo.
												// en caso de que lo ingrese se repite la impresion de las opciones
		
		int grados;
		System.out.println("ingrese el valor que quiere convertir");
		grados = scanner.nextInt();
		int conversion;
		
		switch(opcion) {
		case 1:
			conversion = grados * 9 / 5 + 32; 		//se lleva a cabo la conversion
			System.out.println("los " + grados + " Celsius son " + conversion + " Fahrenheit");		//se imprime el valor de la conversion
			break;
			
		case 2:
			conversion = (grados - 32) * 5 / 9;		//se lleva a cabo la conversion
			System.out.println("los " + grados + " Fahrenheit son " + conversion + " Celsius");		//se imprime el valor de la conversion
			break;
		}
		scanner.close();
	}

}
