package tp;

import java.util.Scanner;
public class ejercicio_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		int n = 3;
		int[] lado = new int[n];		//se declara el vector
		while (i<n){
			System.out.println("ingrese el valor del lado " + (i+1));	//se va a ingresar el valor de cada espacio del vector
			lado[i] = scanner.nextInt();
			i++;
		}
		
			if (lado[0] == lado[1] && lado[0] == lado[2] && lado[1] == lado[2]) {	    //si todos los lados son iguales es equilatero
				System.out.println("El triangulo es equilatero");
			}
			else if (lado[0] == lado[1] || lado[0] == lado[2] || lado[1] == lado[2]) {	//si dos lados son iguales es isoceles
				System.out.println("El triangulo es isoceles");
			}
			else if (lado[0] != lado[1] && lado[0] != lado[2] && lado[1] != lado[2]) {	//si no hay lados iguales es escaleno
				System.out.println("El triangulo es escaleno");
			}
		
		scanner.close();
	}

}
