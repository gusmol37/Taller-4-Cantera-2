package realesAleatorios;

/**
 * Declaraci�n de m�todos para ordenar arreglo.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */
public interface Methods {
	
	/**
	 * El M�todo de la burbuja se usa para comparar pares de elementos adyacentes en un array y si est�n desordenanos intercambiarlos hasta que est�n todos ordenados.
	 * @param numbersArray : Arreglo de n�meros aleatorios.
	 */
	public void bubbleSortMehod(int numbersArray[]);
	
	/**
	 * Metodo Quick
	 * @param array : Arreglo de n�meros aleatorios
	 * @param first : N�mero de inicio
	 * @param last  : N�mero final
	 */
	public void quickSortMethod(int[] array, int first, int last);
}