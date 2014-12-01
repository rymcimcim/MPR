<<<<<<< HEAD
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
=======
package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Employee;
import domain.Entity;
import repositories.IRepository;

public class EmployeeRepository implements IRepository<Employee>{

	private Connection connection;
	
	private String insertSql = 
			"INSERT INTO employees(workplace, salary)"
			+ "VALUES(?,?)";
	private String selectByIDSql =
			"SELECT * FROM employees WHERE id=?";
	private String updateSql=
			"UPDATE employees SET (workplace, salary)=(?,?) WHERE id=?";
	private String deleteSql=
			"DELETE FROM employees WHERE id=?";
	private String selectAllSql=
			"SELECT * FROM employees";
	
	
	PreparedStatement selectByID;
	PreparedStatement insert;
	PreparedStatement update;
	PreparedStatement delete;
	PreparedStatement selectAll;

	
	public EmployeeRepository(Connection connection) {
		
		this.connection = connection;
		try {
			insert = connection.prepareStatement(insertSql);
			selectByID=connection.prepareStatement(selectByIDSql);
			update=connection.prepareStatement(updateSql);
			delete=connection.prepareStatement(deleteSql);
			selectAll=connection.prepareStatement(selectAllSql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(Employee entity) {
		
		try {
			insert.setString(1, entity.getWorkplace());
			insert.setString(2, entity.getSalary());
			insert.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Employee entity) {

		try {
			update.setString(1, entity.getWorkplace());
			update.setString(2, entity.getSalary());
			update.setInt(3, entity.getId());
			update.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void delete(Employee entity) {

		try {
			delete.setInt(1, entity.getId());
			delete.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

	@Override
	public Employee get(int id) {
		Employee result = null;
		
		try {
			selectByID.setInt(1, id);
			ResultSet rs = selectByID.executeQuery();
			while(rs.next())
			{
				result = new Employee();
				result.setId(rs.getInt("id"));
				result.setWorkplace(rs.getString("workplace"));
				result.setSalary(rs.getString("salary"));
				return result;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return result;
	}

	@Override
	public List<Employee> getAll() {

		List<Employee> result = new ArrayList<Employee>();
		
		try {
			ResultSet rs = selectAll.executeQuery();
			while(rs.next())
			{
				Employee employees = new Employee();
				employees.setId(rs.getInt("id"));
				employees.setWorkplace(rs.getString("workplace"));
				employees.setSalary(rs.getString("salary"));
				result.add(employees);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
>>>>>>> refs/remotes/origin/master
