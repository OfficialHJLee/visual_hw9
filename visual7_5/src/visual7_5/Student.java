package visual7_5;

public class Student {
	private String name;
	private String major;
	private String id;
	private String grade;
	
	public Student(String name, String major, String id, String grade) {
		this.name = name;
		this.major = major;
		this.id = id;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public String getId() {
		return id;
	}
	public String getGrade() {
		return grade;
	}
}
