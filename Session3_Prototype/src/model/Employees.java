package model;

import java.util.ArrayList;

public class Employees implements Cloneable {
	ArrayList<Employee> empList  = new ArrayList<Employee>();

	public Employees(ArrayList<Employee> empList) {
		super();
		this.empList = empList;
	}
	public Employees() {
		// TODO Auto-generated constructor stub
	}
	//simulation a db
	public void loadData() {
		this.empList.add(new Employee("Budak 2",2));
		this.empList.add(new Employee("Budak 3",2));
		this.empList.add(new Employee("Budak 4",2));
	}
	
	public ArrayList<Employee> getEmployees(){
		return this.empList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		ArrayList<Employee> newEmpList = new ArrayList<Employee>();
		for (Employee employee : this.empList) {
			newEmpList.add(employee);
			System.out.println(employee.getName());
		}
		return new Employees(newEmpList);
	}
	
	
	
}
