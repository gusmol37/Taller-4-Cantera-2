package variosVehiculos;

/**
 * Clase que hereda de la clase veh�culo
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @versio 1.0.0 2022-06-09
 */

public class Airplane extends Vehicle{

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
    public Airplane(int id, String environment, int crewSize, int numPassengers, double rateAccelerate, String dateRegister) {
        super(id, environment, crewSize, numPassengers, rateAccelerate, dateRegister);
        this.environment = "air";
        this.crewSize = 2;
    }


    /**
     * M�todo para validar si la velocidad inicial es suficiente para el despegue del avi�n.
     */
    public void takeOff(){
        double v0 = getVelocity();
        if (v0 < 100) {
            System.out.println("Velocidad insuficiente para el despegue.");
        }
        else {
            System.out.println("Velocidad v�lida para el despegue.");
        }
    }

}