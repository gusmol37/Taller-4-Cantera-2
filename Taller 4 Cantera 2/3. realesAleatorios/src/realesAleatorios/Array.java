package realesAleatorios;

/**
 * Importación de libreria Scanner para capturar valores que digite el usuario
 */
import java.util.Scanner;

/**
 * Esta clase contiene la declaración del arreglo y los métodos para mostrar el arreglo
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */

public class Array {

	/**
	 * array[] : Declaración del arreglo
	 */
	private int array[];

	/**
	 * Método para llenar el arreglo con números reales
	 * 
	 * @return array : Arreglo de números aleatorios
	 */
	public int[] fillArray() {

		System.out.println(" \n");
		System.out.println("Indique la cantidad de números que desea ordenar en el sistema.");
		Scanner inputNumber = new Scanner(System.in);

		/**
		 * numberSize: almacena el número que ingresa el usuario
		 */
		int numberSize = inputNumber.nextInt();
		array = new int[numberSize];

		/**
		 * Ciclo For para el llenado del arreglo con la libreria Math.
		 */
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100 + 0);
		}
		return array;
	}

	/**
	 * Método utilizado para mostrar el arreglo
	 * 
	 * @param contiene el arreglo de números aleatorios.
	 */
	public void show(int[] array) {

		/** 
		 * Bucle for: Utilizado para recorrer el arreglo e imprimir cada elemento 
		 * 
		 */
		for (int l = 0; l < array.length; l++) {
			System.out.println(array[l]);
		}
	}

}