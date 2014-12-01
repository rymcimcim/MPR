package domain;
import java.util.ArrayList;


public class Workplace {
	private ArrayList<Item> items;
	private ArrayList<Address> addresses;
	
	public Workplace() {
		this.items = new ArrayList<Item>();
		this.addresses = new ArrayList<Address>();
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public ArrayList<Address> getAddress() {
		return addresses;
	}
	public void setAddress(ArrayList<Address> address) {
		this.addresses = address;
	}
}
