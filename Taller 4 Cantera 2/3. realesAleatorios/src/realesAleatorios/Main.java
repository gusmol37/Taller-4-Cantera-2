package realesAleatorios;

/**
* Aplicación que permite ordenar una serie de números aleatorios por medio de el algoritmo de la burbuja o mediante quick sort.
* @author Gustavo Molina <gusmol37@gmail.com>
* @Version: 1.0.0
*/

/**
 * Importar libreria Scanner para la captura de datos. 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal que contiene el menú.
 * 
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * Instancia de clases Scanner : Utilzada para captura la opción del usuario
		 * Array : Para llamar el arreglo y sus métodos. BubbleQuickSort :
		 * Llamada al método bubbleSort y quickSort
		 */
		Scanner input = new Scanner(System.in);
		Array numbersArray = new Array();
		BubbleQuickSort sort = new BubbleQuickSort();

		int[] array = numbersArray.fillArray();
		numbersArray.show(array);

		System.out.println("--------------------------------------------- ");
		System.out.println("Indique su opción para el orden del arreglo:");
		System.out.println(" ");
		System.out.println("1. Algoritmo de burbuja");
		System.out.println("2. Quick sort");
		
		/**
		 * Try-Catch: Se usa para controlar el ingreso de solo
		 * valores númericos
		 */
		try {

			/** 
			 * option --> almacena la opción elegida por el usuario.
			 */
			int option = input.nextInt();

			/**
			 * Condicional swith-case: permite ejecutar la opción elegida por el usuario.
			 * escogida
			 */
			switch (option) {

			/**
			 * Metodo BubbleSort : Instanciación de la clase BubbleSort con llamada del método
			 * bubbleSortMehod
			 */
			case 1:
				sort.bubbleSortMehod(array);

				/**
				 * Llamada del método show, de la clase Array que muestra el arreglo.
				 */
				numbersArray.show(array);
				break;

			/**
			 * Método quick : Instanciación de la clase QuickSort y llamada del método
			 * quickSortMethod, para los parámetros: arreglo, inicio y fin, ordena el
			 * arreglo
			 */

			case 2:
				sort.quickSortMethod(array, 0, (array.length - 1));

				/**
				 * Método show, clase Array muestra el arreglo.
				 */
				numbersArray.show(array);
				break;

			default:
				System.out.println("Valor errado.");
			}

		} catch (InputMismatchException ex) {
			System.out.println("Solo puede ingresar números.");

		}
	}
}
