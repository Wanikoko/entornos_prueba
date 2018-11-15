
import java.util.Scanner;
public class Ejercicio_16 {

	public static void main(String[] args) {
		
		int valor = 0;
		
			Scanner teclado = new Scanner(System.in);
			
				do{
					
					if(valor > 10 || valor < 0){	
						
						System.out.println("Numero incorrecto");
					
					}
				
					System.out.print("Introduce un numero entre 0 y 10: ");
													
					while(!teclado.hasNextInt()){
							
							System.out.print("Introduce un numero entero: ");
							teclado.next();
							
					}		
					
					valor = teclado.nextInt();
						
				}while(valor > 10 || valor < 0);
				
				teclado.close();
				
				System.out.print("Numero aceptado");
	
	}
	
}