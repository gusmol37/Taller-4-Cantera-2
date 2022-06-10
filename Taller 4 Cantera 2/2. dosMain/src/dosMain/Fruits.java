package dosMain;

/**
* Cuando ejecutamos un pograma, vemos que s� es posible tener un programa con m�s de una clase incorporen el m�todo main. 
* Para ello, debemos ejecutar a partir de la clase considerada principal, se puede diferenciar con el nombre y 
* la ubicaci�n en otro paquete.
*/

/**
 * Clase Main1 la cual contiene m�todo principal. Esta muestra el valor de las frutas.
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */

public class Fruits {

	public int applePrice;
	public int bananaPrice;
	public int lemonPrice;
	public int cherryPrice;

	/**
	 * Declaraci�n de constructor vacio que se llamar� en las clases que
	 * contienen los m�todos main.
	 */
	public Fruits() {
		super();
	}

	/**
	 * M�todo getApplePrice: M�todo que muestra el valor de applePrice
	 * 
	 * @return applePrice : Precio de la manzana
	 */
	public int getApplePrice() {
		return applePrice;
	}

	/**
	 * M�todo setApplePrice = M�todo que permite modificar el valor de
	 * applePrice
	 * 
	 * @param applePrice
	 *            : Precio manzana
	 */
	public void setApplePrice(int applePrice) {
		this.applePrice = 1000;
	}

	/**
	 * M�todo getBananaPrice: M�todo que muestra el valor de BananaPrice
	 * 
	 * @return bananaPrice : Precio del banano
	 */
	public int getBananaPrice() {
		return bananaPrice;
	}

	/**
	 * M�todo setBananaPrice = M�todo que permite modificar el valor de
	 * BananaPrice
	 * 
	 * @param bananaPrice
	 *            : Precio del banano
	 */
	public void setBananaPrice(int bananaPrice) {
		this.bananaPrice = 2000;
	}

	/**
	 * M�todo getLemonPrice: M�todo que muestra el valor de LemonPrice
	 * 
	 * @return lemonPrice : Precio del limon
	 */
	public int getLemonPrice() {
		return lemonPrice;
	}

	/**
	 * M�todo setLemonPrice = M�todo que permite modificar el valor de
	 * LemonPrice
	 * 
	 * @param lemonPrice
	 *            : Precio del limon
	 */
	public void setLemonPrice(int lemonPrice) {
		this.lemonPrice = lemonPrice;
	}

	/**
	 * M�todo getCherryPrice: M�todo que muestra el valor de CherryPrice
	 * 
	 * @return cherryPrice : Precio de la cereza
	 */
	public int getCherryPrice() {
		return cherryPrice;
	}

	/**
	 * M�todo setCherryPrice = M�todo que permite modificar el valor de
	 * cherryPrice
	 * 
	 * @param cherryPrice
	 *            : Precio de la cereza
	 */
	public void setCherryPrice(int cherryPrice) {
		this.cherryPrice = cherryPrice;
	}

}
