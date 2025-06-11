package tp;

import java.util.Scanner;
public class ejercicio_21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};		//se inicializa el array de numeros
		int x;
		System.out.println("Ingrese un numero X");
		x = scanner.nextInt();
		int cont_mayor = 0;
		for (int numero:numeros) {		//el for each se va a encargar de recorrer todos los espacios de "numeros" yendo del 10 al 100
			if (numero > x) {			//se va a comparar todos los valores de numeros, que en cada iteracion figuran como numero ya que va aumentando dependiendo de los espacios de "numeros".
				cont_mayor++;			//si se cumple la condicion de que "numero" es mayor a "x" se va a aumentar en 1 el contador
			}
		}
		System.out.println("la cantidad de numeros mayores a X es: " + cont_mayor);		//se muestran todos los valores mayores a x
		scanner.close();
	}

}
