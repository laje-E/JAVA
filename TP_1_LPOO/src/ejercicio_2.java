
public class ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=50;i<=100;i++) {    //se inicia el ciclo for del 50 al 100 para ver que valores son primos
			System.out.println("");
			int no_primo = 0;
			int j=2;				  //j se va a encargar de explorar todas las posiciones hasta llegar a i-1
			
			do {					  //este ciclo do se hace para que se pueda aumentar j hasta llegar a i-1
				
				if(i%j == 0) {	      //se verifica el resto, si es 0 el numero NO es primo
					no_primo++;
					System.out.println("el divisor de " + i + " es: " + j); //En caso de que no sea primo, se muestran todos los posibles divisores
																			//Mostrandolos mediante el aumento de j hasta i-1
				}
				j++;
			}while (j<i);			  //se asegura de que j llegue a uno antes de i
		
			if (no_primo >= 1) {
				System.out.println("no es primo");
			}
			else if (no_primo == 0) {
				System.out.println("es primo");
			}
		}
	}

}
