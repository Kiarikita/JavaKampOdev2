
public class Instructor extends User{
	
	private String givenCourses;
	private String assignHomework;
	
	public Instructor() {
		
	}
	
	public Instructor(String givenCourses, String assignHomework) {
		super();
		this.givenCourses = givenCourses;
		this.assignHomework = assignHomework;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}

	public String getAssignHomework() {
		return assignHomework;
	}

	public void setAssignHomework(String assignHomework) {
		this.assignHomework = assignHomework;
	}

}
