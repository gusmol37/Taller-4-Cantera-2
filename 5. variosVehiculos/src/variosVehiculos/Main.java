package variosVehiculos;

/**
 * Importación de librerias 
 * ParseException para evitar errores con el tipo de dato Date // 
 * InputMismatchException para el manejo de excepciones de error en dato //
 * Scanner para capturar datos digitados 
 */

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal que crea objetos que heredan de la clase Vahículo

 * @author Gustavo Molina <gusmol37@gmail.com>
 * @versio 1.0.0 2022-06-09
 */

public class Main {

	public static void main(String[] args) throws ParseException {

		/**
		 * Definir objeto de escáner para valores de variables de entrada
		 */
		Scanner input = new Scanner(System.in);

		boolean exit = false;
		while (!exit) {

			/**
			 * Ingresa la información del objeto del vehículo. Pregunta por ID, tamaño de la
			 * tripulación, número de pasajeros, tasa de aceleración y fecha de registro.
			 */
			System.out.println("\nInformación del Vehículo: ");
			System.out.print("ingrese ID (0 to exit): ");
			int id = input.nextInt();
			if (id == 0) {
				break;
			}
			System.out.print("Indique medio de desplazamiento (terrestre, aéreo, marítimo): ");
			String environment = input.next();
			System.out.print("Indique capacidad de carga: ");
			int crewSize = input.nextInt();
			System.out.print("Indique cantidad de pasajeros: ");
			int numPassengers = input.nextInt();
			System.out.print("Indique tope máximo de aceleración: ");
			double rateAccelerate = input.nextDouble();
			System.out.print("Indique fecha de registro (dd/MM/yyyy): ");
			String dateRegister = input.next();

			/*
			 * To instance an object of vehicle class and print its summary information.
			 */
			Vehicle vehicle = new Vehicle(id, environment, crewSize, numPassengers, rateAccelerate, dateRegister);
			vehicle.getInfo();

			/*
			 * Choose vehicle type.
			 */
			try {
				System.out.println("\n Tipo de vehículo: ");
				System.out.print("Indique tipo de vehículo [1: car, 2: airplane, 3:boat, 0:exit]: ");
				int type = input.nextInt();
				switch (type) {
				case 0 -> {
					System.out.println("¡Hasta Luego!");
					exit = true;
				}
				case 1 -> {
					System.out.print("¿Cuánto nivel de aceleración va aplicar?: ");
					int pulses = input.nextInt();
					Car car = new Car(id, environment, crewSize, numPassengers, rateAccelerate, dateRegister);
					car.accelerate(pulses);
					car.getInfo();
				}
				case 2 -> {
					System.out.print("¿Cuánto nivel de aceleración va aplicar?: ");
					int pulses = input.nextInt();
					Airplane airplane = new Airplane(id, environment, crewSize, numPassengers, rateAccelerate,
							dateRegister);
					airplane.accelerate(pulses);
					airplane.getInfo();
					airplane.takeOff();
				}

				case 3 -> {
					System.out.print("¿Cuánto nivel de aceleración va aplicar?: ");
					int pulses = input.nextInt();
					Boat boat = new Boat(id, environment, crewSize, numPassengers, rateAccelerate, dateRegister);
					boat.accelerate(pulses);
					boat.getInfo();
					boat.dropAnchor();
				}
				default -> System.out.println("Solo puede seleccionar valores entre 0 y 3.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debe ingresar un número.");
			}
		}

	}

}