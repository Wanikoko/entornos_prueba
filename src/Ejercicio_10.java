import java.util.Scanner;
public class Ejercicio_10 {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		int resultado = 0;
		
			System.out.print("Que tabla quieres que se haga?: ");
			
			Scanner teclado = new Scanner(System.in);
			
			while(!teclado.hasNextInt()){
				
				System.out.print("Introduce un numero entero: ");
				teclado.next();
				
			}
			
				j = teclado.nextInt();
				
				teclado.close();
				
				System.out.println("*****************");
					while(i<=10) {
						
						resultado = j * i;
						System.out.println( j + " x " + i + " = " + resultado );
						i++;
			
		}
				System.out.println("*****************");
		
	}

}
