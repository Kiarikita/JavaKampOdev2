
public class Student extends User{
	private String takenCourses;
	private String completeHomework;
	
	public Student() {
		
	}
	
	public Student(String takenCourses, String completeHomework) {
		super();
		this.takenCourses = takenCourses;
		this.completeHomework = completeHomework;
	}

	public String getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}

	public String getCompleteHomework() {
		return completeHomework;
	}

	public void setCompleteHomework(String completeHomework) {
		this.completeHomework = completeHomework;
	}
}
