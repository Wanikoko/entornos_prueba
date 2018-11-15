import java.util.Scanner;

public class Ejercicio_5 {
	
	static final int kValorMin = 5;
	static final int kDescuento = 10;
	static final int kValorMax = 30;

	public static void main(String[] args) {
		
		float cantidad = 0.0F;
		float descuento = 0.0F;
		float total = 0.0F;
		
		System.out.println("Introduce la cantidad de euros: ");
		
			Scanner teclado = new Scanner(System.in);
			
			while(!teclado.hasNextFloat()){
				
				System.out.print("Intruduce una cantidad numeral: ");
				teclado.next();
				
			}
				
			cantidad = teclado.nextFloat();
			
			teclado.close();

			if(cantidad >= 0){
				
				if(cantidad >= kValorMin){
					
					descuento = ((cantidad * kDescuento)/100);
					
						if(descuento > kValorMax ){
							
							descuento = kValorMax;
							
							total = cantidad - descuento;
							
								System.out.println("Precio a pagar: ");
								System.out.print(total);
								System.out.print("€");
							
						}else{
							
							total = cantidad - descuento;
							
								System.out.println("Precio a pagar: ");
								System.out.print(total);
								System.out.print("€");;
							
						}
			
				}else {
					
					System.out.println("La cantidad minima es de " + kValorMin + " euros");
					
				}
				
			}else {
				
				System.out.println("Introduce una cantidad de dinero positiva");
				
			}
		}
	}	
