package numTeclado;

/**
 * Clase VectorClass muestra los métodos para crear el vector.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
 */

/**
 * Importación de librerias y clases
 * InputMismatchException permite para manejo de excepciones solo el ingreso de números
 * Scanner para capturar de datos
 * Vector para la creación del vector
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;


public class VectorClass {

	/**
	 * Instanciación de la clase vector
	 */
	Vector vector = new Vector();

	/**
	 * Método vectorCreate para crear el vector
	 * 
	 */
	public Vector vectorCreate() {

		/**
		 * input : captura los números dados por el usuario
		 */
		Scanner input = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("             *********** Creación de un Vector Dinámico ***********");
		System.out.println(" ");
		System.out.println(
				"Indique los números que desee para crear el vector. !Importante¡ Si ingresa dos veces consecutivas el mismo número, el sistema finaliza y se crea el vector. ");

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
			 * Condicional Do - While : Añade los numeros ingresados por el usuario hasta
			 * que el numero ingresado sea igual al anterior
			 */
			do {
				int nro = input.nextInt();
				vector.addElement(nro);
				i = i + 1;
			} while (vector.get(i) != vector.get(i - 1));

		} catch (InputMismatchException ex) {
			System.out.println("Solo puede ingresar números.");

		}
		return vector;

	}

	/**
	 * Método vectorShow muestra vector resultante
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