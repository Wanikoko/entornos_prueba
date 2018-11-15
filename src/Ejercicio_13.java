
import java.util.Scanner;
public class Ejercicio_13 {
	
	static final int kSecreto = 241;

	public static void main(String[] args) {
		
		int valor = 0;
		
			Scanner teclado = new Scanner(System.in);
		
			while (  valor != kSecreto){
				
					System.out.print("Introduce un numero cualquiera para ver si coincide con el numero secreto: ");
													
					while(!teclado.hasNextInt()){
							
							System.out.print("Introduce un numero valido: ");
							teclado.next();
							
					}
						
					valor = teclado.nextInt();	
			
						if(valor == kSecreto) {
							
							System.out.println("Has acertado!");
							
						}else {
							
							System.out.println("Numero fallido");
						}
				
		  }
		  	
			  System.out.println("FIN DEL JUEGO");
			  
			  teclado.close();
				
	 }
	
}