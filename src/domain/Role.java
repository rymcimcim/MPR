package domain;
import java.util.List;


public class Role {
	
	private String name;
	private List<Privilage> privilage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Privilage> getPrivilage() {
		return privilage;
	}
	public void setPrivilage(List<Privilage> privilage) {
		this.privilage = privilage;
	}
}
