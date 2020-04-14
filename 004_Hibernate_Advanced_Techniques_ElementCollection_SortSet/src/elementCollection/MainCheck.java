package elementCollection;

import entity.Student;
import service.StudentService;

public class MainCheck {

	public static void main(String[] args) {
		
		// Define StudentService
		StudentService studentService = new StudentService();
		
		// get the student id
		int studentId = 5;
		Student selectedStudent = studentService.getStudent(studentId);
		
		//print the student detail
		System.out.println("Student details: "+selectedStudent);
		
		//print the associated images
		System.out.println("The associated images: "+selectedStudent.getImages());
	}
}
