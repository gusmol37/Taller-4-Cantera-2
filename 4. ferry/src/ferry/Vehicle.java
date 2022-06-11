package ferry;

/**
 * Importar libreria Date y SimpleDateFormat para el ingreso de una fecha 
 */
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase principal donde se crean los métodos para el registro de los datos de
 * los vehículos.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
 */

public class Vehicle {

	/**
	 * Atributos passenggersNumber: Número de pasajeros withCrew : Con tripulación
	 * wheels: Número de llantas registrationDate: Fecha de matrícula moveMeans:
	 * Medio por el que se desplaza weight: Peso typeVehicle: Tipo de vehículo
	 */
	public int passenggersNumber;
	public boolean withCrew;
	public int wheels;
	public Date registrationDate;
	public String moveMeans;
	public double weight;
	public String typeVehicle;

	/**
	 * Constructor con instanciación desde otras clases.
	 */
	public Vehicle() {
		super();
	}

	/**
	 * Constructor y sus parámetros
	 * 
	 * @param passenggersNumber : Número de pasajeros
	 * @param withCrew          : Con tripulación
	 * @param wheels            : Número de llantas
	 * @param registrationDate  : Fecha de matrícula
	 * @param moveMeans         : Medio por el que se desplaza
	 * @param weight            : Peso
	 */
	public Vehicle(int passenggersNumber, boolean withCrew, int wheels, Date registrationDate, String moveMeans,
			double weight) {
		super();
		this.passenggersNumber = passenggersNumber;
		this.withCrew = withCrew;
		this.wheels = wheels;
		this.registrationDate = registrationDate;
		this.moveMeans = moveMeans;
		this.weight = weight;
	}

	/**
	 * Constructor y sus parámetros
	 * 
	 * @param passenggersNumber : Número de pasajeros
	 * @param withCrew          : Con tripulación
	 * @param wheels            : Número de llantas
	 * @param registrationDate  : Fecha de matrícula
	 * @param moveMeans         : Medio por el que se desplaza
	 * @param weight            : Peso
	 * @param typeVehicle       : Tipo de vehículo
	 */
	public Vehicle(int passenggersNumber, boolean withCrew, int wheels, Date registrationDate, String moveMeans,
			double weight, String typeVehicle) {
		super();
		this.passenggersNumber = passenggersNumber;
		this.withCrew = withCrew;
		this.wheels = wheels;
		this.registrationDate = registrationDate;
		this.moveMeans = moveMeans;
		this.weight = weight;
		this.typeVehicle = typeVehicle;
	}

	/**
	 * Método getPassenggersNumber que permite obtener el valor de passenggersNumber
	 * 
	 * @return passenggersNumber : Número de pasajeros
	 */
	public int getPassenggersNumber() {
		return passenggersNumber;
	}

	/**
	 * Método setPassenggersNumber para modificar el valor de passenggersNumber
	 * 
	 * @param passenggersNumber : Número de pasajeros
	 */
	public void setPassenggersNumber(int passenggersNumber) {
		this.passenggersNumber = passenggersNumber;
	}

	/**
	 * Método isWithCrew para obtener valor de withCrew
	 * 
	 * @return withCrew : Con tripulación
	 */
	public boolean isWithCrew() {
		return withCrew;
	}

	/**
	 * Método setWithCrew para modificar valor de withCrew.
	 * 
	 * @param withCrew : Con tripulación
	 */
	public void setWithCrew(boolean withCrew) {
		this.withCrew = withCrew;
	}

	/**
	 * Método getWheels para obtener valor de wheels
	 * 
	 * @return wheels : Número de llantas
	 */
	public int getWheels() {
		return wheels;
	}

	/**
	 * Método setWheels para modificar valor de wheels
	 * 
	 * @param wheels : Número de llantas
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	/**
	 * Método getRegistrationDate para obtener valor de registrationDate
	 * 
	 * @return registrationDate : Fecha de matrícula
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * Método setRegistrationDate para modificar valor de registrationDate
	 * 
	 * @param registrationDate : Fecha de matrícula
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * Método getMoveMeans para obtener valor de moveMeans
	 * 
	 * @return moveMeans : Medio por el cual se desplaza
	 */
	public String getMoveMeans() {
		return moveMeans;
	}

	/**
	 * Método setMoveMeans para modificar valor de moveMeans
	 * 
	 * @param moveMeans : Medio por el cual se desplaza
	 */
	public void setMoveMeans(String moveMeans) {
		this.moveMeans = moveMeans;
	}

	/**
	 * Método getWeight para obtener valor de weight
	 * 
	 * @return weight : Peso del vehículo
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Método setWeight para modificar valor de weight
	 * 
	 * @param weight : Peso del vehículo
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Método getTypeVehicle para obtener valor de typeVehicle
	 * 
	 * @return typeVehicle : Tipo de vehículo
	 */
	public String getTypeVehicle() {
		return typeVehicle;
	}

	/**
	 * Método setTypeVehicle para modificar valor de typeVehicle
	 * 
	 * @param typeVehicle: Tipo de vehículo
	 */
	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle = typeVehicle;
	}

	/**
	 * Sobreescritura del metodo toSring, uilizado para mostrar la informacion del
	 * vehículo
	 */
	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return "Vehicle Número de pasajeros =" + passenggersNumber + ", ¿Con tripulación?=" + withCrew
				+ ", Número de llantas =" + wheels + ", Fecha de matrícula=" + format.format(registrationDate)
				+ ", Medio de desplazamiento=" + moveMeans + ", Peso=" + weight + ", Tipo de vehículo=" + typeVehicle
				+ "]";
	}

}