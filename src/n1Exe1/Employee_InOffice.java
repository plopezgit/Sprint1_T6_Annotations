package n1Exe1;

public class Employee_InOffice extends Employee {

	private static int employeeGasConsume = 30;
	
	public Employee_InOffice(String employeeName, String employeeSurname, int employeePriceByHour) {
		super(employeeName, employeeSurname, employeePriceByHour);

	}
	
	public static int getEmployeeGasConsume() {
		return employeeGasConsume;
	}

	@Override
	public int employeeSalaryCalculation(int employeeHoursWorked) {
		return super.employeeSalaryCalculation(employeeHoursWorked) + employeeGasConsume;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
