package sistemaPlanetario;

/**
 * Aplicaci�n que trata de objetos del sistema planetario.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0
 * 
 */

public abstract class PlanetarySystem {

	/**
	 * Atributos de la clase planetarySystem
	 * 
	 * id : Identificador �nico del planeta name : Nombre del planeta mass : Masa
	 * del planeta density : Densidad del planeta diameter : Di�metro del planeta
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
	 * Constructor con todos los par�metros de entrada
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
	 * M�todo para obtener valor de id
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * M�todo para modificar el valor de id
	 * 
	 * @param id : Identificador
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * M�todo para obtener valor de Name
	 * 
	 * @return name : Nombre
	 */
	public String getName() {
		return name;
	}

	/**
	 * M�todo para modificar el valor de Name
	 * 
	 * @param name : Nombre
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * M�todo para obtener valor de Mass
	 * 
	 * @return mass : Masa
	 */
	public double getMass() {
		return mass;
	}

	/**
	 * M�todo para modificar el valor de Mass
	 * 
	 * @param mass : Masa
	 */
	public void setMass(double mass) {
		this.mass = mass;
	}

	/**
	 * M�todo para obtener valor de density
	 * 
	 * @return density : Densidad
	 */
	public double getDensity() {
		return density;
	}

	/**
	 * M�todo para modificar el valor de density
	 * 
	 * @param density : Densidad
	 */
	public void setDensity(double density) {
		this.density = density;
	}

	/**
	 * M�todo para obtener valor de diameter
	 * 
	 * @return diameter : Diametro
	 */
	public double getDiameter() {
		return diameter;
	}

	/**
	 * M�todo para modificar el valor de diameter
	 * 
	 * @param diameter : Diametro
	 */
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	/**
	 * M�todo para obtener valor de sunDistance
	 * 
	 * @return sunDistance : Distancia al sol
	 */
	public double getSunDistance() {
		return sunDistance;
	}

	/**
	 * M�todo para modificar el valor de sunDistance
	 * 
	 * @param sunDistance : Distancia al sol
	 */
	public void setSunDistance(double sunDistance) {
		this.sunDistance = sunDistance;
	}

	/**
	 * M�todo para obtener la atracci�n grabitaoria entre dos cuerpos
	 * 
	 * @param planet1 : Objeto 1 tipo planetarySystem
	 * @param planet2 : Objeto 2 tipo planetarySystem
	 */
	public void gravitationalAttraction(PlanetarySystem planet1, PlanetarySystem planet2) {
	}

	/**
	 * Sobreescritura del m�todo To String
	 */
	@Override
	public String toString() {
		return "Planeta = " + name + " //  Id = " + id + " // Masa = " + mass + " Kg" + " // Densidad = " + density
				+ " Kg/m3" + " // Di�metro = " + diameter + " Km" + " // Distancia al sol = " + sunDistance + " Km";
	}

}