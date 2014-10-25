package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import repositories.IEmployeeRepository;
import domain.Employee;
import domain.Role;

public class DummyEmployeeRepository implements IEmployeeRepository {

	private DummyDb db;
	
	public DummyEmployeeRepository(DummyDb db) {
		super();
		this.db = db;
	}

	@Override
	public void save(Employee entity) {
		db.employees.add(entity);
	}

	@Override
	public void update(Employee entity) {
		
	}

	@Override
	public void delete(Employee entity) {
		db.employees.remove(entity);
	}

	@Override
	public Employee get(int id) {
		for(Employee u: db.employees)
			if(u.getId()==id)
				return u;
		return null;
	}

	@Override
	public List<Employee> getAll() {
		return db.employees;
	}

	@Override
	public List<Employee> withRole(Role role) {
		return withRole(role.getId());
	}

	@Override
	public List<Employee> withRole(String roleName) {

		for(Role r: db.roles)
			if(r.getName()==roleName)
				return r.getUsers();
		return new ArrayList<Employee>();
	}

	@Override
	public List<Employee> withRole(int roleId) {
		
		for(Role r: db.roles)
			if(r.getId()==roleId)
				return r.getUsers();
		return new ArrayList<Employee>();
	}

}