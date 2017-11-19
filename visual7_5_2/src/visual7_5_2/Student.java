package visual7_5_2;

public class Student {
	private String major;
	private String id;
	private String grade;
	
	public Student(String major, String id, String grade) {
		this.major = major;
		this.id = id;
		this.grade = grade;
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