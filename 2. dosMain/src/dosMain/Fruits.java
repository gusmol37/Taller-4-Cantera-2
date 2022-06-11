package dosMain;

/**
 * ¡IMPORTANTE! Este programa se debe ejecutar desde el Main2
 * 
 */

/**
* Cuando ejecutamos un pograma, vemos que sí es posible tener un programa con más de una clase incorporen el método main. 
* Para ello, debemos ejecutar a partir de la clase considerada principal, se puede diferenciar con el nombre y 
* la ubicación en otro paquete.
*/

/**
 * Clase Main1 la cual contiene método principal. Esta muestra el valor de las frutas.
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
 */

public class Fruits {

	public int LuloPrice;
	public int PineapplePrice;
	public int MangoPrice;
	public int MandarinaPrice;

	/**
	 * Declaración de constructor vacio que se llamará en las clases que
	 * contienen los métodos main.
	 */
	public Fruits() {
		super();
	}

	/**
	 * Método getLuloPrice: Método que muestra el valor de getLuloPrice
	 * 
	 * @return getLuloPrice : Precio del Lulo
	 */
	public int getLuloPrice() {
		return LuloPrice;
	}

	/**
	 * Método setLuloPrice = Método que permite modificar el valor de setLuloPrice
	 * 
	 * @param setLuloPrice: Precio del Lulo
	 */
	public void setLuloPrice(int LuloPrice) {
		this.LuloPrice = 1000;
	}

	/**
	 * Método getPineapplePrice: Método que muestra el valor de PineapplePrice
	 * 
	 * @return PineapplePrice : Precio de la piña
	 */
	public int getPineapplePrice() {
		return PineapplePrice;
	}

	/**
	 * Método setPineapplePrice = Método que permite modificar el valor de
	 * PineapplePrice
	 * 
	 * @param bananaPrice
	 *            : Precio de la piña
	 */
	public void setPineapplePrice(int PineapplePrice) {
		this.PineapplePrice = 2000;
	}

	/**
	 * Método getMangoPrice: Método que muestra el valor de MangoPrice
	 * 
	 * @return MangoPrice : Precio del mango
	 */
	public int getMangoPrice() {
		return MangoPrice;
	}

	/**
	 * Método setMangoPrice = Método que permite modificar el valor de
	 * MangoPrice
	 * 
	 * @param MangoPrice
	 *            : Precio del Mango
	 */
	public void setMangoPrice(int MangoPrice) {
		this.MangoPrice = MangoPrice;
	}

	/**
	 * Método getMandarinaPrice: Método que muestra el valor de MandarinaPrice
	 * 
	 * @return MandarinaPrice : Precio de la mandarina
	 */
	public int getMandarinaPrice() {
		return MandarinaPrice;
	}

	/**
	 * Método setMandarinaPrice = Método que permite modificar el valor de
	 * MandarinaPrice
	 * 
	 * @param MandarinaPrice
	 *            : Precio de la cereza
	 */
	public void setMandarinaPrice(int MandarinaPrice) {
		this.MandarinaPrice = MandarinaPrice;
	}

}
