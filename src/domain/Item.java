package domain;

import java.util.ArrayList;


public class Item extends Entity{
	
	private String name;
	private ArrayList<Workplace> workplace;
	private float cost;
	private String material;
	
	public Item() {
		this.workplace = new ArrayList<Workplace>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Workplace> getWorkplace() {
		return workplace;
	}
	public void setWorkplace(ArrayList<Workplace> fromWhere) {
		this.workplace = fromWhere;
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
