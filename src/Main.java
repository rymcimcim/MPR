import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import domain.*;
import repositories.IRepository;
import repositories.IRepositoryCatalog;
import repositories.impl.DummyRepositoryCatalog;
import repositories.impl.UserRepository;

public class Main {

	public static void main(String[] args) {
		
		
		public static void main(String[] args) {
			String url ="jdbc:hsqldb:hsql://localhost/workdb";
			IRepositoryCatalog catalog = new DummyRepositoryCatalog();
			List<Employee> admins = catalog.getEmployees().withRole("administrator");
			String url1 ="jdbc:hsqldb:hsql://localhost/workdb";
			
			User jnowak = new User();
			jnowak.setLogin("aurbanow");
			jnowak.setPassword("qwerty");
	}

}






	
		
		


}
