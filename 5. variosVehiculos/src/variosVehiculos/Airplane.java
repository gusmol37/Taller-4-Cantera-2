package variosVehiculos;

/**
 * Clase que hereda de la clase vehículo
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @versio 1.0.0 2022-06-09
 */

public class Airplane extends Vehicle{

    /**
     * Constructor
     *
     * @param id             número de identificación del vehículo.
     * @param environment    medio de desplazamiento (terrestre, aéreo, marítimo)
     * @param crewSize       capacidad de carga
     * @param numPassengers  cantidad de pasajeros
     * @param rateAccelerate tope máximo de aceleración en Km/h
     * @param dateRegister   fecha de registro (dd/MM/yyyy)
     */
    public Airplane(int id, String environment, int crewSize, int numPassengers, double rateAccelerate, String dateRegister) {
        super(id, environment, crewSize, numPassengers, rateAccelerate, dateRegister);
        this.environment = "air";
        this.crewSize = 2;
    }


    /**
     * Método para validar si la velocidad inicial es suficiente para el despegue del avión.
     */
    public void takeOff(){
        double v0 = getVelocity();
        if (v0 < 100) {
            System.out.println("Velocidad insuficiente para el despegue.");
        }
        else {
            System.out.println("Velocidad válida para el despegue.");
        }
    }

}