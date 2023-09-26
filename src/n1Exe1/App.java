package n1Exe1;

public class App {

	public static void main(String[] args) {

		Employee employee1 = new Employee_InOffice("name", "surname", 100);
		System.out.println("Salary in Office: " + employee1.employeeSalaryCalculation(40));
		
		Employee employee2 = new Employee_Online("name", "surnae", 100);
		System.out.println("Salary online: " + employee2.employeeSalaryCalculation(40));
		
		
	}

}
