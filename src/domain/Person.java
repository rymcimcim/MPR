package domain;
import java.util.ArrayList;


public class Person extends Entity{
	
	private String name;
	private String surname;
	private String pesel;
	private ArrayList<Address> addresses;
	
	private Employee employee;
	
	public Person() {
		this.addresses = new ArrayList<Address>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public ArrayList<Address> getAddress() {
		return addresses;
	}

	public void setAddress(ArrayList<Address> address) {
		this.addresses = address;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
