package xtra.annotationsStudy;

@ProcessInstanceFlag
public class Process <I, O> {
	
	private String processTitle;
	private I processInput;
	private O processOutput;
	
	public Process(String processTitle, I processInput, O processOutput) {
		this.processTitle = processTitle;
		this.processInput = processInput;
		this.processOutput = processOutput;
	}

	public String getProcessTitle() {
		return processTitle;
	}

	public void setProcessTitle(String processTitle) {
		this.processTitle = processTitle;
	}

	public I getProcessInput() {
		return processInput;
	}

	public void setProcessInput(I processInput) {
		this.processInput = processInput;
	}

	public O getProcessOutput() {
		return processOutput;
	}

	public void setProcessOutput(O processOutput) {
		this.processOutput = processOutput;
	}
	
	public O executeProcess (I processInput) {
		return processOutput;
	} 

}
