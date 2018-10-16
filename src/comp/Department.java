package comp;

import javax.persistence.*;

@Entity
@Table(name = "Department")
public class Department {
	@Id
	@Column(name = "deptno")
	private int deptno;

	@Column(name = "deptname")
	private String deptname;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_id")
	private Employees employees;

	public Department() {
		super();
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

}
