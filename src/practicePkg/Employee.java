package practicePkg;


public class Employee{
	
	String department ;
	double salary;
	String name;
	
	public Employee(String department, double salary) {
		super();
		this.department = department;
		this.salary = salary;
	}

	public Employee(String department, double salary, String name) {
		super();
		this.department = department;
		this.salary = salary;
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}



	

	
}
