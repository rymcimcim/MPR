package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;

import unitofwork.IUnitOfWork;
import domain.Item;

public class ItemRepository extends Repository<Item>{
	

	public ItemRepository(Connection connection, IEntityBuilder<Item> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
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
		return "insert into items(name,material,cost) values(?,?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update items set (name,material,cost)=(?,?,?)"
				+ "where id=?";
	}

}
