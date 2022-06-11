package variosVehiculos;

/**
 * Clase que hereda de la clase vehículo

 * @author Gustavo Molina <gusmol37@gmail.com>
 * @versio 1.0.0 2022-06-09
 */

public class Boat extends Vehicle {

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
    public Boat(int id, String environment, int crewSize, int numPassengers, double rateAccelerate, String dateRegister) {
        super(id, environment, crewSize, numPassengers, rateAccelerate, dateRegister);
        this.environment = "water";
    }


    /**
     *
     */
    public void dropAnchor(){
        if (getVelocity()<10){
            System.out.println("Puedes echar el ancla.");
        }
        else
        {
            System.out.println("No debes poner el ancla.");
        }
    }


}