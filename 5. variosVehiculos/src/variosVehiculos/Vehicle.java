package variosVehiculos;

/**
 * Clase que hereda a las demás clases
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @versio 1.0.0 2022-06-09
 */

/**
 * Importar de librerias y clases 
 * 
 * ParseException para evitar errores con el tipo de dato Date // 
 * java.text.SimpleDateFormat y Date para el manejo de formato de fecha //
 * Scanner para capturar datos digitados // 
 * Calendar para el manejo de fecha
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Vehicle {

    /**
     * Declaración de atributos 
     */
    private final int id;
    private final String dateRegister;
    private double velocity;
    public String environment;
    public int crewSize;
    public int numPassengers;
    public double rateAccelerate;
    public Calendar calendar = Calendar.getInstance();


    /**
     * Constructor 
     * 
     * @param id             Número de identificación del vehículo.
     * @param environment    medio de desplazamiento (terrestre, aéreo, marítimo)
     * @param crewSize       capacidad de carga
     * @param numPassengers  cantidad de pasajeros
     * @param rateAccelerate tope máximo de aceleración en Km/h
     * @param dateRegister   fecha de registro (dd/MM/yyyy)
     */
    public Vehicle(int id, String environment, int crewSize, int numPassengers, double rateAccelerate, String dateRegister){
        this.id = id;
        this.environment = environment;
        this.crewSize = crewSize;
        this.numPassengers = numPassengers;
        this.rateAccelerate = rateAccelerate;
        this.dateRegister = dateRegister;
    }


    /**
     * Mmétodo para imprimir información resumida del objeto del vehículo. * Convierte cadena de fecha a instancia de calendario.
     * @throws ParseException para dejar pasar la cadena de fecha como parámetro.
     */
    public void getInfo() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dateObj = formatter.parse(dateRegister);
        calendar.setTime(dateObj);

        System.out.println("\n Resumen de datos del vehículo: ");
        System.out.print("ID: " + id);
        System.out.print(" | Medio de desplazamiento: " + environment);
        System.out.printf(" | Fecha de registro: %tb %<te, %<tY", calendar);
        System.out.print(" | Capacidad de personas:" + crewSize);
        System.out.print(" | Pasjeros: " + numPassengers);
        System.out.print(" | Tasa de aceleración: " + rateAccelerate + " km/h.");
        System.out.println(" | Velocidad: " + velocity + " km/h.");
    }


    /**
     * Method to set velocity (km/h).
     * @param velocity vehicle velocity in kilometers by hour.
     */
    public void setVelocity(double velocity){
        this.velocity = velocity;
    }


    /**
     * Method to get velocity (km/h).
     * @return return the velocity as a double number.
     */
    public double getVelocity(){
        return this.velocity;
    }


    /**
     * Método para obtener la velocidad (km/h).
     * @return devuelve la velocidad como un número doble.
     */
    public double getRateAccelerate(){
        return this.rateAccelerate;
    }


    /**
     * Método para acelerar el vehículo un determinado número de veces.
     * @param pulsos de aceleración.
     */
    public void accelerate(int pulses){
        double v = pulses * ( this.getVelocity() + this.getRateAccelerate() );
        this.setVelocity(v);
    }

}