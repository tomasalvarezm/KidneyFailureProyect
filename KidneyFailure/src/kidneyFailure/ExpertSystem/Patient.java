package kidneyFailure.ExpertSystem;


public class Patient {
	
	private int id;
	private String name;
	private int age;
	private String sex;
	private Boolean isBlackRace;
	
	//CONSTRUCTOR
	
	public Patient() {
		super();
	}
	
	public Patient(int id, String name, int age, String sex, Boolean isBlackRace) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.isBlackRace = isBlackRace;
	}

	//GETTERS AND SETTERS
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Boolean getIsBlackRace() {
		return isBlackRace;
	}

	public void setIsBlackRace(Boolean isBlackRace) {
		this.isBlackRace = isBlackRace;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", isBlackRace=" + isBlackRace
				+ "]";
	}

	
}
