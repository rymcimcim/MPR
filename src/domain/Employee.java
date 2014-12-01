package domain;

import java.util.ArrayList;
import java.util.List;


public class Employee extends Entity{
	

	private float salary;
	private float bonus;
	private Workplace workplace;
	private Person person;
	private List<Role> roles;
	
	public Employee() {
		roles = new ArrayList<Role>();
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float string) {
		this.salary = string;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public Workplace getWorkplace() {
		return workplace;
	}
	public void setWorkplace(Workplace workplace) {
		this.workplace = workplace;

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
