package elementCollection;

import java.util.Set;

import entity.Student;
import service.StudentService;

public class Main {

	public static void main(String[] args) {
		
		// Create Student
		Student student = new Student();
		student.setFirstName("Ayþe");
		student.setLastName("Göktüð");
		student.setEmail("a@g.com");
		
		// Set Images of Student
		Set<String> studentImages = student.getImages();
		studentImages.add("photo1.png");
		studentImages.add("photo2.png");
		studentImages.add("photo3.png");
		studentImages.add("photo4.png");
		
		// Define StudentService
		StudentService studentService = new StudentService();
		
		// Create Student
		studentService.createStudent(student);
	} 
}
