package realesAleatorios;

/**
* Aplicaci�n que permite ordenar una serie de n�meros aleatorios por medio de el algoritmo de la burbuja o mediante quick sort.
* @author Gustavo Molina <gusmol37@gmail.com>
* @Version: 1.0.0
*/

/**
 * Importar libreria Scanner para la captura de datos. 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal que contiene el men�.
 * 
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * Instancia de clases Scanner : Utilzada para captura la opci�n del usuario
		 * Array : Para llamar el arreglo y sus m�todos. BubbleQuickSort :
		 * Llamada al m�todo bubbleSort y quickSort
		 */
		Scanner input = new Scanner(System.in);
		Array numbersArray = new Array();
		BubbleQuickSort sort = new BubbleQuickSort();

		int[] array = numbersArray.fillArray();
		numbersArray.show(array);

		System.out.println("--------------------------------------------- ");
		System.out.println("Indique su opci�n para el orden del arreglo:");
		System.out.println(" ");
		System.out.println("1. Algoritmo de burbuja");
		System.out.println("2. Quick sort");
		
		/**
		 * Try-Catch: Se usa para controlar el ingreso de solo
		 * valores n�mericos
		 */
		try {

			/** 
			 * option --> almacena la opci�n elegida por el usuario.
			 */
			int option = input.nextInt();

			/**
			 * Condicional swith-case: permite ejecutar la opci�n elegida por el usuario.
			 * escogida
			 */
			switch (option) {

			/**
			 * Metodo BubbleSort : Instanciaci�n de la clase BubbleSort con llamada del m�todo
			 * bubbleSortMehod
			 */
			case 1:
				sort.bubbleSortMehod(array);

				/**
				 * Llamada del m�todo show, de la clase Array que muestra el arreglo.
				 */
				numbersArray.show(array);
				break;

			/**
			 * M�todo quick : Instanciaci�n de la clase QuickSort y llamada del m�todo
			 * quickSortMethod, para los par�metros: arreglo, inicio y fin, ordena el
			 * arreglo
			 */

			case 2:
				sort.quickSortMethod(array, 0, (array.length - 1));

				/**
				 * M�todo show, clase Array muestra el arreglo.
				 */
				numbersArray.show(array);
				break;

			default:
				System.out.println("Valor errado.");
			}

		} catch (InputMismatchException ex) {
			System.out.println("Solo puede ingresar n�meros.");

		}
	}
}
