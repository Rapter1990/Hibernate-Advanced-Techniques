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
		student.setFirstName("Yaðmur");
		student.setLastName("Ilým");
		student.setEmail("y@i.com");
		
		// Map Images of Student
		Map<String, String> theImages = student.getImages();
		
		theImages.put("photo1.jpg", "Photo 1");
		theImages.put("photo2.jpg", "Photo 2");
		theImages.put("photo3.jpg", "Photo 3");
		
		// Define StudentService
		StudentService studentService = new StudentService();
		
		// Create Student
		studentService.createStudent(student);
		
		
	} 
}
