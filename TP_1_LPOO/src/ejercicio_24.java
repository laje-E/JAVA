package tp;

import java.util.Scanner;
public class ejercicio_24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		System.out.println("ingrese la longitud que quiere que tenga el array");
		n = scanner.nextInt();
		int i = 0;
		
		int[] numeros = new int[n];
		while(i<n) {	
			System.out.println("ingrese el valor para la posicion " + (i+1));	
			//el for each se puede usar para estas circunsancias, en las que tenemos que recorrer todo un array, pero sin saber la distancia entre cada una de sus posiciones
			//aquie gracias al for each, se van a poder recorrer todas las posiciones sin importar que empiece con un numero grande como 100 y luego con uno pequeño como 2. 
			// se van a recorrer de la forma en la que fueron escritos, sin ninguna alteracion.
			//por ejemplo el for lo usamos cuando sabemos que hay que aumentar de 1 en 1 o de una forma que es igual todo el tiempo 2 a 2 etc.
			//mientras que en el for each va a recorrer todas las posiciones sin seguir un "camino pre fijado" o un aumento constante de la variable.
			numeros[i] = scanner.nextInt(); 
			i++;
		}
		for (int numero:numeros) {
			System.out.println(numero);
		}
		scanner.close();

	}

}
