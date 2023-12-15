import java.util.stream.Stream;

import model.Employee;
import model.Employees;

public class Main {

	public static void main(String[] args) {
		Employees employees = new Employees();
		employees.loadData();
		try {
			Employees newEmployee = (Employees) employees.clone();
			for (Employee e : newEmployee.getEmployees()) {
				System.out.println(e.getName());
			}
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
