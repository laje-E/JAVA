import java.util.Scanner;

public class ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.println("ingrese el numero que quiera");
		numero = scanner.nextInt();
		int suma_par = 0;
		int suma_impar = 0;
		int i = 2;
		do {
			suma_par += i;
			i += 2;
		}while(i<=numero);
		int j = 1;
		do {
			suma_impar += j;
			j += 2;
		}while(j<=numero);
		
		System.out.println("la suma de numeros pares hasta " + numero + " es: " + suma_par);
		System.out.println("la suma de numeros impares hasta " + numero + " es: " + suma_impar);
	}

}
