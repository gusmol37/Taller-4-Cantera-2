package numTeclado;

/**
 * Clase principal de la aplicación para la creación de un vector hasta que se
 * de consecutivamente el mismo número.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
 */

/**
 * Importación de clase Vector para la creación de un array dinámico.
 * 
 */
import java.util.Vector;


public class Main {

	public static void main(String[] args) {

		/**
		 * Instanciación de la clase Vector
		 */
		VectorClass vector = new VectorClass();

		/**
		 * vectorArray: guarda el vector vectorCreate
		 */
		Vector vectorArray = vector.vectorCreate();

		/** 
		 * Imprime el vector 
		 */
		System.out.println("        ¡El vector se ha creado correctamente!");
		vector.vectorShow(vectorArray);

	}

}