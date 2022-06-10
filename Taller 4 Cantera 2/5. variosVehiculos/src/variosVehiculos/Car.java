package variosVehiculos;

/**Importacion de clases
 * Date    : Utilizada para el tipo de dato de las fechas
 * Vehicle : Clase vehiculo donde se extieden los demas vehiculos
 */
import java.util.Date;
import ferry.Vehicle;

/**
 * Clase Car: Clase extendida de vehiculo y contiene atributo identificador para un carro 
 * @author LORENA FAJARDO 
 * @Version: 1.0.0
 */
public class Car extends Vehicle{
	
	/**
	 * Atributo 
	 * windows: Ventanas
	 */
	public boolean windows;	
	
	/** Declaracion de constructor vacio*/
	public Car() {
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
	public Car(int passenggersNumber, boolean withCrew, int wheels, Date registrationDate, String moveMeans,
			double weight, String typeVehicle) {
		super(passenggersNumber, withCrew, wheels, registrationDate, moveMeans, weight, typeVehicle);
	}

	/**
	 * Metodo isWindows: Metodo para obtener el valor de ventanas
	 * @return windows : ventanas
	 */
	public boolean isWindows() {
		return windows;
	}

	/**
	 * Metodo setWindows : Metodo para modificar el valor de ventanas
	 * @param windows : ventanas
	 */
	public void setWindows(boolean windows) {
		this.windows = windows;
	}
	
}