package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;

import domain.Employee;

public class EmployeeRepository extends Repository<Employee>{

	private String insertSql=
			"INSERT INTO employee(salary,bonus) VALUES(?,?)";
	
	private String updateSql=
			"UPDATE employee SET (salary,bonus)=(?,?) WHERE id=?";
	
	public EmployeeRepository(Connection connection,
			IEntityBuilder<Employee> builder) {
		super(connection, builder);	
	}
	@Override
	protected void setUpUpdateQuery(Employee entity) throws SQLException {
		update.setFloat(1, entity.getSalary());
		update.setFloat(2, entity.getBonus());
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
		return insertSql;
	}

	@Override
	protected String getUpdateQuery() {
		return updateSql;
	}

}
