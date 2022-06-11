package sistemaPlanetario;

/**
 * Aplicaci�n que trata sobre elementos del sistema planetario.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @Version: 1.0.0 2022-06-09
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
	 * @param id: n�mero que identifica al planeta
	 * @param name: nombre del planeta
	 * @param mass: masa total del planeta
	 * @param density: densidad del planeta
	 * @param diameter: di�metro del planeta
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
	 * M�todo para obtener valor de id
	 * 
	 * @return id: n�mero identificador del planeta
	 */
	public int getId() {
		return id;
	}

	/**
	 * M�todo para modificar el valor de id
	 * 
	 * @param id : n�mero que identifica al planeta
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * M�todo para obtener valor de Name
	 * 
	 * @return name : nombre del planeta
	 */
	public String getName() {
		return name;
	}

	/**
	 * M�todo para modificar el valor de Name
	 * 
	 * @param name : nombre del planeta
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * M�todo para obtener valor de Mass
	 * 
	 * @return mass : masa total del planeta
	 */
	public double getMass() {
		return mass;
	}

	/**
	 * M�todo para modificar el valor de Mass
	 * 
	 * @param mass : masa total del planeta
	 */
	public void setMass(double mass) {
		this.mass = mass;
	}

	/**
	 * M�todo para obtener valor de density
	 * 
	 * @return density : densidad del planeta
	 */
	public double getDensity() {
		return density;
	}

	/**
	 * M�todo para modificar el valor de density
	 * 
	 * @param density : densidad del planeta
	 */
	public void setDensity(double density) {
		this.density = density;
	}

	/**
	 * M�todo para obtener valor de diameter
	 * 
	 * @return diameter : di�metro del planeta
	 */
	public double getDiameter() {
		return diameter;
	}

	/**
	 * M�todo para modificar el valor de diameter
	 * 
	 * @param diameter : di�metro del planeta
	 */
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	/**
	 * M�todo para obtener valor de sunDistance
	 * 
	 * @return sunDistance : distancia entre el sol y el planeta
	 */
	public double getSunDistance() {
		return sunDistance;
	}

	/**
	 * M�todo para modificar el valor de sunDistance
	 * 
	 * @param sunDistance : distancia entre el sol y el planeta
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