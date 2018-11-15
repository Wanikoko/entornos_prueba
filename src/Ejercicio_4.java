import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		float nota = 0.0F;
		
		Scanner teclado = new Scanner(System.in);
		
			System.out.println("Introduce tu nota: ");
		
				nota = teclado.nextFloat();
				
				teclado.close();
				
					if(nota >= 0 && nota <= 10) {
						
							if(nota >= 9 && nota <= 10) {
								
								System.out.println("Excelente");
								
							}else if (nota >= 6.5 && nota < 9){
				
								System.out.println("Notable");
								
							}else if (nota >= 5 && nota < 6.5){
				
								System.out.println("Aprobado");
					     
							}else{
								
								System.out.println("Suspendido");
								
							}
					}else {
						
						System.out.println("Introduce una nota comprendida entre 0 y 10");
						
			}	
					
	 }
	
}