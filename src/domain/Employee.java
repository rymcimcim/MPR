package domain;

import java.util.List;


public class Employee extends Person{
	
	private String salary;
	private float bonus;
	private String workplace;
	private Person person;
	
	public Employee(String workplace) {
		this.workplace = workplace;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String string) {
		this.salary = string;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
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
	
	public void add(List<Employee> result) {
		// TODO Auto-generated method stub
		
	} 
}
