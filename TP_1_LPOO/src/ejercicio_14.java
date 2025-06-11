package tp;

import java.util.Scanner;
public class ejercicio_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		System.out.println("ingrese la cantidad de numeros que quiere ver");
		n = scanner.nextInt();
		
		int[] fibonacci = new int[n];			//se crea un vector donde van a estar todos los valores fibonacci que el usuario desea ver
		int i = 0;
		fibonacci[0] = 0;						//estos valores fibonacci son los iniciales, siempre inicia con 0 y 1
		fibonacci[1] = 1;
		System.out.println("la secuencia fibonacci es: ");
		while (i<=n && i < 2){					//primero se va a hacer un ciclo while separado, ya que en este no se van a sumar los ultimos 2 valores. 
												//solo va a mostrar los primeros 2 valores, osea 0 y 1
			System.out.print("|" +fibonacci [i] + "|");
			i++;
		}
		while (i<=n) {							//se hace este cilco while en el que se van a empezar a sumar los ultimos 2 valores
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];		//se suma i-1 que es un espacio antes de i con i-2 que son 2 espacios antes de i
																//esto representa los dos valores anteriores del que estamos calculando
			System.out.print("|" + fibonacci[i] + "|");
			i++;
		}
		scanner.close();
	}

}
