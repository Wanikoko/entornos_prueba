
import java.util.Scanner;
public class Ejercicio_24 {

	public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
	
			int n = 0;
			
			System.out.println("***********************");

			System.out.print("Introduce un numero: ");
			
			while(!teclado.hasNextInt()){
				
				System.out.print("Introduce un numero entero: ");
				teclado.next();
				
			}
	
			n = teclado.nextInt();
			
			teclado.close();
			
			while(n > 0) {
				
				for (int i = 1; i <= n ; i++) {	
					
		            System.out.print(i + " ");
		            
				  }
				            
	            System.out.println();
	            n--;
			}
			
	  }
	
}