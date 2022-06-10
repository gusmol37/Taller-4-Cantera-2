package ferry;

/**
 * Importar excepción ParseException para manejar errores por el uso de Date
 * 
 */
import java.text.ParseException;

/**
 * Clase principal de la aplicación para el registro de los datos de los vehículos.
 *  
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */

public class Main {

	public static void main(String[] args) throws ParseException {

		/**
		 * Instanciación de la clase FerriesArray.
		 */
		FerriesArray array = new FerriesArray();

		/** 
		 * Llamar método addArray para crear los diez vehículos 
		 */
		Vehicle[] arrayVehicles = array.addArray();

		/**
		 * Método show que muestra la lista de 10 vehículos creados.
		 * 
		 * @param arrayVehicles : Lista de vehiculos
		 */
		array.show(arrayVehicles);

	}
}