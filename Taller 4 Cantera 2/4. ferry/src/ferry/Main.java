package ferry;

/**
 * Importar excepci�n ParseException para manejar errores por el uso de Date
 * 
 */
import java.text.ParseException;

/**
 * Clase principal de la aplicaci�n para el registro de los datos de los veh�culos.
 *  
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */

public class Main {

	public static void main(String[] args) throws ParseException {

		/**
		 * Instanciaci�n de la clase FerriesArray.
		 */
		FerriesArray array = new FerriesArray();

		/** 
		 * Llamar m�todo addArray para crear los diez veh�culos 
		 */
		Vehicle[] arrayVehicles = array.addArray();

		/**
		 * M�todo show que muestra la lista de 10 veh�culos creados.
		 * 
		 * @param arrayVehicles : Lista de vehiculos
		 */
		array.show(arrayVehicles);

	}
}