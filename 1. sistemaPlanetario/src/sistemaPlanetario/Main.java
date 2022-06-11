package sistemaPlanetario;

/**
 * Aplicación que trata de objetos que representa elementos del sistema
 * planetario.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
 * 
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * Creación de los objetos planet1 y planet2 mediante la instancia de la clase
		 * abstracta planetarySystem.
		 */
		PlanetarySystem planet1 = new PlanetarySystem(1, "Mercurio", 1400000000, 9.54, 7894.25, 65415123) {
		};

		PlanetarySystem planet2 = new PlanetarySystem(2, "Venus", 9152458, 8.25, 15412, 306521478) {
		};

		PlanetarySystem planet3 = new PlanetarySystem(3, "La Tierra", 10514722, 10.20, 19452, 561258789) {
		};

		PlanetarySystem planet4 = new PlanetarySystem(4, "Marte", 25158748, 7.5, 19451, 825963753) {
		};

		PlanetarySystem planet5 = new PlanetarySystem(5, "Jupiter", 85274593, 10.5, 19523, 450852741) {
		};

		PlanetarySystem planet6 = new PlanetarySystem(6, "Saturno", 120547859, 7.25, 20415, 95852147) {
		};

		PlanetarySystem planet7 = new PlanetarySystem(7, "Urano", 100025225, 11.25, 21478, 450258875) {
		};

		PlanetarySystem planet8 = new PlanetarySystem(8, "Neptuno", 78529952, 9.27, 178955, 12547852) {
		};

		/**
		 * Método para imprimir atributos de los objetos
		 */
		System.out.println(planet1);
		System.out.println(planet2);
		System.out.println(planet3);
		System.out.println(planet4);
		System.out.println(planet5);
		System.out.println(planet6);
		System.out.println(planet7);
		System.out.println(planet8);

		/**
		 * Instancia de la clase AttractionForce para llamar el método que determina la
		 * fuerza de atracción
		 * 
		 */
		AttractionForce attraction = new AttractionForce();

		/**
		 * Método println para imprimir los resultados del cálculo del método de
		 * gravitationalAttraction Método gravitationalAttraction: Utilizado para
		 * determinar la fuerza de atracción de dos planetas
		 * 
		 * @param planet1 : Objeto 1 representa el primer planeta para el cálculo de
		 *                Atracción gravitatoria
		 * @param planet2 : Objeto 2 representa el segundo planeta para el cálculo de
		 *                Atracción gravitatoria
		 */

		System.out.println("");
		System.out.println("Atracción gravitatoria entre " + planet1.getName() + " y " + planet2.getName() + " es: ");
		attraction.gravitationalAttraction(planet1, planet2);

	}

}
