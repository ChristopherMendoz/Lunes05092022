package estructurasrepetitivas;
import java.util.*;
public class Adivinanzas {

	public static void main(String[] args) {
		// Generar un numero aleatorio entre 0 y 10
	   //Pedirle al usuario que adivine el numero
		//Solo se le va a permitir 3 intentos
       Scanner lector = new Scanner (System.in);
       
       long num = Math.round(Math.random() * 10);//random genera un numero double , round genera un long
       System.out.println("-----ADIVINE UN NUMERO ENTRE 0 Y 10-----");
       int resp = lector.nextInt();
       
       int intentos = 1;
       
       
 
       while(num != resp) {
    	   System.out.println("Lo siento. Numero incorrecto. Vuelva a intentarlo.");
    	   System.out.println("--------------------------------------------------");
    	   System.out.println("\tAdivine un numero entre 0 y 10: ");
    	   resp = lector.nextInt();
    	   intentos++;
    	   
    	   if ( intentos ==3) {
    		   if (num == resp) {
    			  System.out.println("FELICIDADES" + resp);
    			   break;
    		   }
        	   
               System.out.println("Has agotado tus " + intentos + " intentos " );
               break;
           }
    	 
       }
      
       System.out.println("------------------FIN DEL JUEGO!----------------");
       System.out.println("\tEL NUMERO DESCONOCIDO ES: " + num);
	}

}
