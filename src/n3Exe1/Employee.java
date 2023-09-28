package n3Exe1;

import java.io.Serializable;

@SerialObjectToJsonFlag (dir="json/employee.json")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String employeeName;
	private String employeeSurname;
	private int employeePriceByHour;
	
	public Employee(String employeeName, String employeeSurname, int employeePriceByHour) {
		this.employeeName = employeeName;
		this.employeeSurname = employeeSurname;
		this.employeePriceByHour = employeePriceByHour;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSurname() {
		return employeeSurname;
	}

	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}

	public int getEmployeePriceByHour() {
		return employeePriceByHour;
	}

	public void setEmployeePriceByHour(int employeePriceByHour) {
		this.employeePriceByHour = employeePriceByHour;
	}
	
	//Class methods
	
	public int employeeSalaryCalculation (int employeeHoursWorked) {
		return employeePriceByHour * employeeHoursWorked;
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

	@Override
	public String toString() {
		return "[employeeName=" + employeeName + ", employeeSurname=" + employeeSurname
				+ ", employeePriceByHour=" + employeePriceByHour;
	}

}
