package repositories;

import java.util.List;

import domain.Employee;
import domain.Role;

public interface IEmployeeRepository extends IRepository<Employee>{

	/** 
	 * 
	 * Metoda wyciąga pracowników po roli
	 * */
	public List<Employee> withRole(Role role);
	public List<Employee> withRole(String roleName);
	public List<Employee> withRole(int roleId);
}