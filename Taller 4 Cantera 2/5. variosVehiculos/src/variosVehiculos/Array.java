package variosVehiculos;

/**Importacion de librerias y clases
 * ParseException   : Utilizada para que no se generen errores cuando se usa el tipo de dato Date
 * SimpleDateFormat : Utilizada para dar formato a la fecha
 * Date             : Utilizada como tipo de dato para fechas
 * Scanner          : Utilizada para capturar la informacion ingresada por el usuario
 * Vehicle          : Utilizada para llamar los metodos de la clase Vehicle
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import ferry.Vehicle;


/**
 * Clase para crear los 10 vehiculos seg�n el tipo para de veh�culo
 *  
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */


public class Array {

	/** Instancia de clases */
	Vehicle[] Vehicles = new Vehicle[10];
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	Vehicle vehicle = new Vehicle();
	Bicycle bicycle = new Bicycle();
	Truck truck = new Truck();
	Car car = new Car();
	Motorcycle motorcycle = new Motorcycle();
	Boat boat = new Boat();
	Scanner input = new Scanner(System.in);

	/**
	 * Metodo addArray: Metodo utilizado para recibir los datos que igresa el
	 * usuario y almacenarlos en una lista
	 */
	public Vehicle[] addArray() throws ParseException {

		for (int i = 0; i < 10; i++) {

			
			System.out.println("Indique la informacion solicitada del vehiculo ");
			
			;

			/**
			 * Captura  valor cantidad de pasajeros y se almacena en el
			 * metodo setPassenggersNumber
			 */
			System.out.println("N�mero de pasajeros: ");
			vehicle.setPassenggersNumber(input.nextInt());

			/**
			 * Captura del valor de tripulaci�n y esalmacenado en el metodo
			 * setWithCrew
			 */
			System.out.println("Con tripulaci�n: (True/False)");
			vehicle.setWithCrew(input.nextBoolean());

			/**
			 * Captura el valor de n�mero de ruedas lo guarda en el m�todo
			 * setWheels
			 */
			System.out.println("N�mero de ruedas: ");
			vehicle.setWheels(input.nextInt());

			/**
			 * Captura del valor de fecha de matricula y almacenado en el metodo
			 * setRegistrationDate
			 */
			System.out.println("Fecha de matr�cula (dd/mm/yyyy): ");
			Date date = format.parse(input.next());
			input.nextLine();
			vehicle.setRegistrationDate(date);

			/**
			 * Captura el valor de medio por el cual se desplaza y lo guarda 
			 * en el m�todo setMoveMeans
			 */
			System.out.println("Medio por el cual se desplaza ");
			vehicle.setMoveMeans(input.nextLine());

			/** Captura el valor de peso y lo guarda en el m�todo setWeight */
			System.out.println("Peso ");
			vehicle.setWeight(input.nextDouble());

			/**
			 * Captura del valor de uso de combustible y es almacenado en el metodo
			 * setUsesFuel
			 */
			System.out.println("�El veh�culo usa combustible? (True/False) ");
			bicycle.setUsesFuel(input.nextBoolean());

			/**
			 * Captura del valor de carga pesada y lo guarda en el metodo
			 * setHeavyLoad
			 */
			System.out.println("�El veh�culo es de carga pesada? (True/False)");
			truck.setHeavyLoad(input.nextBoolean());

			/**
			 * Captura del valor de ventanas y lo guarda en el m�todo
			 * setWindows
			 */
			System.out.println("�El veh�culo es 4X4? (True/False) ");
			car.setWindows(input.nextBoolean());

			/**
			 * Captura el valor de licencia de conducir y se guarda en el
			 * metodo setLicenseA
			 */
			System.out.println("�El vehiculo requiere licencia? (True/False) ");
			motorcycle.setLicenseA(input.nextBoolean());

			/**
			 * Captura el valor de transporte maritimo y se guarda en el
			 * metodo setMarineTransport
			 */
			System.out.println("El veh�culo es utilizado como transporte mar�timo (True/False) ");
			boat.setMarineTransport(input.nextBoolean());

			/**
			 * condicional if evalua el atributo isUsesFuel
			 */
			if (bicycle.isUsesFuel() == false) {
				vehicle.setTypeVehicle("Bicicleta");
				Bicycle bike = new Bicycle(vehicle.getPassenggersNumber(), vehicle.isWithCrew(), vehicle.getWheels(),
						vehicle.getRegistrationDate(), vehicle.getMoveMeans(), vehicle.getWeight(),
						vehicle.getTypeVehicle());
				Vehicles[i] = bike;

				/**
				 * condicional else-if evalua el atributo isHeavyLoad
				 */
			} else if (truck.isHeavyLoad() == true) {
				vehicle.setTypeVehicle("Camion");
				Truck truck = new Truck(vehicle.getPassenggersNumber(), vehicle.isWithCrew(), vehicle.getWheels(),
						vehicle.getRegistrationDate(), vehicle.getMoveMeans(), vehicle.getWeight(),
						vehicle.getTypeVehicle());
				Vehicles[i] = truck;

				/**
				 * condicional else-if evalua el aributo isWindows
				 */
			} else if (car.isWindows() == true) {
				vehicle.setTypeVehicle("Coche");
				Car car = new Car(vehicle.getPassenggersNumber(), vehicle.isWithCrew(), vehicle.getWheels(),
						vehicle.getRegistrationDate(), vehicle.getMoveMeans(), vehicle.getWeight(),
						vehicle.getTypeVehicle());
				Vehicles[i] = car;

				/**
				 * condicional else-if evalua el aributo isLicenseA
				 */
			} else if (motorcycle.isLicenseA() == true) {
				vehicle.setTypeVehicle("Motocicleta");
				Motorcycle motorcycle = new Motorcycle(vehicle.getPassenggersNumber(), vehicle.isWithCrew(),
						vehicle.getWheels(), vehicle.getRegistrationDate(), vehicle.getMoveMeans(), vehicle.getWeight(),
						vehicle.getTypeVehicle());
				Vehicles[i] = motorcycle;

				/**
				 * condicional else-if evalua el aributo isLicenseA
				 */
			} else if (boat.isMarineTransport() == true) {
				vehicle.setTypeVehicle("Lancha");
				Boat boat = new Boat(vehicle.getPassenggersNumber(), vehicle.isWithCrew(), vehicle.getWheels(),
						vehicle.getRegistrationDate(), vehicle.getMoveMeans(), vehicle.getWeight(),
						vehicle.getTypeVehicle());
				Vehicles[i] = boat;
			}
		}
		return Vehicles;
	}

	/** 
	 * Imprime la lista de veh�culos creados 
	 */
	public void show(Vehicle[] Vehicles) {
		for (int j = 0; j < Vehicles.length; j++) {
			System.out.println(Vehicles[j]);
		}
	}
}