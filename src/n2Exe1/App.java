package n2Exe1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.fasterxml.jackson.databind.ObjectMapper;


public class App {

	public static void main(String[] args) {

		Employee_InOffice employee1 = new Employee_InOffice("name", "surname", 100);
		
		if (employee1.getClass().isAnnotationPresent(SerialObjectToJsonFlag.class)) {
			String data = null;
			ObjectMapper mapper = new ObjectMapper();
			SerialObjectToJsonFlag annotation = employee1.getClass().getAnnotation(SerialObjectToJsonFlag.class);
			try (FileOutputStream fileOutputStream = new FileOutputStream(annotation.dir());
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
				data = mapper.writeValueAsString(employee1);
				System.out.println(data);
				objectOutputStream.writeBytes(data);
				System.out.println(employee1.getEmployeeName() + "object has been serialized in");
			} catch (IOException e) {
				System.err.println("File not found");
			}
		} else {
			System.out.println(employee1.getEmployeeName() + "has not been serialized.");
		}
	}
	
}
