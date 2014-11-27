package domain;

import java.util.ArrayList;
import java.util.List;


public class Employee extends Entity{
	
	private String salary;
	private String bonus;
	private String workplace;
	private Person person;
	private List<Role> roles;
	
	public Employee() {
		roles = new ArrayList<Role>();
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String string) {
		this.salary = string;
	}
	public String getBonus() {
		return bonus;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String string) {
		this.workplace = string;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}
