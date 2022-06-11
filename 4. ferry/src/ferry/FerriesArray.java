package ferry;

/**
 * Importaci�n de librerias 
 * ParseException para evitar errores con el tipo de dato Date // 
 * Date y SimpleDateFormat para el ingreso de una fecha y la modificaci�n de su formato //
 * Scanner para capturar datos digitados 
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Clase FerriesArray es usada para la creaci�n de objetos tipo veh�culo para
 * guardarlos en una lista.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
 */
public class FerriesArray {

	/**
	 * Instanciaci�n arreglo tipo Veh�culo
	 */
	Vehicle[] Vehicles = new Vehicle[10];

	/**
	 * Instanciaci�n formato de la fecha
	 */
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Instanciaci�n de la clase veh�culo
	 */
	Vehicle vehicle = new Vehicle();

	/**
	 * M�todo addArray para recibir informaci�n de los 10 objetos y a�adirlos a la
	 * lista.
	 */
	public Vehicle[] addArray() throws ParseException {

		/**
		 * Instanciaci�n de Scanner para capturar informaci�n ingresada por el usuario
		 */
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("----------------------------------------------");
			System.out.println("Indique los siguientes datos del veh�culo: ");
			System.out.println(" ");

			/**
			 * Capturar valor del n�mero de pasajeros
			 */
			System.out.println("N�mero de pasajeros: ");
			vehicle.setPassenggersNumber(input.nextInt());

			/**
			 * Captura valor de la tripulaci�n
			 */
			System.out.println("Con tripulaci�n: (true/false)");
			vehicle.setWithCrew(input.nextBoolean());

			/**
			 * Captura de n�mero de ruedas
			 */
			System.out.println("N�mero de ruedas: ");
			vehicle.setWheels(input.nextInt());

			/**
			 * Captura valor de fecha de matr�cula
			 */
			System.out.println("Fecha de matr�cula (dd/mm/yyyy): ");
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
			System.out.println("Veh�culo N�mero de pasajeros= " + Vehicles[j].getPassenggersNumber()
					+ ", �Con tripulaci�n?= " + Vehicles[j].isWithCrew() + ", Llantas= " + Vehicles[j].getWheels()
					+ ", Fecha de matr�cula= " + format.format(Vehicles[j].getRegistrationDate())
					+ ", Medio de desplazamieno= " + Vehicles[j].getMoveMeans() + ", Peso= " + Vehicles[j].getWeight()
					+ "]");
		}

	}

}