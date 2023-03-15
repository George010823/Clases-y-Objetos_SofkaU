import java.time.LocalDate;
/**
 * Clase que representa un carro y algunos de sus atributos.
 * 
 * @author Jorge Gomez.
 *
 */
public class Car {
	/**
	 * Representa marca del carro.
	 */
	public String make;
	/**
	 * Representa el año del modelo del carro.
	 */
	public LocalDate year;
	/**
	 * Representa el cilindraje del carro.
	 */
	public String cylinder;
	/**
	 * Representa el color del carro.
	 */
	public String color;
	/**
	 * Representa el kilometraje del carro.
	 */
	public float mileage;
	
	/**
	 * Metodo constructor que inicializa las varibles declaradas en la parte inicial de la clase.
	 */
	public Car() {
		this.make = "Nissan";
		this.year = LocalDate.of(1984, 0, 0);
		this.cylinder = "3600";
		this.color = "Negro";
		this.mileage = 500F;
	}
	
	/**
	 * Obtiene la marca del carro.
	 * @return la marca del carro.
	 */
	public String getMarca() {
		return make;
	}
	
	/**
	 * Asigna una marca a un carro.
	 * @param marca es la marca del carro.
	 */
	public void setMarca(String marca) {
		this.make = marca;
	}
	
	/**
	 * Obtiene el año modelo del carro.
	 * @return el año modelo del carro.
	 */
	public LocalDate getModelo() {
		return year;
	}
	
	/**
	 * Asigna un año modelo a un carro.
	 * @param modelo es el año modelo del carro.
	 */
	public void setModelo(LocalDate modelo) {
		this.year = modelo;
	}
	
	/**
	 * Obtiene el cilindraje del carro.
	 * @return el cilindraje del carro.
	 */
	public String getCilindraje() {
		return cylinder;
	}
	
	/**
	 * Asigna el cilindraje a un carro.
	 * @param cilindraje es el cilindraje del carro.
	 */
	public void setCilindraje(String cilindraje) {
		this.cylinder = cilindraje;
	}
	
	/**
	 * Obtiene el color del carro.
	 * @return el color del carro.
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Asigna un color a un carro.
	 * @param color es color del carro.
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Obtiene el kilometraje del carro.
	 * @return el kilometraje del carro.
	 */
	public float getKilometraje() {
		return mileage;
	}
	
	/**
	 * Asigna el kilometraje a un carro.
	 * @param kilometraje es el kilometraje del carro.
	 */
	public void setKilometraje(float kilometraje) {
		this.mileage = kilometraje;
	}
	
}
