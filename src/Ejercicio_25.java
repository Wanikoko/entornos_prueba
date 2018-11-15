import java.util.Scanner;

public class Ejercicio_25 {
	
	public static void main(String[] args) {
		
		int maximo = 0;
		int altura = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Numero: ");
		
		altura = teclado.nextInt();
		
		teclado.close();
		
		maximo = 1;
		
		while (maximo <= altura) {
				
			for(int i = 1 ; i <= maximo; i++) {
				
				System.out.print(i + " ");
								
			}
			
			System.out.println("");
			maximo++;
			
		}
		 
    }
	
}