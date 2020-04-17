package elementCollection;

import org.hibernate.annotations.SortComparator;

import entity.Student;
import service.StudentService;

public class MainCheck {

	public static void main(String[] args) {
		
		// Define StudentService
		StudentService studentService = new StudentService();
		
		// get the student id
		int studentId = 21;
		Student selectedStudent = studentService.getStudent(studentId);
		
		//print the student detail
		System.out.println("Student details: "+selectedStudent);
		
		//print the associated images(@SortComparator -> DESC)
		System.out.println("The associated images: "+selectedStudent.getImages());
	}
}
