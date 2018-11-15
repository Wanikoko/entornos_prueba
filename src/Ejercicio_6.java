
import java.util.Scanner;

public class Ejercicio_6 {

		public static void main(String[] args) {
			
			double num1 = 0.0;
			double num2 = 0.0;
			double resultado = 0.0;
			int opcion = 0;
			
			Scanner teclado = new Scanner(System.in);
			
				System.out.println("***************************");
				System.out.println("Benvenido a la calculadora: ");
				System.out.println("**************************");
				System.out.println("Introduce dos numeros a operar ");
			
				System.out.print("Primer numero: ");
				
				while(!teclado.hasNextDouble()){
					
					System.out.print("Intruduce una cantidad numeral: ");
					teclado.next();
					
				}
					
				num1 = teclado.nextFloat();
					
				System.out.print("Segundo numero: ");
				
				while(!teclado.hasNextDouble()){
					
					System.out.print("Intruduce una cantidad numeral: ");
					teclado.next();
					
				}
					
				num2 = teclado.nextDouble();
				
				System.out.println("**************************");
				System.out.println("Benvenido a la calculadora");
				System.out.println("**************************");
				System.out.println("Elije el tipo de operacion a aplicar");
				System.out.println("1.Suma");
				System.out.println("2.Resta");
				System.out.println("3.Multiplicacion");
				System.out.println("4.Division");
				
				while(!teclado.hasNextInt()){	
					
					System.out.print("Intruduce una cantidad numeral valida: ");
					teclado.next();
						
				}
				
					opcion = teclado.nextInt();
					
				
				if(opcion >= 1 && opcion <= 4) {
				
					switch (opcion){
					
					case 1:
							resultado = num1 + num2;						
						break;
						
					case 2:
							System.out.println("Indica el orden de resta de los terminos: ");
							System.out.print("Primer numero: ");
							
							while(!teclado.hasNextDouble()){
								
								System.out.print("Intruduce una cantidad numeral: ");
								teclado.next();
								
							}
								
							num1 = teclado.nextFloat();
								
							System.out.print("Numero que resta al primero: ");
							
							while(!teclado.hasNextDouble()){
								
								System.out.print("Intruduce una cantidad numeral: ");
								teclado.next();
								
							}
								
							num2 = teclado.nextDouble();
							
							resultado = num1 - num2;
							
						break;
						
					case 3:
							resultado = num1 * num2;	
							
						break;
					
					case 4:
							if(num2 != 0) {
								
								resultado = num1 / num2;
								
							}else {
								
								System.out.println("No se puede dividir entre 0");
								
							}
							
						break;
											
					}
					
					System.out.println("******************************");
					System.out.println("El resultado de la operacion es " + resultado);
					System.out.println("******************************");
					
			}else {
				
				System.out.println("Introduce una opcion valida: ");
				
			}
				
			teclado.close();
			
		}
		
	}

