
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Ali");
		instructor1.setLastName("G�k");
		instructor1.setAssignHomework("Inheritance �devi ver.");
		instructor1.setGivenCourses("Java Kursu");
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setFirstName("Ay�e");
		student1.setLastName("Akan");
		student1.setCompleteHomework("Inheritance �devi tamamla.");
		student1.setTakenCourses("Java Kursu");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addToInstructorList(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addToStudentList(student1);
		
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.add(student1);
	}

}
