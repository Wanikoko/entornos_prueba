
//Version propia
import java.util.Scanner;
public class Ejercicio_15B {
	
	static final int kSecreto = 241;

	public static void main(String[] args) {
		
		int valor = 0;
		int contador = 2;
		boolean aciertasNumero = false;
		boolean sinIntentos = false;
		
			Scanner teclado = new Scanner(System.in);
		
				
					System.out.print("Introduce un numero cualquiera para ver si coincide con el numero secreto: ");
													
					while(!teclado.hasNextInt()){
							
							System.out.print("Introduce un numero valido: ");
							teclado.next();
							
					}
					
					valor = teclado.nextInt();
					
					if(valor != kSecreto) {
						
						while(!aciertasNumero && !sinIntentos) {
				
								
									System.out.println("Numero fallido");
									System.out.println("Numero de intentos: " + contador);
									System.out.print("Introduce un numero cualquiera para ver si coincide con el numero secreto: ");
									
									while(!teclado.hasNextInt()){
											
											System.out.print("Introduce un numero valido: ");
											teclado.next();
											
									}
									
									valor = teclado.nextInt();
									
									contador--;
									
									if (valor == kSecreto) {
										
										aciertasNumero = true;
										
									}
									
									if(contador == 0) {
										
										sinIntentos = true;
										
									}
									
								}
						
										teclado.close();
									
								if(aciertasNumero) {
									
									System.out.println("Has acertado!");
									System.out.print("Numero de intentos: " + (contador + 1));
									
								}else {	
									
									System.out.println("GAME OVER");
									System.out.print("Numero de intentos: " + contador);
									
								}
									
					 }else {
					
							System.out.println("Has acertado!");
							System.out.print("Numero de intentos: " + contador);
					 }
					
				}
					
	 }
