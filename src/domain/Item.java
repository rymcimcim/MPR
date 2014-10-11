package domain;


public class Item {
	
	private String name;
	private int itemId;
	private Warehouse warehouse;
	private float cost;
	private String material;
	
	public Item() {
		this.warehouse = new Warehouse();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public Warehouse getFromWhere() {
		return warehouse;
	}
	public void setFromWhere(Warehouse fromWhere) {
		this.warehouse = fromWhere;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
}
