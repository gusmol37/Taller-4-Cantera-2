package sistemaPlanetario;

/**
 * Aplicación que trata de objetos del sistema planetario.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 * 
 */

public class AttractionForce extends PlanetarySystem {

	/**
	 * Declaración de método gravitationalAttraction, para determiar fuerza de
	 * atraccion aplicado la respectiva formula matematica.
	 * 
	 * @param planet1 : objeto 1 de tipo planetarySystem, que corresponde a el
	 *                planeta 1.
	 * @param planet2 : objeto 2 de tipo planetarySystem, que corresponde a el
	 *                planeta 2.
	 */
	public void gravitationalAttraction(PlanetarySystem planet1, PlanetarySystem planet2) {

		/**
		 * gravitationalConstant : Valor de la costate gravitacional
		 */
		double gravitationalConstant = 6.67384 * 80 * (Math.pow(10, -11));

		/**
		 * gravity = Valor de la atracción gravitatoria determinada por formula
		 * matematica
		 */
		double gravity = gravitationalConstant * ((planet1.getMass() * planet2.getMass())
				/ Math.pow((planet1.getSunDistance() - planet2.getSunDistance()), 2));
		System.out.println(gravity);
	}

}
