import java.util.Scanner;

public class Ejercicio_2 {
	
	static final int kCien = 100;
	static final int kTreinta = 30;

	public static void main(String[] args) {
		
		float valor = 0.0F;
		float descuento = 0.0F;
		float total = 0.0F;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el precio del producto: ");
		
		valor = teclado.nextFloat();
		
		teclado.close();
		
			if  ( valor >= kCien){
		
				descuento = ((valor*10)/100) ;
				
				total = valor - descuento;
				
				System.out.println("El precio final del producto con descuento incluido es: ");
				System.out.print(total);
				System.out.print(" €");
				
			} else if ( valor <= kTreinta){
				
				total = valor + 2;
				
				System.out.println("Has recibido una penalización, tu precio es: ");
				System.out.print(total);
				System.out.print(" €");
				
			
	    	}else {
	    		
	    		System.out.println("No se te aplicaran descuentos ni penalizaciones");
	    		System.out.println("Precio a pagar: ");
				System.out.print(valor);
				System.out.print(" €");
	    		
	    	}	
			
	 }
	
}
	
	