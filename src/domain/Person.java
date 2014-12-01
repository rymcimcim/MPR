package domain;
import java.util.ArrayList;


public class Person extends Entity{

	private String name;
	private String surname;
	private String pesel;
	private ArrayList<Workplace> workplaces;
	private ArrayList<Address> address;
	
	private Employee employee;
	
	public Person() {
		this.address = new ArrayList<Address>();
		this.workplaces = new ArrayList<Workplace>();
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
		return address;
	}

	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public ArrayList<Workplace> getWorkplaces() {
		return workplaces;
	}

	public void setWorkplaces(ArrayList<Workplace> workplaces) {
		this.workplaces = workplaces;
	}
}
