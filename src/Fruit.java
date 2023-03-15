import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una fruta y algunos de sus atributos.
 * 
 * @author Jorge Gomez.
 *
 */
public class Fruit {
	
	/**
	 * Representa el nombre de la fruta.
	 */
	public String name;
	/**
	 * Representa peso promedio de la fruta.
	 */
	public String averageWeight;
	/**
	 * Representa el color o colores de la fruta.
	 */
	private List<String> colores;
	
	/**
	 * Metodo constructor que inicializa las variables declaradas en la parte inicial de la clase.
	 */
	public Fruit() {
		this.name = "Sandia";
		this.averageWeight = "4.5";
		this.colores = new ArrayList<>();
	}

	/**
	 * Obtiene el nombre de la fruta.
	 * @return el nombre de la fruta.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Asigna el nombre a una fruta.
	 * @param name es el nombre de la fruta
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Obtiene el peso promedio de la fruta.
	 * @return el peso promedio de la fruta.
	 */
	public String getAverageWeight() {
		return averageWeight;
	}

	/**
	 *Asigna el peso promedio de la fruta. 
	 * @param averageWeight es el peso promedio de la fruta.
	 */
	public void setAverageWeight(String averageWeight) {
		this.averageWeight = averageWeight;
	}

	/**
	 * Obtiene una lista de colores a la fruta.
	 * @return la lista de colores de la fruta.
	 */
	public List<String> getColores() {
		return colores;
	}

	/**
	 * Asigna una lista de colores a la fruta.
	 * @param listaColores es la lista de colores asignada a la fruta.
	 */
	public void setColores(List<String> listaColores) {
		this.colores =  listaColores;
	}
	
}
