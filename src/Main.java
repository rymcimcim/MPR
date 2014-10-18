import java.util.List;

import repositories.IRepositoryCatalog;
import repositories.impl.DummyRepositoryCatalog;
import domain.Employee;


public class Main {

	public static void main(String[] args) {
		
		IRepositoryCatalog catalog = new DummyRepositoryCatalog();
		List<Employee> admins = catalog.getUsers().withRole("administrator");

	}

}