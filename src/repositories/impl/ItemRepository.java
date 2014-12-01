package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;

import domain.Item;

public class ItemRepository extends Repository<Item>{
	
	private String insertSql=
			"INSERT INTO item(name,cost,material) VALUES(?,?,?)";
	
	private String updateSql=
			"UPDATE item SET (name,cost,material)=(?,?,?) WHERE id=?";

	public ItemRepository(Connection connection, IEntityBuilder<Item> builder) {
		super(connection, builder);
	}

	@Override
	protected void setUpUpdateQuery(Item entity) throws SQLException {
		update.setInt(1, entity.getId());
		update.setString(2, entity.getName());
		update.setString(3, entity.getMaterial());
		update.setFloat(4, entity.getCost());
	}

	@Override
	protected void setUpInsertQuery(Item entity) throws SQLException {
		insert.setInt(1, entity.getId());
		insert.setString(2, entity.getName());
		insert.setString(3, entity.getMaterial());
		insert.setFloat(4, entity.getCost());
	}

	@Override
	protected String getTableName() {
		return "items";
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
