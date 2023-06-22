package kidneyFailure.ExpertSystem;

import java.util.Objects;

public class Treatment implements Comparable<Treatment>{
	
	private String description;
	private int pid;
	
	
	//CONSTRUCTORS
	
	public Treatment() {
		super();
	}
	
	public Treatment(String description, int pid) {
		super();
		this.description = description;
		this.pid = pid;
	}

	
	//GETTERS AND SETTERS
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return "Treatment [description=" + description + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, pid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treatment other = (Treatment) obj;
		return Objects.equals(description, other.description) && pid == other.pid;
	}

	@Override
	public int compareTo(Treatment t) {
		return t.description.compareTo(this.description);
	}
	
	

}
