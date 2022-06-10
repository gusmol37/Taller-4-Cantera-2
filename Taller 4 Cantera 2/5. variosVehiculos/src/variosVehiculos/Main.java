package variosVehiculos;

/**Importacion de libreria y clase
 * ParseException   : Utilizada para que no se generen errores cuando se usa el tipo de dato Date
 * Vehicle          : Utilizada para llamar los metodos de la clase Vehicle
 */
import java.text.ParseException;
import ferry.Vehicle;


/**
 * Aplicación que permite invocar los metodos creados para la creación de otros vehículos
 *  
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */

public class Main {

	public static void main(String[] args) throws ParseException {

		/** 
		 * Instaciación de clase Array 
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