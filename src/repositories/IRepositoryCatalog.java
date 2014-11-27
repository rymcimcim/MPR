package repositories;

import domain.Person;
import domain.Role;

public interface IRepositoryCatalog {

	public IEmployeeRepository getEmployees();
	public IRepository<Person> getPersons();
	public IRepository<Role> getRoles();
}