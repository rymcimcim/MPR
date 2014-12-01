package domain;

import java.util.ArrayList;
import java.util.List;


public class Employee extends Entity{
	
<<<<<<< HEAD
	private float salary;
	private float bonus;
	private Workplace workplace;
=======
	private String salary;
	private String bonus;
	private String workplace;
>>>>>>> refs/remotes/origin/master
	private Person person;
	private List<Role> roles;
	
	public Employee() {
<<<<<<< HEAD
		this.workplace = new Workplace();
=======
		roles = new ArrayList<Role>();
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
	public Workplace getWorkplace() {
=======
	public String getWorkplace() {
>>>>>>> refs/remotes/origin/master
		return workplace;
	}
<<<<<<< HEAD
	public void setWorkplace(Workplace workplace) {
		this.workplace = workplace;
=======
	public void setWorkplace(String string) {
		this.workplace = string;
>>>>>>> refs/remotes/origin/master
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
