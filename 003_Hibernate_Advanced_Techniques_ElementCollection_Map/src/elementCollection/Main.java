package elementCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import entity.Student;
import service.StudentService;

public class Main {

	public static void main(String[] args) {
		
		// Create Student
		Student student = new Student();
		student.setFirstName("Sercan");
		student.setLastName("Akýn");
		student.setEmail("s@a.com");
		
		// Set Images of Student
		Map<String, String> studentImages = student.getImages();
		
		studentImages.put("photo1.jpg", "Photo 1");
		studentImages.put("photo2.jpg", "Photo 2");
		studentImages.put("photo3.jpg", "Photo 3");
		
		// Define StudentService
		StudentService studentService = new StudentService();
		
		// Create Student
		studentService.createStudent(student);
	} 
}
