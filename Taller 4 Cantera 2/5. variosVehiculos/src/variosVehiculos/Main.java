package variosVehiculos;

/**Importacion de libreria y clase
 * ParseException   : Utilizada para que no se generen errores cuando se usa el tipo de dato Date
 * Vehicle          : Utilizada para llamar los metodos de la clase Vehicle
 */
import java.text.ParseException;
import ferry.Vehicle;


/**
 * Aplicaci�n que permite invocar los metodos creados para la creaci�n de otros veh�culos
 *  
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */

public class Main {

	public static void main(String[] args) throws ParseException {

		/** 
		 * Instaciaci�n de clase Array 
		 * 
		 */
		Array array = new Array();

		/**
		 * arrayVehicles = almacena la lista en el metodo
		 * addArray
		 */
		Vehicle[] arrayVehicles = array.addArray();

		/** 
		 * Muestra lista vehiculos nuevos 
		 */
		array.show(arrayVehicles);

	}

}