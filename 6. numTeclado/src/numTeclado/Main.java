package numTeclado;

/**
 * Clase principal de la aplicaci�n para la creaci�n de un vector hasta que se
 * de consecutivamente el mismo n�mero.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
 */

/**
 * Importaci�n de clase Vector para la creaci�n de un array din�mico.
 * 
 */
import java.util.Vector;


public class Main {

	public static void main(String[] args) {

		/**
		 * Instanciaci�n de la clase Vector
		 */
		VectorClass vector = new VectorClass();

		/**
		 * vectorArray: guarda el vector vectorCreate
		 */
		Vector vectorArray = vector.vectorCreate();

		/** 
		 * Imprime el vector 
		 */
		System.out.println("        �El vector se ha creado correctamente!");
		vector.vectorShow(vectorArray);

	}

}