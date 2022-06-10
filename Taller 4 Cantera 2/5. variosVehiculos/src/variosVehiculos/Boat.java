package variosVehiculos;

/**Importacion de clases
 * Date    : Utilizada para el tipo de dato de las fechas
 * Vehicle : Clase vehiculo donde se extieden los demas vehiculos
 */
import java.util.Date;
import ferry.Vehicle;

/**
 * Clase boat vehiculo lancha contiene atributos para este tipo
 *  
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */

public class Boat extends Vehicle{
	
	/**
	 * Atributo 
	 * marineTransport: Transporte maritimo
	 */
	public boolean marineTransport;
	
	/** Declaracion de constructor vacio*/
	public Boat() {
		super();
	}
	
	/**
	 * Constructor con todos los parametros de la clase vehicle
	 * @param passenggersNumber : Numero de pasajeros
	 * @param withCrew          : Con tripulacion
	 * @param wheels            : Numero de llantas
	 * @param registrationDate  : Fecha de matricula
	 * @param moveMeans         : Medio por el que se desplaza
	 * @param weight            : Peso
	 * @param typeVehicle       : Tipo de vehiculo
	 */
	public Boat(int passenggersNumber, boolean withCrew, int wheels, Date registrationDate, String moveMeans,
			double weight, String typeVehicle) {
		super(passenggersNumber, withCrew, wheels, registrationDate, moveMeans, weight, typeVehicle);
	}

	/**
	 * Metodo isMarineTransport: Metodo para obtener el valor de trasporte maritimo
	 * @return marineTransport : trasporte maritimo
	 */
	public boolean isMarineTransport() {
		return marineTransport;
	}

	/**
	 * Metodo setMarineTransport : Metodo para modificar el valor de trasporte maritimo
	 * @param marineTransport : trasporte maritimo
	 */
	public void setMarineTransport(boolean marineTransport) {
		this.marineTransport = marineTransport;
	}

	
	
}