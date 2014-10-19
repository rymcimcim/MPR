package repositories.impl;

import repositories.IRepositoryCatalog;
import repositories.IEmployeeRepository;

public class DummyRepositoryCatalog implements IRepositoryCatalog{

	DummyDb db = new DummyDb();
	
	@Override
	public IEmployeeRepository getEmployees() {
		return new DummyEmployeeRepository(db);
	}

}