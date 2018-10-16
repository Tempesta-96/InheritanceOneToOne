package comp;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Employees {
	@Id
	@Column(name="e_code")
	private int e_code;
	
	@Column(name="e_name")
	private String ename;
	
	@Column(name="e_sal")
	private double sal;
	
	@Column(name="e_joindate")
	private Date joindate;
	
	
	@OneToOne(mappedBy = "employees")
	private Department dept;
	
	public Employees() {
		super();
	}

	public int getE_code() {
		return e_code;
	}

	public void setE_code(int e_code) {
		this.e_code = e_code;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
}
