import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		float valor = 0.0F;
		float descuento = 0.0F;
		float total = 0.0F;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el precio del producto: ");
		
		valor = teclado.nextFloat();
		
		teclado.close();
		
			if  ( valor >= 100){
			
				descuento = ((valor*10)/100) ;
				
				total = valor - descuento;
				
				System.out.println("El precio final del producto es: ");
				System.out.println(total);
				
			}else{
				
				System.out.println("No se puede aplicar un descuento");
				
			
	    	}
	}

}
