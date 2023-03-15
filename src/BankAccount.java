/**
 * Clase que representa la cuenta bancaria de una persona o entidad.
 * 
 * @author Jorge Gomez.
 *
 */
public class BankAccount {
	/**
	 * Representa el id o número de una cuenta bancaria.
	 */
	private int accountNumber;
	/**
	 * Representa el estado de la cuenta bancaria.
	 */
	protected boolean activated;
	
	/**
	 * Metodo constructor que inicializa las varibles declaradas en la parte inicial de la clase.
	 */
	public BankAccount() {
		this.accountNumber = 123456789;
		this.activated = true;
	}
	
	
	/**
	 * Obtiene el número de cuenta de una entidad o persona.
	 * @return número de cuenta.
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Asigna el número de cuenta de una entidad o persona.
	 * @param accountNumber es el número de la cuenta.
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Obtiene el estado de la cuenta.
	 * @return el estado de la cuenta.
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * Asigna un estado a la cuenta.
	 * @param activated es el estado en el que se encuentra la cuenta.
	 */
	public void setActivated(boolean activated) {
		this.activated = activated;
	}	
	
}
