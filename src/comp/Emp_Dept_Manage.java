package comp;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class Emp_Dept_Manage {
	public void insertEmp(int code, String name, double sal) {
		SessionFactory sf = null;
		Session session = null;
		Transaction tr= null;
		try {
			sf= util.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tr = session.beginTransaction();
			Employees emp = new Employees();
			emp.setE_code(code);
			emp.setEname(name);
			emp.setJoindate(new Date());
			emp.setSal(sal);
			session.save(emp);
			tr.commit();
			
		}
		catch (Exception e) {
			System.out.println("Error with insert block");
			tr.rollback();
			session.close();
		}
	}
	public void insertDept (String name, int code, int empcode) {
		SessionFactory sf = null;
		Session session = null;
		Transaction tr= null;
		
		try {
			sf= util.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			tr= session.beginTransaction();
			Employees emp=(Employees)session.load(Employees.class, new Integer(empcode));
			Department dept = new Department();
			dept.setDeptname(name);
			dept.setDeptno(code);
			dept.setEmployees(emp);
			session.save(dept);
			tr.commit();
			
		}
		catch (Exception e) {
			System.out.println(e+"Error with insert block");
			tr.rollback();
			session.close();
		}
	}
	
	public Department fetchDept(int code) {
		SessionFactory sf = null;
		Session session = null;
		Department dept = null;
		
		try {
			sf= util.HibernateUtil.getSessionFactory();
			session=sf.openSession();
			dept=(Department)session.get(Department.class, new Integer(code));
			System.out.println("=================fetched=============");
		}
		catch (Exception e) {
			System.out.println(e+"Error with insert block");
			session.close();
		}
		return dept;
	}
	public Employees fetchEmp(int code) {
		SessionFactory sf=null;
		Session session =null;
		Employees emp = null;
		
		try {
			sf=util.HibernateUtil.getSessionFactory();
			session = sf.openSession();
			emp = (Employees)session.get(Employees.class,new Integer(code));
			System.out.println("=================fetched=============");
		}
		catch (Exception e) {
			System.out.println(e+"Error with insert block");
			session.close();
		}
		return emp;
	}
	
}
