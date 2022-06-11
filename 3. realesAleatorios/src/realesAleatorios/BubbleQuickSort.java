package realesAleatorios;

/**
 * Declaración de los métodos que permiten ordenar el arreglo
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
 */

public class BubbleQuickSort implements Methods {

	/**
	 * Método bubbleSortMehod: Realiza el recorrido del arreglo comparando los
	 * elementos y realizando su ordenamiento.
	 * 
	 * @param numbersArray : Arreglo de números
	 */

	@Override
	public void bubbleSortMehod(int numbersArray[]) {

		for (int j = 0; j < numbersArray.length - 1; j++) {
			for (int k = 0; k < numbersArray.length - j - 1; k++) {
				if (numbersArray[k + 1] < numbersArray[k]) {
					int aux = numbersArray[k + 1];
					numbersArray[k + 1] = numbersArray[k];
					numbersArray[k] = aux;

				}

			}

		}
	}

	/**
	 * Método QuickSort: Método que divide el arreglo y posteriormete va comparando
	 * con el lado derecho o izquierdo para organizar los elementos del arreglo.
	 * 
	 * @param array : Arreglo
	 * @param first : Primer elemento
	 * @param last  : Último elemento
	 */
	@Override
	public void quickSortMethod(int[] array, int first, int last) {

		if (first >= last) {
			return;
		}

		int pivot = array[first];
		int left = first + 1;
		int right = last;

		while (left <= right) {

			while (left <= last && array[left] < pivot) {
				left++;
			}

			while (right > first && array[right] >= pivot) {
				right--;
			}

			if (left <= right) {
				int aux = array[left];
				array[left] = array[right];
				array[right] = aux;
			}

		}

		if (right > first) {
			int aux2 = array[first];
			array[first] = array[right];
			array[right] = aux2;
		}

		/** Organiza el lado izquierdo */
		quickSortMethod(array, first, right - 1);

		/** Organiza el lado derecho */
		quickSortMethod(array, right + 1, last);

	}
}
