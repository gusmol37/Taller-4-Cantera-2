package dosMain;

/**
* Cuando ejecutamos un pograma, vemos que s� es posible tener un programa con m�s de una clase incorporen el m�todo main. 
* Para ello, debemos ejecutar a partir de la clase considerada principal, se puede diferenciar con el nombre y 
* la ubicaci�n en otro paquete.
*/

 /**
 * Importaci�n de libreria Scanner, utilizada para capturar datos
 */
import java.util.Scanner;

/**
 * Clase Main2 la cual contiene m�todo principal. Esta clase contiene el men� y muestra el valor de las frutas.
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */

public class Main2 {

	 /**
	 * @param args : Argumento del m�todo Main2
	 */
	public static void main(String[] args) {

		 /**
		 * Instancia de la libreria Scanner
		 */
		
		Scanner input = new Scanner(System.in);
		
		 /**
		 * Llamado del m�todo main de la clase Main1, el cual evidencia que se puede tener varias clases con el m�todo main.
		 */
		Main1.main(args);
		
		 /**
		 * M�todo que imprime y muestra el men� al usuario.
		 */
		System.out.println("");
		System.out.println("Indique cu�l fruta desea comprar: ");
		System.out.println("1. Manzana");
		System.out.println("2. Banano");
		System.out.println("3. Cereza");
		System.out.println("4. Lim�n");
		
		 /**
		 * Captura de la opci�n seleccionada por el usuario.
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
