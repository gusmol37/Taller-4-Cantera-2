package numTeclado;

/**
 * Clase VectorClass muestra los m�todos para crear el vector.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
 */

/**
 * Importaci�n de librerias y clases
 * InputMismatchException permite para manejo de excepciones solo el ingreso de n�meros
 * Scanner para capturar de datos
 * Vector para la creaci�n del vector
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;


public class VectorClass {

	/**
	 * Instanciaci�n de la clase vector
	 */
	Vector vector = new Vector();

	/**
	 * M�todo vectorCreate para crear el vector
	 * 
	 */
	public Vector vectorCreate() {

		/**
		 * input : captura los n�meros dados por el usuario
		 */
		Scanner input = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("             *********** Creaci�n de un Vector Din�mico ***********");
		System.out.println(" ");
		System.out.println(
				"Indique los n�meros que desee para crear el vector. !Importante� Si ingresa dos veces consecutivas el mismo n�mero, el sistema finaliza y se crea el vector. ");

		/**
		 * Try - catch : Utilizado para generar la excepcion InputMismatchException, la
		 * cual permite ingresar valores numericos unicamente
		 */
		try {

			int i = 0;

			/** nro1 = El primer numero ingresado y anadido al vector */
			int nro1 = input.nextInt();
			vector.addElement(nro1);

			/**
			 * Condicional Do - While : A�ade los numeros ingresados por el usuario hasta
			 * que el numero ingresado sea igual al anterior
			 */
			do {
				int nro = input.nextInt();
				vector.addElement(nro);
				i = i + 1;
			} while (vector.get(i) != vector.get(i - 1));

		} catch (InputMismatchException ex) {
			System.out.println("Solo puede ingresar n�meros.");

		}
		return vector;

	}

	/**
	 * M�todo vectorShow muestra vector resultante
	 */
	public void vectorShow(Vector vector) {

		/**
		 * Bucle For permite recorrer el vector e imprimir su contenido
		 */
		for (int j = 0; j < vector.size(); j++) {
			System.out.println(vector.get(j));
		}
	}
}