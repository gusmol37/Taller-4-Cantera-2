package sistemaPlanetario;

/**
 * Aplicación que trata sobre elementos del sistema planetario.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
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
	 * @param id: número que identifica al planeta
	 * @param name: nombre del planeta
	 * @param mass: masa total del planeta
	 * @param density: densidad del planeta
	 * @param diameter: diámetro del planeta
	 * @param sunDistance: distancia entre el sol y el planeta
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
	 * @return id: número identificador del planeta
	 */
	public int getId() {
		return id;
	}

	/**
	 * Método para modificar el valor de id
	 * 
	 * @param id : número que identifica al planeta
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Método para obtener valor de Name
	 * 
	 * @return name : nombre del planeta
	 */
	public String getName() {
		return name;
	}

	/**
	 * Método para modificar el valor de Name
	 * 
	 * @param name : nombre del planeta
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Método para obtener valor de Mass
	 * 
	 * @return mass : masa total del planeta
	 */
	public double getMass() {
		return mass;
	}

	/**
	 * Método para modificar el valor de Mass
	 * 
	 * @param mass : masa total del planeta
	 */
	public void setMass(double mass) {
		this.mass = mass;
	}

	/**
	 * Método para obtener valor de density
	 * 
	 * @return density : densidad del planeta
	 */
	public double getDensity() {
		return density;
	}

	/**
	 * Método para modificar el valor de density
	 * 
	 * @param density : densidad del planeta
	 */
	public void setDensity(double density) {
		this.density = density;
	}

	/**
	 * Método para obtener valor de diameter
	 * 
	 * @return diameter : diámetro del planeta
	 */
	public double getDiameter() {
		return diameter;
	}

	/**
	 * Método para modificar el valor de diameter
	 * 
	 * @param diameter : diámetro del planeta
	 */
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	/**
	 * Método para obtener valor de sunDistance
	 * 
	 * @return sunDistance : distancia entre el sol y el planeta
	 */
	public double getSunDistance() {
		return sunDistance;
	}

	/**
	 * Método para modificar el valor de sunDistance
	 * 
	 * @param sunDistance : distancia entre el sol y el planeta
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