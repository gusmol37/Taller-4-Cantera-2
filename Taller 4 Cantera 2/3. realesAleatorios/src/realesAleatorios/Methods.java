package realesAleatorios;

/**
 * Declaración de métodos para ordenar arreglo.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */
public interface Methods {
	
	/**
	 * El Método de la burbuja se usa para comparar pares de elementos adyacentes en un array y si están desordenanos intercambiarlos hasta que estén todos ordenados.
	 * @param numbersArray : Arreglo de números aleatorios.
	 */
	public void bubbleSortMehod(int numbersArray[]);
	
	/**
	 * Metodo Quick
	 * @param array : Arreglo de números aleatorios
	 * @param first : Número de inicio
	 * @param last  : Número final
	 */
	public void quickSortMethod(int[] array, int first, int last);
}