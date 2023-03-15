import java.time.LocalDate;
/**
 * Clase que representa un empleado y algunos de sus atributos.
 * 
 * @author Jorge Gomez.
 *
 */
public class Employee {
	/**
	 * Representa el nombre del empleado.
	 */
	public String name;
	/**
	 * Representa el primer apellido del empleado.
	 */
	public String lastName;
	/**
	 * Representa el identificador del empleado.
	 */
	public String id;
	/**
	 * Representa la fecha de ingreso del empleado.
	 */
	public LocalDate admission;
	/**
	 * Representa el salario del empleado.
	 */
	public float salary;
	/**
	 * Representa el cargo del empleado.
	 */
	public String role;
	
	/**
	 * Metodo constructor que inicializa las varibles declaradas en la parte inicial de la clase.
	 */
	public Employee() {
		this.name = "Jorge";
		this.lastName = "Gomez";
		this.id = "123456789";
		this.admission = LocalDate.of(1984, 10, 8);
		this.salary = 1500000F;
		this.role = "Developer";
	}
	
	/**
	 * Obtiene el nombre de la persona.
	 * @return El nombre de la persona.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Obtiene el primer apellido de la persona.
	 * @return el apellido de la persona.
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * Obtiene el id del empleado.
	 * @return el id del empleado.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Asigna una identificacion al empleado.
	 * @param id es la identificacion del empleado.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Obtiene la fecha de ingreso del empleado.
	 * @return la fecha de ingreso del empleado.
	 */
	public LocalDate getAdmission() {
		return admission;
	}

	/**
	 * Asigna una fecha de ingreso al empleado.
	 * @param admission es la fecha de ingreso del empleado.
	 */
	public void setAdmission(LocalDate admission) {
		this.admission = admission;
	}

	/**
	 * Obtiene el salario del empleado.
	 * @return el salario del empleado.
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * Asigna un salario al empleado.
	 * @param salary es el salario del empleado.
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	/**
	 * Obtiene el cargo del empleado.
	 * @return el cargo del empleado.
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Asigna un cargo al empleado.
	 * @param role es el cargo del empleado.
	 */
	public void setRole(String role) {
		this.role = role;
	}
		
}
