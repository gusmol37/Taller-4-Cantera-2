package variosVehiculos;

/**
 * Clase que hereda a las dem�s clases
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
     * Declaraci�n de atributos 
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
     * @param id             N�mero de identificaci�n del veh�culo.
     * @param environment    medio de desplazamiento (terrestre, a�reo, mar�timo)
     * @param crewSize       capacidad de carga
     * @param numPassengers  cantidad de pasajeros
     * @param rateAccelerate tope m�ximo de aceleraci�n en Km/h
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
     * Mm�todo para imprimir informaci�n resumida del objeto del veh�culo. * Convierte cadena de fecha a instancia de calendario.
     * @throws ParseException para dejar pasar la cadena de fecha como par�metro.
     */
    public void getInfo() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dateObj = formatter.parse(dateRegister);
        calendar.setTime(dateObj);

        System.out.println("\n Resumen de datos del veh�culo: ");
        System.out.print("ID: " + id);
        System.out.print(" | Medio de desplazamiento: " + environment);
        System.out.printf(" | Fecha de registro: %tb %<te, %<tY", calendar);
        System.out.print(" | Capacidad de personas:" + crewSize);
        System.out.print(" | Pasjeros: " + numPassengers);
        System.out.print(" | Tasa de aceleraci�n: " + rateAccelerate + " km/h.");
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
     * M�todo para obtener la velocidad (km/h).
     * @return devuelve la velocidad como un n�mero doble.
     */
    public double getRateAccelerate(){
        return this.rateAccelerate;
    }


    /**
     * M�todo para acelerar el veh�culo un determinado n�mero de veces.
     * @param pulsos de aceleraci�n.
     */
    public void accelerate(int pulses){
        double v = pulses * ( this.getVelocity() + this.getRateAccelerate() );
        this.setVelocity(v);
    }

}