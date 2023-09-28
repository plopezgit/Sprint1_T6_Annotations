package n2Exe1;

import java.io.Serializable;

@SerialObjectToJsonFlag (dir="json/employee.json")
public class Employee_InOffice extends Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private static int employeeGasConsume = 90;

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
	
	//Alt method target
	//@ObjectToJsonSerial (dir="json/employee.json")
	/*public void serializeDirectoryToFile() {
		String data = null;
		ObjectToJsonSerial annotation = employee1.getClass().getAnnotation(ObjectToJsonSerial.class);
		try (FileOutputStream fileOutputStream = new FileOutputStream("json/employee");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			data = mapper.writeValueAsString(this);
			System.out.println(data);
			objectOutputStream.writeBytes(data);
		} catch (IOException e) {
			System.err.println(FILE_NOT_FOUND_MSG);
		}
	}*/

}
