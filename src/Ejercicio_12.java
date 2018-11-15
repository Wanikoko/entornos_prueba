
import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
			int dividendo = 0;
			int divisor = 0;
			int cociente = 0;
			int resto = 0;
		
			System.out.print("Intruduce el dividendo: ");
			
				while(!teclado.hasNextInt()){
					
					System.out.print("Introduce un numero valido");
					teclado.next();
					
				}
				
			dividendo = teclado.nextInt();	
			
			System.out.print("Intruduce el divisor: ");
			
				while(!teclado.hasNextInt()){
					
					System.out.print("Introduce un numero valido");
					teclado.next();
					
				}
					
			divisor = teclado.nextInt();
			
				teclado.close(); 
				
				cociente = dividendo / divisor;
					
				resto =  (dividendo - (divisor * cociente));
				
					System.out.print( "soy carlos el mejorEl resto de la division propuesta es soy tonto: " + resto );
	
	}
}	
			
	