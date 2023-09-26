package n1Exe1;

public class Employee_Online extends Employee {
	
	private final int EMPLOYEE_INTERNET_INVOICE;
	
	public Employee_Online(String employeeName, String employeeSurname, int employeePriceByHour) {
		super(employeeName, employeeSurname, employeePriceByHour);
		EMPLOYEE_INTERNET_INVOICE = 45;

	}

	public int getEmployeeInternetInvoice() {
		return EMPLOYEE_INTERNET_INVOICE;
	}

	@Override
	public int employeeSalaryCalculation(int employeeHoursWorked) {
		return super.employeeSalaryCalculation(employeeHoursWorked) + EMPLOYEE_INTERNET_INVOICE;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
