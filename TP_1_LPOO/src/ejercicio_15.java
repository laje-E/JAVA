package tp;

import java.util.Scanner;
public class ejercicio_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int saldo = 1000;
		int opcion = 0;
		do{
		int monto = 0;
		System.out.println("ingrese que opcion desea realizar:  1=deposito | 2=retiro | 3=consulta de saldo | 0=salir"); 
		//se genera un menu con las diversas opciones que puede realizar el cliente 	
		opcion = scanner.nextInt();
		
		switch(opcion) {	//se va a filtrar por el valor de la opcion, que va desde 0 a 3
		case 1:
			System.out.println("ingrese el monto que desea depositar");		//cuando se deposita se ingresa el monto solicitado al saldo de la cuenta
			monto = scanner.nextInt();
			saldo += monto;
			System.out.println("el saldo con el monto ingresado es: " + saldo); //se devuelve el saldo sumado
			break;
		
		case 2:
			if (saldo <= 0) {
				System.out.println("ERROR: no puede retirar dinero ya que esta cuenta no tiene fondos");	
				//en caso de que el saldo sea menor o igual a 0 muestra este mensaje
			}
			else {
				System.out.println("ingrese el monto que desea retirar");		//cuando se retira, se extrae el monto solicitado al saldo de la cuenta
				monto = scanner.nextInt();
				saldo -= monto;
				System.out.println("el saldo menos el monto ingresado es: " + saldo);	//muestra el saldo con el monto extraido
			}
			break;
		
		case 3:
			System.out.println("el saldo de esta cuenta es: " + saldo);			//devuelve cuanto dinero tiene de saldo
			break;
		
		case 0: 
			System.out.println("Saliendo del programa...");
			break;
			
		default:
			System.out.println("ERROR: opcion no encontrada");
		}
		
		}while(opcion != 0);
		scanner.close();
	}

}
