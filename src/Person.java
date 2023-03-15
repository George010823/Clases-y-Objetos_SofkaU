import java.time.LocalDate;
/**
 * Clase que representa una persona y algunos de sus atributos.
 * 
 * @author Jorge Gomez.
 *
 */
public class Person {
	/**
	 * Representa el nombre de la persona.
	 */
	public String name;
	/**
	 * Representa el primer apellido de la persona.
	 */
	public String lastName1;
	/**
	 * Representa el segundo apellido de la persona.
	 */
	public String lastName2;
	/**
	 * Representa la fecha de cumpleaños de la persona.
	 */
	public LocalDate dateBirth;
	/**
	 * Representa la altura de la persona.
	 */
	public float height;
	
	/**
	 * Metodo constructor que inicializa las varibles declaradas en la parte inicial de la clase.
	 */
	public Person() {
		this.name = "Jorge";
		this.lastName1 = "Gomez";
		this.lastName2 = "Restrepo";
		this.dateBirth = LocalDate.of(1984, 10, 8);
		this.height = 1.69F;
	}
	
	/**
	 * Obtiene el nombre de la persona.
	 * @return El nombre de la persona.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Asigna el primer apellido de la persona.
	 * @param name nombre de la persona.
	 * @return el nombre que fue asignado a la persona.
	 */
	public String setName(String name) {
		return name;
	}
	
	/**
	 * Obtiene el primer apellido de la persona.
	 * @return el apellido de la persona.
	 */
	public String getLastName1() {
		return this.lastName1;
	}
	
	/**
	 * Asigna el primer apellido de la persona.
	 * @param lastName1 es el primer apellido de la persona.
	 * @return el primer apellido de la persona
	 */
	public void setLastName1(String lastName1) {
		 this.lastName1 = lastName1;
	}

	/**
	 * Obtiene el segundo apellido de la persona.
	 * @return el segundo apellido de la persona.
	 */
	public String getLastName2() {
		return lastName2;
	}

	/**
	 * Asigna el primer apellido de la persona.
	 * @param lastName2 es el segundo apellido de la persona.
	 */
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	/**
	 * Obtiene la fecha de nacimiento de la persona.
	 * @return la fecha de nacimiento de la persona.
	 */
	public LocalDate getDateBirth() {
		return dateBirth;
	}

	/**
	 * Asigna una fecha de nacimiento a una persona.
	 * @param dateBirth es la fecha de nacimeinto de la persona
	 */
	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}
	
	/**
	 * Obtiene la altura de una persona.
	 * @return la altura de una persona.
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * Asigna una altura a una persona.
	 * @param height es la altura de una persona.
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
	
}
