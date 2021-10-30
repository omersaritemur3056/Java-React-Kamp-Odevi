package kodlama.ioProject;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.courseId = 1;
		instructor.courseName ="java";
		instructor.firstName="Engin";
		instructor.lastName="Demiroð";
		Instructor instructor2 = new Instructor();
		instructor2.courseId =2;
		instructor2.courseName="C#";
		instructor2.firstName="Engin";
		instructor2.lastName="Demiroð";
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.givenCourse(instructor);
		
		
		Student student = new Student();
		student.firstName="Ömer";
		student.lastName="Sarýtemur";
		student.courseId=1;
		student.courseName="Java";
		
		StudentManager studentManager = new StudentManager();
		studentManager.takenCourse(student);

	}

}
