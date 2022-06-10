package realesAleatorios;

/**
 * Importaci�n de libreria Scanner para capturar valores que digite el usuario
 */
import java.util.Scanner;

/**
 * Esta clase contiene la declaraci�n del arreglo y los m�todos para mostrar el arreglo
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */

public class Array {

	/**
	 * array[] : Declaraci�n del arreglo
	 */
	private int array[];

	/**
	 * M�todo para llenar el arreglo con n�meros reales
	 * 
	 * @return array : Arreglo de n�meros aleatorios
	 */
	public int[] fillArray() {

		System.out.println(" \n");
		System.out.println("Indique la cantidad de n�meros que desea ordenar en el sistema.");
		Scanner inputNumber = new Scanner(System.in);

		/**
		 * numberSize: almacena el n�mero que ingresa el usuario
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
	 * M�todo utilizado para mostrar el arreglo
	 * 
	 * @param contiene el arreglo de n�meros aleatorios.
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