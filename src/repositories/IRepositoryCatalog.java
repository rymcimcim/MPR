package repositories;

import domain.Employee;
import domain.Person;
import domain.Role;

public interface IRepositoryCatalog {

	public IRepository<Employee> getEmployees();
	public IRepository<Person> getPersons();
	public IRepository<Role> getRoles();
}