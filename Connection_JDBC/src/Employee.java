import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	private int empID;
	private String empName;
	private String emdepartment;

	public Employee(int empID, String empName, String emdepartment) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.emdepartment = emdepartment;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmdepartment() {
		return emdepartment;
	}

	public void setEmdepartment(String emdepartment) {
		this.emdepartment = emdepartment;
	}

	public int compareTo(Employee o) {
		return this.getEmpID() - o.getEmpID();
	}


	
	

}
