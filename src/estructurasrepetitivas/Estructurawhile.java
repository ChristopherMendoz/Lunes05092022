package estructurasrepetitivas;
import java.util.*;
public class Estructurawhile {

	public static void main(String[] args) {
		//Estructura repetitiva preprueba
		//Estructura while
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese su Edad: ");
		int edad = lector.nextInt();
		
		while (edad < 0) {
			//System.out.println("Estamos dentro del while\t");//\t = como presionar tab y \n = salto de linea
			System.out.println("Edad Incorrecta!\t");
			System.out.println("Ingrese Su Edad: ");
			edad = lector.nextInt();
			//contador++ = contador = contador + 1
		}
          System.out.println("Fin del programa!");
	}

}
