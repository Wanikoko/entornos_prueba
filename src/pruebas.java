import java.util.Scanner;
public class pruebas {

	public static void main(String[] args) {
		
		String piramide = "";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce la altura de la piramide de numeros: ");
		
			while(!teclado.hasNextLine()) {
				
				System.out.print("Introduce un numero entero pls: ");
				
				teclado.next();
			}
			
		piramide = teclado.nextLine();
		
		teclado.close();
		
		if(!piramide.equals("Piramide") && !piramide.equals("piramide")) {
			System.out.print("Mal");
		}else {
		    System.out.print("Bien");
		}
		 
	  }
	
}