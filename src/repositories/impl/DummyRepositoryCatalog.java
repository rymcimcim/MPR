package repositories.impl;

import domain.Person;
import domain.Role;
import repositories.IRepository;
import repositories.IRepositoryCatalog;
import repositories.IEmployeeRepository;

public class DummyRepositoryCatalog implements IRepositoryCatalog{

	DummyDb db = new DummyDb();
	
	@Override
	public IEmployeeRepository getEmployees() {
		return new DummyEmployeeRepository(db);
	}

	@Override
	public IRepository<Person> getPersons() {
		return new DummyPersonRepository(db);
	}

	@Override
	public IRepository<Role> getRoles() {
		return new DummyRoleRepository(db);
	}

}