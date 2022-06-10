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

public class Main1 {

	/**
	 * @param args : Argumento del m�todo main
	 */
	public static void main(String[] args) {

		/**
		 * Instancia de la clase Fruits
		 */
		Fruits fruits = new Fruits();

		/**
		 * llamado del m�todo set para cada fruta
		 */
		fruits.setApplePrice(1500);
		fruits.setBananaPrice(600);
		fruits.setCherryPrice(5000);
		fruits.setLemonPrice(400);

		/**
		 * Impresi�n en connsola de los precios de las frutas
		 */
		System.out.println("            Venta de Frutas");
		System.out.println(" Manzana       $" + fruits.getApplePrice());
		System.out.println(" Banano        $" + fruits.getBananaPrice());
		System.out.println(" Cereza        $" + fruits.getCherryPrice());
		System.out.println(" Limon         $" + fruits.getLemonPrice());

	}
}
