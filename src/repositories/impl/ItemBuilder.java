package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Item;

public class ItemBuilder implements IEntityBuilder<Item>{

	@Override
	public Item build(ResultSet rs) throws SQLException {
		Item item = new Item();
		item.setId(rs.getInt("id"));
		item.setName(rs.getString("name"));
		item.setMaterial(rs.getString("material"));
		item.setCost(rs.getFloat("cost"));
		return item;
	}

}
