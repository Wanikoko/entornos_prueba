
import java.util.Scanner;
public class Ejercicio_Actividad_3 {

	public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
	
			int altura = 0;
			int asteriscos = 0;
			int espacios = 0;
			
			System.out.println("***********************");

			System.out.print("Introduce la altura de la piramide invertida: ");
			
			while(!teclado.hasNextInt()){
				
				System.out.print("Introduce un numero entero: ");
				teclado.next();
				
			}
	
			altura = teclado.nextInt();
			
			teclado.close();
			
			asteriscos = (2 * (altura + 1)) -1;
			
			for (int i = 0; i < altura ; i++) {
				
				asteriscos = asteriscos - 2;
				espacios ++;
	
	            for (int j = 0; j < espacios ; j++) {                      
	                System.out.print(" ");           
	            }
	            for (int k = 0; k < asteriscos; k++){
	                System.out.print("*");
	            }
	            
	            System.out.println();
	            
			  }
			
	  }
	
}