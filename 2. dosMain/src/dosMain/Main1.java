package dosMain;

/**
 * ¡IMPORTANTE! Este programa se debe ejecutar desde el Main2
 * 
 */

/**
* Cuando ejecutamos un pograma, vemos que sí es posible tener un programa con más de una clase que incorporen el método main. 
* Para ello, debemos ejecutar a partir de la clase considerada principal, se puede diferenciar con el nombre y 
* la ubicación en otro paquete.
*/

/**
 * Clase Main1 la cual contiene método principal. Esta muestra el valor de las frutas.
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
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
		fruits.setLuloPrice(1500);
		fruits.setPineapplePrice(600);
		fruits.setMangoPrice(5000);
		fruits.setMandarinaPrice(400);

		/**
		 * Impresión en connsola de los precios de las frutas
		 */
		System.out.println(" ");
		System.out.println("            ******* Frutas para la venta *******");
		System.out.println(" ");
		System.out.println(" Lulo       		$" + fruits.getLuloPrice());
		System.out.println(" Piña        		$" + fruits.getPineapplePrice());
		System.out.println(" Mango        		$" + fruits.getMangoPrice());
		System.out.println(" Mandarina         	$" + fruits.getMandarinaPrice());
		System.out.println(" ---------------------------------");

	}
}
