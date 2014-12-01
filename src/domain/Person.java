package domain;
import java.util.ArrayList;


public class Person extends Entity{
<<<<<<< HEAD

=======
	
>>>>>>> refs/remotes/origin/master
	private String name;
	private String surname;
	private String pesel;
<<<<<<< HEAD
	private ArrayList<Workplace> workplaces;
	private ArrayList<Address> address;
=======
	private ArrayList<Address> addresses;
>>>>>>> refs/remotes/origin/master
	
	private Employee employee;
	
	public Person() {
<<<<<<< HEAD
		this.address = new ArrayList<Address>();
		this.workplaces = new ArrayList<Workplace>();
=======
		this.addresses = new ArrayList<Address>();
>>>>>>> refs/remotes/origin/master
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
	public ArrayList<Workplace> getWorkplaces() {
		return workplaces;
	}

	public void setWorkplaces(ArrayList<Workplace> workplaces) {
		this.workplaces = workplaces;
	}
}
