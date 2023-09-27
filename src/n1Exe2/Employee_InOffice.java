package n1Exe2;

public class Employee_InOffice extends Employee {

	private static int employeeGasConsume = 90;
	
	public Employee_InOffice(String employeeName, String employeeSurname, int employeePriceByHour) {
		super(employeeName, employeeSurname, employeePriceByHour);

	}
	
	public static int getEmployeeGasConsume() {
		return employeeGasConsume;
	}
	
	@Deprecated
	public int printEmployeeSalaryExtras (int employeeExtraHours) {
		return super.getEmployeePriceByHour()* employeeExtraHours;
	}

	@Override
	public int employeeSalaryCalculation(int employeeHoursWorked) {
		return super.employeeSalaryCalculation(employeeHoursWorked) + employeeGasConsume;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	/*
	 * Añade a las clases hijas algunos métodos obsoletos (deprecated), 
	 * y utiliza la anotación correspondiente. Invoca desde una clase externa 
	 * los métodos obsoletos, suprimiendo mediante la correspondiente anotación 
	 * los “warnings” para ser obsoletos.
	 */

}
