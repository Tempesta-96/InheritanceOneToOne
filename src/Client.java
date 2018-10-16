
import java.util.*;

import comp.Department;
import comp.Emp_Dept_Manage;
import comp.Employees;
public class Client {
	public static void main(String[] args) {
		Emp_Dept_Manage ed = new Emp_Dept_Manage();
		
		ed.insertEmp(10, "Smith", 4500.00);
		ed.insertEmp(20, "Sam", 4500.00);
		ed.insertEmp(30, "Samule", 4500.00);
		
		ed.insertDept("Accounts", 30, 10);
		ed.insertDept("Sales", 40, 20);
		
//		Department d = ed.fetchDept(30);
//		System.out.println("Dept Name : " + d.getDeptname());
//		System.out.println("Dept No : " +d.getDeptno());
//		System.out.println("Emp No : " +d.getEmployees().getE_code());
//		System.out.println("Emp name : " +d.getEmployees().getEname());
//		System.out.println("Emp Sal : " +d.getEmployees().getSal());
		
		Employees emp = ed.fetchEmp(10);
		System.out.println("Employee name is : "+emp.getEname());
		System.out.println("Employee salary is : "+emp.getSal());
		System.out.println("Employee id is : "+emp.getE_code());
		System.out.println("Employee join date is : "+emp.getJoindate());
		System.out.println("Dept name : "+ emp.getDept().getDeptname());
		System.out.println("Dept no : "+emp.getDept().getDeptno());
		
	}
}
