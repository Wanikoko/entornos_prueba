
import java.util.Scanner;
public class Ejercicio_Actividad_1 {

	public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
	
			int numero = 0;
			int total = 0;
			int valorPosicion = 0;
			
			System.out.println("***********************");

			System.out.print("Introduce un numero: ");
			
			while(!teclado.hasNextInt()){
				
				System.out.print("Introduce un numero entero: ");
				teclado.next();
				
			}
	
			numero = teclado.nextInt();
			
			teclado.close();
			
			while(numero!= 0) {
				
				valorPosicion = numero % 10;
				
				total += Math.pow(valorPosicion, 3);
				
				numero = numero /10;
			}
			
			
			System.out.print("La suma de raices de tres de los caracteres del numero introducido es: " + total);	
			
			System.out.println("");
			
			System.out.println("***********************");
			
		}
	
}