import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa un estudiante y algunos de sus atributos.
 * 
 * @author Jorge Gomez.
 *
 */
public class Student {
	/**
	 * Representa nombre del estudiante.
	 */
	public String name;
	/**
	 * Representa apellido del estudiante.
	 */
	public String lastName;
	/**
	 * Representa identificacion del estudiante.
	 */
	public String id;
	/**
	 * Representa el grado o año escolar del estudiante.
	 */
	private int grade;
	/**
	 * Representa la lista de cursos o materias del estudiante.
	 */
	private List<String> topics;
	
	/**
	 * Metodo constructor que inicializa las varibles declaradas en la parte inicial de la clase.
	 */
	public Student() {
		this.name = "Jorge";
		this.lastName = "Gomez";
		this.id = "123456789";
		this.grade = 11;
		this.topics = new ArrayList<>();
	}
	
	/**
	 * Obtiene el nombre del estudiante.
	 * @return el nombre del estudiante.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Obtiene el apellido del estudiante.
	 * @return el apellido del estudiante.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Obtiene el id del estudiante.
	 * @return el id del estudiante.
	 */
	private String getId() {
		return id;
	}

	/**
	 * Asigna un id al estudiante.
	 * @param id es el identificador del estudiante.
	 */
	private void setId(String id) {
		this.id = id;
	}

	/**
	 * Obtiene el grado escolar del estudiante.
	 * @return el grado escolar del estudiante.
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * Asigna un grado escolar al estudiante.
	 * @param grade es el grado escolar del estudiante.
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * Obtiene la lista de cursos o materias del estudiante.
	 * @return la lista de cursos o materias del estudiante.
	 */
	protected List<String> getTopics() {
		return topics;
	}

	/**
	 * Asigna una lista de cursos o materias del estudiante.
	 * @param topics es la lista de cursos o materias del estudiante.
	 */
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	
}
