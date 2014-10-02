import java.util.ArrayList;


public class Warehouse {
	private ArrayList<Item> items;
	private Address address;
	
	public Warehouse() {
		this.address = new Address();
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
