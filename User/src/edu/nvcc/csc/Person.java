package edu.nvcc.csc;
/**
 * Person class is a class containing of user name, password, account type.
 * @author Tanes Kanchanawanchai
 * Oct 20, 2014
 */
public class Person {
	String username;
	String password;
	String accountType;
	
	/**
	 * Constructs a new person that holds username = "John", password = "Doe", and account type = "Staff"
	 */
	public Person() {
		this.username = "John";
		this.password = "Doe";
		this.accountType = "Staff";
	}
	
	/**
	 * Constructs a new person that holds username, password, and account type based on the arguments
	 */
	public Person(String username, String password, String accountType) {
		this.username = username;
		this.password = password;
		this.accountType = accountType;		
	}

	/**
	 * Gets user name
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets user name
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets password
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets password
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets account type
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Sets account type
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/* *
	 * Gets username, password, account type 
	 * @return the Person attributes
	 */
	@Override
	public String toString() {
		return "Person [username=" + username + ", password=" + password
				+ ", accountType=" + accountType + "]";
	}
	
}
