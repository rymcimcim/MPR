package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;

import unitofwork.IUnitOfWork;
import domain.Employee;

public class EmployeeRepository extends Repository<Employee>{

	public EmployeeRepository(Connection connection,
			IEntityBuilder<Employee> builder, IUnitOfWork uow) {
		super(connection, builder, uow);	
	}
	@Override
	protected void setUpUpdateQuery(Employee entity) throws SQLException {
		update.setFloat(1, entity.getSalary());
		update.setFloat(2, entity.getBonus());
		update.setInt(3, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Employee entity) throws SQLException {
		insert.setFloat(1, entity.getSalary());
		insert.setFloat(2, entity.getBonus());
	}

	@Override
	protected String getTableName() {
		return "employee";
	}

	@Override
	protected String getInsertQuery() {
		return "insert into emploee(salary,bonus) values(?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update employee set (salary,bonus)=(?,?)"
				+ "where id=?";
	}

}
