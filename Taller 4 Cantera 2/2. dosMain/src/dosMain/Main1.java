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

public class Main1 {

	/**
	 * @param args : Argumento del método main
	 */
	public static void main(String[] args) {

		/**
		 * Instancia de la clase Fruits
		 */
		Fruits fruits = new Fruits();

		/**
		 * llamado del método set para cada fruta
		 */
		fruits.setApplePrice(1500);
		fruits.setBananaPrice(600);
		fruits.setCherryPrice(5000);
		fruits.setLemonPrice(400);

		/**
		 * Impresión en connsola de los precios de las frutas
		 */
		System.out.println("            Venta de Frutas");
		System.out.println(" Manzana       $" + fruits.getApplePrice());
		System.out.println(" Banano        $" + fruits.getBananaPrice());
		System.out.println(" Cereza        $" + fruits.getCherryPrice());
		System.out.println(" Limon         $" + fruits.getLemonPrice());

	}
}
