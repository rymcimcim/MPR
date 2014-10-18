package domain;


public class Employee extends Entity{
	
	private float salary;
	private float bonus;
	private Warehouse workplace;
	private Person person;
	
	public Employee() {
		this.workplace = new Warehouse();
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public Warehouse getWorkplace() {
		return workplace;
	}
	public void setWorkplace(Warehouse workplace) {
		this.workplace = workplace;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	} 
}
