
import java.util.Scanner;

public class Ejercicio_3 {
	
	static final int kSecreto = 241;

	public static void main(String[] args) {
		
		int valor = 0;
		
		Scanner teclado = new Scanner(System.in);
		
			System.out.print("Introduce un numero cualquiera para ver si coincide con el numero secreto: ");
		
				valor = teclado.nextInt();
				
				teclado.close();
					
			if(valor == kSecreto) {
				
				System.out.println("Has acertado!");
				
			}else {
				
				System.out.println("Numero fallido, GAME OVER");
			}
			
	 }
	
}