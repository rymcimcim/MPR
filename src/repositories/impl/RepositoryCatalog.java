package repositories.impl;

import java.sql.Connection;

import repositories.IRepository;
import repositories.IRepositoryCatalog;
import unitofwork.IUnitOfWork;
import domain.Employee;
import domain.Person;
import domain.Role;

public class RepositoryCatalog implements IRepositoryCatalog{

	private Connection connection;
	private IUnitOfWork uow;
	
	public RepositoryCatalog(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}
	
	@Override
	public IRepository<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRepository<Person> getPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRepository<Role> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

}
