
// Opcion B del ejercicio

import java.util.Scanner;

public class Ejercicio_19B {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
			int suma = 0;
			int intervalo = 0;
		
		System.out.print("Introduce el intervalo: ");
		
			while(!teclado.hasNextInt()){
				
				System.out.print("Intruduce una intervalo de tipo numeral: ");
				teclado.next();
				
			}
				
			intervalo = teclado.nextInt();	
		
		teclado.close(); 
				
			for (int contador = 0 ; contador <= intervalo ; contador += 3) {
				
				suma = suma + contador;
				
			}
					
			System.out.println("La suma de multiplos de 3 en un intervalo de " + intervalo + " numeros es: " + suma);
			
	}
}