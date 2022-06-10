package variosVehiculos;

/**Importacion de clases
 * Date    : Utilizada para el tipo de dato de las fechas
 * Vehicle : Clase vehiculo donde se extieden los demas vehiculos
 */
import java.util.Date;
import ferry.Vehicle;


/**
 * Clase vehiculo biccicleta con sus atributos  
 *  
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */

/**
 * Clase Bicycle: Clase extendida de vehiculo y contiene atributo identificador para una biccicleta 
 * @author LORENA FAJARDO 
 * @Version: 1.0.0
 */
public class Bicycle extends Vehicle {
	
	/**
	 * Atributo 
	 * usesFuel: Uso de combustible
	 */
	public boolean usesFuel;

	/** Declaracion de constructor vacio*/
	public Bicycle() {
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
	public Bicycle(int passenggersNumber, boolean withCrew, int wheels, Date registrationDate, String moveMeans,
			double weight, String typeVehicle) {
		super(passenggersNumber, withCrew, wheels, registrationDate, moveMeans, weight, typeVehicle);
		};


	/**
	 * Metodo isUsesFuel: Metodo para obtener el valor de uso de combustible
	 * @return usesFuel : Uso de combustible
	 */
	public boolean isUsesFuel() {
		return usesFuel;
	}

	/**
	 * Metodo setUsesFuel : Metodo para modificar el valor de Uso de combustible
	 * @param usesFuel : Uso de combustible
	 */
	public void setUsesFuel(boolean usesFuel) {
		this.usesFuel = usesFuel;
	}

}