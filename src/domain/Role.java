package domain;

import java.util.*;

public class Role extends Entity  {

	private String name;
	private List<Privilege> privilege;
	private List<Employee> employees;
	
	public Role()
	{
		privilege = new ArrayList<Privilege>();
		employees = new ArrayList<Employee>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Privilege> getPrivilege() {
		return privilege;
	}
	public void setPrivilege(List<Privilege> privilege) {
		this.privilege = privilege;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}