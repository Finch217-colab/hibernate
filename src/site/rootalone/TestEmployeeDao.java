package site.rootalone;

import java.util.Date;

import org.junit.Test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TestEmployeeDao {
	
	private IEmployeeDao dao = new EmployeeDao();

	@Test
	public void testSave() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("永强");
		emp.setBirth(new Date());
		emp.setDept("Java Development");
		dao.save(emp);
	}

	@Test
	public void testUpdate() {
		Employee emp = new Employee();
		emp = dao.findById(1);
		emp.setName("玉田");
		emp.setBirth(new Date());
		emp.setDept("C Development");
		dao.update(emp);
	}
	
	@Test
	public void testHibernatConfig(){
       		Configuration config = new Configuration();
        	config.configure("hibernate.cfg.xml");
        	SessionFactory sf = config.buildSessionFactory();
        	Session s = sf.openSession();
	}

}
