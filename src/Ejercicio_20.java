
import java.util.Scanner;
public class Ejercicio_20 {

	public static void main(String[] args) {
		
		int j = 0;
		int t = 0;
		int resultado = 0;
		
			System.out.print("Que tabla quieres que se haga?: ");
			
			Scanner teclado = new Scanner(System.in);
			
			while(!teclado.hasNextInt()){
				
				System.out.print("Introduce un numero entero: ");
				teclado.next();
				
			}
			
				j = teclado.nextInt();
				
			System.out.print("Introduce el numero maximo multiplicado: ");
				
				while(!teclado.hasNextInt()){
					
					System.out.print("Introduce un numero entero: ");
					teclado.next();
					
				}
				
					t = teclado.nextInt();
				
				teclado.close();
				
				System.out.println("*****************");
				
					for( int i = 0 ; i <= t ; i++ ) {
						
						resultado = j * i;
						System.out.println( j + " x "+ i +" = "+ resultado );
			
					}
					
				System.out.println("*****************");
		
	}

}