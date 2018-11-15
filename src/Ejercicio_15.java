
import java.util.Scanner;
public class Ejercicio_15 {
	
	static final int kSecreto = 241;

	public static void main(String[] args) {
		
		int valor = 0;
		int contador = 3;
		boolean hasTerminado = false;

			Scanner teclado = new Scanner(System.in);
			
				while(hasTerminado == false) {
					
					System.out.print("Introduce un numero y te dire si coincide con el numero secreto: ");
					
					contador--; 
					
					while(!teclado.hasNextInt()) {
						
						System.out.print("Solo se aceptan numeros enteros: ");
						teclado.next();
					}
					
					valor = teclado.nextInt();
					
					if(valor == kSecreto) {
						
						hasTerminado = true;
						System.out.println("Has acertado!");
						System.out.println("Numero de intentos restantes: " + (contador + 1));
						
					}else if (contador == 0){
						
						hasTerminado = true;
						System.out.println("Has agotado los intentos: GAME OVER ");
						System.out.println("Numero de intentos restantes: " + contador);
						
					}else {
						
							System.out.println("Has fallado: ");
							System.out.println("Numero de intentos restantes: " + contador);
							
						}
							
				}
				
		teclado.close();
			
	}
	
}
