package ferry;

/**
 * Importación de librerias 
 * ParseException para evitar errores con el tipo de dato Date // 
 * Date y SimpleDateFormat para el ingreso de una fecha y la modificación de su formato //
 * Scanner para capturar datos digitados 
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Clase FerriesArray es usada para la creación de objetos tipo vehículo para
 * guardarlos en una lista.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
 */
public class FerriesArray {

	/**
	 * Instanciación arreglo tipo Vehículo
	 */
	Vehicle[] Vehicles = new Vehicle[10];

	/**
	 * Instanciación formato de la fecha
	 */
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Instanciación de la clase vehículo
	 */
	Vehicle vehicle = new Vehicle();

	/**
	 * Método addArray para recibir información de los 10 objetos y añadirlos a la
	 * lista.
	 */
	public Vehicle[] addArray() throws ParseException {

		/**
		 * Instanciación de Scanner para capturar información ingresada por el usuario
		 */
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("----------------------------------------------");
			System.out.println("Indique los siguientes datos del vehículo: ");
			System.out.println(" ");

			/**
			 * Capturar valor del número de pasajeros
			 */
			System.out.println("Número de pasajeros: ");
			vehicle.setPassenggersNumber(input.nextInt());

			/**
			 * Captura valor de la tripulación
			 */
			System.out.println("Con tripulación: (true/false)");
			vehicle.setWithCrew(input.nextBoolean());

			/**
			 * Captura de número de ruedas
			 */
			System.out.println("Número de ruedas: ");
			vehicle.setWheels(input.nextInt());

			/**
			 * Captura valor de fecha de matrícula
			 */
			System.out.println("Fecha de matrícula (dd/mm/yyyy): ");
			Date date = format.parse(input.next());
			input.nextLine();
			vehicle.setRegistrationDate(date);

			/**
			 * Captura valor de medio de desplazamiento
			 */
			System.out.println("Medio por el cual se desplaza: ");
			vehicle.setMoveMeans(input.nextLine());

			/**
			 * Captura valor de peso
			 */
			System.out.println("Peso: ");
			vehicle.setWeight(input.nextDouble());

			Vehicle v = new Vehicle(vehicle.getPassenggersNumber(), vehicle.isWithCrew(), vehicle.getWheels(),
					vehicle.getRegistrationDate(), vehicle.moveMeans, vehicle.getWeight());

			Vehicles[i] = v;

		}
		return Vehicles;
	}

	/**
	 * Metodo show muestra datos de cada objeto
	 */
	public void show(Vehicle[] Vehicles) {
		for (int j = 0; j < Vehicles.length; j++) {
			System.out.println("Vehículo Número de pasajeros= " + Vehicles[j].getPassenggersNumber()
					+ ", ¿Con tripulación?= " + Vehicles[j].isWithCrew() + ", Llantas= " + Vehicles[j].getWheels()
					+ ", Fecha de matrícula= " + format.format(Vehicles[j].getRegistrationDate())
					+ ", Medio de desplazamieno= " + Vehicles[j].getMoveMeans() + ", Peso= " + Vehicles[j].getWeight()
					+ "]");
		}

	}

}