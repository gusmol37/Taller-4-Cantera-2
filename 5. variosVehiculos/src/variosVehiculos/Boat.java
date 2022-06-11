package variosVehiculos;

/**
 * Clase que hereda de la clase veh�culo

 * @author Gustavo Molina <gusmol37@gmail.com>
 * @versio 1.0.0 2022-06-09
 */

public class Boat extends Vehicle {

    /**
     * Constructor
     *
     * @param id             n�mero de identificaci�n del veh�culo.
     * @param environment    medio de desplazamiento (terrestre, a�reo, mar�timo)
     * @param crewSize       capacidad de carga
     * @param numPassengers  cantidad de pasajeros
     * @param rateAccelerate tope m�ximo de aceleraci�n en Km/h
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