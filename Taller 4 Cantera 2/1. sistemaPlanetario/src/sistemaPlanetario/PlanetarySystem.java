package sistemaPlanetario;

/**
 * Aplicación que trata de objetos del sistema planetario.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 * 
 */

public abstract class PlanetarySystem {

	/**
	 * Atributos de la clase planetarySystem
	 * 
	 * id : Identificador único del planeta name : Nombre del planeta mass : Masa
	 * del planeta density : Densidad del planeta diameter : Diámetro del planeta
	 * sunDistance : Distancia al sol
	 */

	private int id;
	private String name;
	private double mass;
	private double density;
	private double diameter;
	private double sunDistance;

	/**
	 * Constructor para ser llamado desde la clase extendida Attraction
	 */

	public PlanetarySystem() {
		super();
	}

	/**
	 * Constructor con todos los parámetros de entrada
	 * 
	 * @param id
	 * @param name
	 * @param mass
	 * @param density
	 * @param diameter
	 * @param sunDistance
	 */
	public PlanetarySystem(int id, String name, double mass, double density, double diameter, double sunDistance) {
		super();
		this.id = id;
		this.name = name;
		this.mass = mass;
		this.density = density;
		this.diameter = diameter;
		this.sunDistance = sunDistance;
	}

	/**
	 * Método para obtener valor de id
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Método para modificar el valor de id
	 * 
	 * @param id : Identificador
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Método para obtener valor de Name
	 * 
	 * @return name : Nombre
	 */
	public String getName() {
		return name;
	}

	/**
	 * Método para modificar el valor de Name
	 * 
	 * @param name : Nombre
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Método para obtener valor de Mass
	 * 
	 * @return mass : Masa
	 */
	public double getMass() {
		return mass;
	}

	/**
	 * Método para modificar el valor de Mass
	 * 
	 * @param mass : Masa
	 */
	public void setMass(double mass) {
		this.mass = mass;
	}

	/**
	 * Método para obtener valor de density
	 * 
	 * @return density : Densidad
	 */
	public double getDensity() {
		return density;
	}

	/**
	 * Método para modificar el valor de density
	 * 
	 * @param density : Densidad
	 */
	public void setDensity(double density) {
		this.density = density;
	}

	/**
	 * Método para obtener valor de diameter
	 * 
	 * @return diameter : Diametro
	 */
	public double getDiameter() {
		return diameter;
	}

	/**
	 * Método para modificar el valor de diameter
	 * 
	 * @param diameter : Diametro
	 */
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	/**
	 * Método para obtener valor de sunDistance
	 * 
	 * @return sunDistance : Distancia al sol
	 */
	public double getSunDistance() {
		return sunDistance;
	}

	/**
	 * Método para modificar el valor de sunDistance
	 * 
	 * @param sunDistance : Distancia al sol
	 */
	public void setSunDistance(double sunDistance) {
		this.sunDistance = sunDistance;
	}

	/**
	 * Método para obtener la atracción grabitaoria entre dos cuerpos
	 * 
	 * @param planet1 : Objeto 1 tipo planetarySystem
	 * @param planet2 : Objeto 2 tipo planetarySystem
	 */
	public void gravitationalAttraction(PlanetarySystem planet1, PlanetarySystem planet2) {
	}

	/**
	 * Sobreescritura del método To String
	 */
	@Override
	public String toString() {
		return "Planeta = " + name + " //  Id = " + id + " // Masa = " + mass + " Kg" + " // Densidad = " + density
				+ " Kg/m3" + " // Diámetro = " + diameter + " Km" + " // Distancia al sol = " + sunDistance + " Km";
	}

}