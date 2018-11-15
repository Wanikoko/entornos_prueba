
import java.util.Scanner;
public class Ejercicio_23 {

	public static void main(String[] args) {
		
		long total = 0;
		long i = 0;

		Scanner teclado = new Scanner(System.in);
		
			System.out.println("********* Hola ***********");
			System.out.print("Introduzce un numero y te calculo su factorial: ");
			
			while(!teclado.hasNextLong()){
				
				System.out.print("Introduce un numero entero: ");
				teclado.next();
				
			}
			
			total = teclado.nextLong();
			
			teclado.close();
			
			i = total - 1;
			
				while(i > 0){
					
					total = total * i;
					i--;
					
				}
				
				System.out.print("El factorial de este nuemro es: " + total);

	}

}
