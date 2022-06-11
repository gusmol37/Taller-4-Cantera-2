package dosMain;

/**
 * �IMPORTANTE! Este programa se debe ejecutar desde el Main2
 * 
 */

/**
* Cuando ejecutamos un pograma, vemos que s� es posible tener un programa con m�s de una clase incorporen el m�todo main. 
* Para ello, debemos ejecutar a partir de la clase considerada principal, se puede diferenciar con el nombre y 
* la ubicaci�n en otro paquete.
*/

/**
 * Clase Main1 la cual contiene m�todo principal. Esta muestra el valor de las frutas.
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
 */

public class Fruits {

	public int LuloPrice;
	public int PineapplePrice;
	public int MangoPrice;
	public int MandarinaPrice;

	/**
	 * Declaraci�n de constructor vacio que se llamar� en las clases que
	 * contienen los m�todos main.
	 */
	public Fruits() {
		super();
	}

	/**
	 * M�todo getLuloPrice: M�todo que muestra el valor de getLuloPrice
	 * 
	 * @return getLuloPrice : Precio del Lulo
	 */
	public int getLuloPrice() {
		return LuloPrice;
	}

	/**
	 * M�todo setLuloPrice = M�todo que permite modificar el valor de setLuloPrice
	 * 
	 * @param setLuloPrice: Precio del Lulo
	 */
	public void setLuloPrice(int LuloPrice) {
		this.LuloPrice = 1000;
	}

	/**
	 * M�todo getPineapplePrice: M�todo que muestra el valor de PineapplePrice
	 * 
	 * @return PineapplePrice : Precio de la pi�a
	 */
	public int getPineapplePrice() {
		return PineapplePrice;
	}

	/**
	 * M�todo setPineapplePrice = M�todo que permite modificar el valor de
	 * PineapplePrice
	 * 
	 * @param bananaPrice
	 *            : Precio de la pi�a
	 */
	public void setPineapplePrice(int PineapplePrice) {
		this.PineapplePrice = 2000;
	}

	/**
	 * M�todo getMangoPrice: M�todo que muestra el valor de MangoPrice
	 * 
	 * @return MangoPrice : Precio del mango
	 */
	public int getMangoPrice() {
		return MangoPrice;
	}

	/**
	 * M�todo setMangoPrice = M�todo que permite modificar el valor de
	 * MangoPrice
	 * 
	 * @param MangoPrice
	 *            : Precio del Mango
	 */
	public void setMangoPrice(int MangoPrice) {
		this.MangoPrice = MangoPrice;
	}

	/**
	 * M�todo getMandarinaPrice: M�todo que muestra el valor de MandarinaPrice
	 * 
	 * @return MandarinaPrice : Precio de la mandarina
	 */
	public int getMandarinaPrice() {
		return MandarinaPrice;
	}

	/**
	 * M�todo setMandarinaPrice = M�todo que permite modificar el valor de
	 * MandarinaPrice
	 * 
	 * @param MandarinaPrice
	 *            : Precio de la cereza
	 */
	public void setMandarinaPrice(int MandarinaPrice) {
		this.MandarinaPrice = MandarinaPrice;
	}

}
