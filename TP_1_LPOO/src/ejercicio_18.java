package tp;

import java.util.Scanner;
public class ejercicio_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n; 
		System.out.println("ingrese la cantidad de asteriscos que quiere para el triangulo");	//se ingresa la cantidad de columnas que va a tener
		n = scanner.nextInt();		
		int i = 0;
		String asterisco = "*";		//esta variable va a ser utilizada para imprimir los asteriscos luego
		while (i<n) {				//este while representa cada columna
			
			i++;
			
			int j = 0;
			
			while (j<i){						//este while representa cuantas veces se va a imprimir "*" en cada fila
												// que va desde 0 hasta i, para poder generar esa forma de piramide
				
				System.out.print(asterisco);	//se va a imprimir i veces el asterisco
				j++;
			}
			System.out.println("");
		}
		
		scanner.close();

	}

}
