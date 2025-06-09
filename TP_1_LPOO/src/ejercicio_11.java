package tp1;

import java.util.Scanner;
public class ejercicio_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int año;
		System.out.println("ingrese el anio del que desea saber si es bisiesto");
		año = scanner.nextInt();
		int cont_bisiesto = 0;		//se hace un contador para los bisiestos para saber cual de las dos opciones se va a imprimir
		if (año % 4 == 0) {			//si es divisible por 4 se le va a sumar 1 al contador
			if (año % 100 == 0) {
				if (año % 400 == 0) {	//si es divisible por 100 y por 400 se le va a sumar 1 al contador
					cont_bisiesto++;
				}
				else {
					cont_bisiesto--;	//pero si es divisible por 100 y no por 400 se le va a restar 1 al contador, haciendo que luego quede 0.
				}
			}
			cont_bisiesto++;
		}
		if (cont_bisiesto > 0) {	//si se cumple que el contador es mayor a 0 se imprime lo siguiente
			System.out.println("El anio ingresado es bisiesto");		//se imprime la primera opcion
		}
		else {						//sino se imprime lo otro
			System.out.println("El anio ingresado no es bisiesto");		//se imprime la segunda
		}
		
		scanner.close();
	}

}
