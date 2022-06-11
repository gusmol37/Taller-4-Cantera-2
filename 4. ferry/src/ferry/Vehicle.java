package ferry;

/**
 * Importar libreria Date y SimpleDateFormat para el ingreso de una fecha 
 */
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase principal donde se crean los m�todos para el registro de los datos de
 * los veh�culos.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
 */

public class Vehicle {

	/**
	 * Atributos passenggersNumber: N�mero de pasajeros withCrew : Con tripulaci�n
	 * wheels: N�mero de llantas registrationDate: Fecha de matr�cula moveMeans:
	 * Medio por el que se desplaza weight: Peso typeVehicle: Tipo de veh�culo
	 */
	public int passenggersNumber;
	public boolean withCrew;
	public int wheels;
	public Date registrationDate;
	public String moveMeans;
	public double weight;
	public String typeVehicle;

	/**
	 * Constructor con instanciaci�n desde otras clases.
	 */
	public Vehicle() {
		super();
	}

	/**
	 * Constructor y sus par�metros
	 * 
	 * @param passenggersNumber : N�mero de pasajeros
	 * @param withCrew          : Con tripulaci�n
	 * @param wheels            : N�mero de llantas
	 * @param registrationDate  : Fecha de matr�cula
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
	 * Constructor y sus par�metros
	 * 
	 * @param passenggersNumber : N�mero de pasajeros
	 * @param withCrew          : Con tripulaci�n
	 * @param wheels            : N�mero de llantas
	 * @param registrationDate  : Fecha de matr�cula
	 * @param moveMeans         : Medio por el que se desplaza
	 * @param weight            : Peso
	 * @param typeVehicle       : Tipo de veh�culo
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
	 * M�todo getPassenggersNumber que permite obtener el valor de passenggersNumber
	 * 
	 * @return passenggersNumber : N�mero de pasajeros
	 */
	public int getPassenggersNumber() {
		return passenggersNumber;
	}

	/**
	 * M�todo setPassenggersNumber para modificar el valor de passenggersNumber
	 * 
	 * @param passenggersNumber : N�mero de pasajeros
	 */
	public void setPassenggersNumber(int passenggersNumber) {
		this.passenggersNumber = passenggersNumber;
	}

	/**
	 * M�todo isWithCrew para obtener valor de withCrew
	 * 
	 * @return withCrew : Con tripulaci�n
	 */
	public boolean isWithCrew() {
		return withCrew;
	}

	/**
	 * M�todo setWithCrew para modificar valor de withCrew.
	 * 
	 * @param withCrew : Con tripulaci�n
	 */
	public void setWithCrew(boolean withCrew) {
		this.withCrew = withCrew;
	}

	/**
	 * M�todo getWheels para obtener valor de wheels
	 * 
	 * @return wheels : N�mero de llantas
	 */
	public int getWheels() {
		return wheels;
	}

	/**
	 * M�todo setWheels para modificar valor de wheels
	 * 
	 * @param wheels : N�mero de llantas
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	/**
	 * M�todo getRegistrationDate para obtener valor de registrationDate
	 * 
	 * @return registrationDate : Fecha de matr�cula
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * M�todo setRegistrationDate para modificar valor de registrationDate
	 * 
	 * @param registrationDate : Fecha de matr�cula
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * M�todo getMoveMeans para obtener valor de moveMeans
	 * 
	 * @return moveMeans : Medio por el cual se desplaza
	 */
	public String getMoveMeans() {
		return moveMeans;
	}

	/**
	 * M�todo setMoveMeans para modificar valor de moveMeans
	 * 
	 * @param moveMeans : Medio por el cual se desplaza
	 */
	public void setMoveMeans(String moveMeans) {
		this.moveMeans = moveMeans;
	}

	/**
	 * M�todo getWeight para obtener valor de weight
	 * 
	 * @return weight : Peso del veh�culo
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * M�todo setWeight para modificar valor de weight
	 * 
	 * @param weight : Peso del veh�culo
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * M�todo getTypeVehicle para obtener valor de typeVehicle
	 * 
	 * @return typeVehicle : Tipo de veh�culo
	 */
	public String getTypeVehicle() {
		return typeVehicle;
	}

	/**
	 * M�todo setTypeVehicle para modificar valor de typeVehicle
	 * 
	 * @param typeVehicle: Tipo de veh�culo
	 */
	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle = typeVehicle;
	}

	/**
	 * Sobreescritura del metodo toSring, uilizado para mostrar la informacion del
	 * veh�culo
	 */
	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return "Vehicle N�mero de pasajeros =" + passenggersNumber + ", �Con tripulaci�n?=" + withCrew
				+ ", N�mero de llantas =" + wheels + ", Fecha de matr�cula=" + format.format(registrationDate)
				+ ", Medio de desplazamiento=" + moveMeans + ", Peso=" + weight + ", Tipo de veh�culo=" + typeVehicle
				+ "]";
	}

}