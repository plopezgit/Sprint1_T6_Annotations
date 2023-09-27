package n1Exe2;

public class SuppressWarningSample {

	@SuppressWarnings("deprecation")
	public void employeeDisperseMethodClass() {
		
		Employee_InOffice employee1 = new Employee_InOffice("name", "surname", 100);
		System.out.println("Salary extra in Office: " + employee1.printEmployeeSalaryExtras(3));
		
		Employee_Online employee2 = new Employee_Online("Floky", "Brutus", 100);
		employee2.printEmployeeOnlineOnboardingProcess();
	}
}
