package dosMain;

/**
* Cuando ejecutamos un pograma, vemos que sí es posible tener un programa con más de una clase incorporen el método main. 
* Para ello, debemos ejecutar a partir de la clase considerada principal, se puede diferenciar con el nombre y 
* la ubicación en otro paquete.
*/

/**
 * Clase Main1 la cual contiene método principal. Esta muestra el valor de las frutas.
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 */

public class Fruits {

	public int applePrice;
	public int bananaPrice;
	public int lemonPrice;
	public int cherryPrice;

	/**
	 * Declaración de constructor vacio que se llamará en las clases que
	 * contienen los métodos main.
	 */
	public Fruits() {
		super();
	}

	/**
	 * Método getApplePrice: Método que muestra el valor de applePrice
	 * 
	 * @return applePrice : Precio de la manzana
	 */
	public int getApplePrice() {
		return applePrice;
	}

	/**
	 * Método setApplePrice = Método que permite modificar el valor de
	 * applePrice
	 * 
	 * @param applePrice
	 *            : Precio manzana
	 */
	public void setApplePrice(int applePrice) {
		this.applePrice = 1000;
	}

	/**
	 * Método getBananaPrice: Método que muestra el valor de BananaPrice
	 * 
	 * @return bananaPrice : Precio del banano
	 */
	public int getBananaPrice() {
		return bananaPrice;
	}

	/**
	 * Método setBananaPrice = Método que permite modificar el valor de
	 * BananaPrice
	 * 
	 * @param bananaPrice
	 *            : Precio del banano
	 */
	public void setBananaPrice(int bananaPrice) {
		this.bananaPrice = 2000;
	}

	/**
	 * Método getLemonPrice: Método que muestra el valor de LemonPrice
	 * 
	 * @return lemonPrice : Precio del limon
	 */
	public int getLemonPrice() {
		return lemonPrice;
	}

	/**
	 * Método setLemonPrice = Método que permite modificar el valor de
	 * LemonPrice
	 * 
	 * @param lemonPrice
	 *            : Precio del limon
	 */
	public void setLemonPrice(int lemonPrice) {
		this.lemonPrice = lemonPrice;
	}

	/**
	 * Método getCherryPrice: Método que muestra el valor de CherryPrice
	 * 
	 * @return cherryPrice : Precio de la cereza
	 */
	public int getCherryPrice() {
		return cherryPrice;
	}

	/**
	 * Método setCherryPrice = Método que permite modificar el valor de
	 * cherryPrice
	 * 
	 * @param cherryPrice
	 *            : Precio de la cereza
	 */
	public void setCherryPrice(int cherryPrice) {
		this.cherryPrice = cherryPrice;
	}

}
