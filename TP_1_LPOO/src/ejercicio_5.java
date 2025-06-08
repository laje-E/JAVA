package tp1;

import java.util.Scanner;
public class ejercicio_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		do {
		System.out.println("ingrese el numero del que quiere tener la tabla de multiplicar (debe ser del 1 al 10)");
		numero = scanner.nextInt();
		}while(numero < 1 || numero > 10); //se hace esta verificacion para que el usuario no ingrese un numero erroneo. 
										   //en caso de que lo ingrese vuelve a mostrar el mensaje para que ingrese un numero.
		int n = 10;
		int i = 1;
		int tabla;
		while(i <= n) {					  //se hace un ciclo para que la tabla vaya aumentando en 1. 
										  //para poder asi mostrar todos los valores del 1 al 10 inclusive
			
			tabla = numero * i;			  //los valores de la multiplicacion se van a guardar en una variable separada al numero
			System.out.println(i + "= | " + tabla + " |");  //los resultados se van imprimiendo durante el ciclo while
			i++;
		}
	}

}
