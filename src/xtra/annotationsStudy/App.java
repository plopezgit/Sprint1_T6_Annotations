package xtra.annotationsStudy;

public class App {

	public static void main(String[] args) {
		
		Process<String, String> process = new Process<>("Serialize", "Object", "file");
		
		if (process.getClass().isAnnotationPresent(ProcessInstanceFlag.class)) {
			System.out.println(process.getProcessTitle() + " process created with a flag.");
		} else {
			System.out.println(process.getProcessTitle() + " process created. No flag.");
		}
		
	}

}
