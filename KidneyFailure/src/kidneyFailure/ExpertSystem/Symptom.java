package kidneyFailure.ExpertSystem;

public class Symptom {
	
	private String name;
	private SymptomStatus status;
	private int pid;
	

	//CONSTRUCTOR
	
	public Symptom() {
		super();
		this.status = SymptomStatus.NOT_TREATED;
	} 
	
	public Symptom(String name, int pid) {
		super();
		this.name = name;
		this.status = SymptomStatus.NOT_TREATED;
		this.pid = pid;
	}
	
	//GETTERS AND SETTERS
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public SymptomStatus getStatus() {
		return status;
	}

	public void setStatus(SymptomStatus status) {
		this.status = status;
	}
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
	//METHODS
	
	@Override
	public String toString() {
		return "Symptom [name=" + name + ", status=" + status + "]";
	}
	

}
