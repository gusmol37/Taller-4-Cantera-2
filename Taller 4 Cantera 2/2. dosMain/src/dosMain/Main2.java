package dosMain;

/**
* Cuando ejecutamos un pograma, vemos que sí es posible tener un programa con más de una clase incorporen el método main. 
* Para ello, debemos ejecutar a partir de la clase considerada principal, se puede diferenciar con el nombre y 
* la ubicación en otro paquete.
*/

 /**
 * Importación de libreria Scanner, utilizada para capturar datos
 */
import java.util.Scanner;

/**
 * Clase Main2 la cual contiene método principal. Esta clase contiene el menú y muestra el valor de las frutas.
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */

public class Main2 {

	 /**
	 * @param args : Argumento del método Main2
	 */
	public static void main(String[] args) {

		 /**
		 * Instancia de la libreria Scanner
		 */
		
		Scanner input = new Scanner(System.in);
		
		 /**
		 * Llamado del método main de la clase Main1, el cual evidencia que se puede tener varias clases con el método main.
		 */
		Main1.main(args);
		
		 /**
		 * Método que imprime y muestra el menú al usuario.
		 */
		System.out.println("");
		System.out.println("Indique cuál fruta desea comprar: ");
		System.out.println("1. Manzana");
		System.out.println("2. Banano");
		System.out.println("3. Cereza");
		System.out.println("4. Limón");
		
		 /**
		 * Captura de la opción seleccionada por el usuario.
		 */
		int option = input.nextInt();
		
		 /**
		 * Uso del condicional Switch -case, para imprimir el precio respectivo de la fruta escogida
		 */
		switch (option) {

		case 1:
			System.out.println("El precio a pagar es $1000");
			break;
		case 2:
			System.out.println("El precio a pagar es $2000");
			break;
		case 3:
			System.out.println("El precio a pagar es $5000");
			break;
		case 4:
			System.out.println("El precio a pagar es $400");
			break;

		}
	}

}
