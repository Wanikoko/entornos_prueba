
import java.util.Scanner;

public class Ejercicio_22 {

	public static void main(String[] args) {
		
		String poligono = "";
		float lado = 0.0F;
		float altura = 0.0F;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
		 
		System.out.println("********* Hola ***********");
		System.out.println("Triangulo ");
		System.out.println("Rectangulo ");
		System.out.println("Cuadrado ");
		System.out.println("**************************");
		System.out.print("Introduzca el tipo de poligono y te dire su area: ");
		
		poligono = teclado.nextLine();
		
		}while(!poligono.equals("Triangulo") && !poligono.equals("Cuadrado") && !poligono.equals("Rectangulo"));
		
		System.out.println("**************************");
		
		switch ( poligono ) {
		
	      case "Triangulo":
	    	  
	    	   System.out.print("Introduce la longitud de su lado: ");
	    	   
	    	   while(!teclado.hasNextFloat()){
					
					System.out.print("Introduce una logitud numeral: ");
					teclado.next();
					
				}
				
					lado = teclado.nextFloat();
					
				System.out.print("Introduce la altura: ");
			    	   
			    while(!teclado.hasNextFloat()){
							
			    	System.out.print("Introduce una logitud numeral: ");
					teclado.next();
							
				}
						
					altura = teclado.nextFloat();
					
					 System.out.println("**************************");
					 System.out.println("Su area es: " + ((lado * altura)/2) + " cm2");
					 System.out.println("**************************");
					 
	           break;
	           
	      case "Rectangulo":
	    	  
	           System.out.print("Introduce la base del rectangulo: ");
	           
	           while(!teclado.hasNextFloat()){
					
	        	    System.out.print("Introduce una logitud numeral: ");
					teclado.next();
					
				}
				
					lado = teclado.nextFloat();
	           
	           System.out.print("Introduce la altura del rectangulo: ");
	           
	           while(!teclado.hasNextFloat()){
					
	        	    System.out.print("Introduce una logitud numeral: ");
					teclado.next();
					
				}
				
					altura = teclado.nextFloat();
					
					System.out.println("**************************");
					System.out.println("Su area es: " + (lado * altura) + " cm2");
					System.out.println("**************************");
	           
	           break;
	           
	      case "Cuadrado":
	    	  
	    	  		System.out.print("Introduce la longitud de su lado: ");
	           
	           while(!teclado.hasNextFloat()){
					
	        	    System.out.print("Introduce una logitud numeral: ");
					teclado.next();
					
				}
				
					lado = teclado.nextFloat();
	    	  
					System.out.println("**************************");
					System.out.println("Su area es: " + (lado * lado) + " cm2");
					System.out.println("**************************");
					
	           break;
	
	      }
		
		teclado.close();
				
	}

}