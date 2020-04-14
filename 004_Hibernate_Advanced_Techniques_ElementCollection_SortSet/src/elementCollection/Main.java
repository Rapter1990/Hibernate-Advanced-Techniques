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
		student.setFirstName("Aslý");
		student.setLastName("Doðan");
		student.setEmail("a@d.com");
		
		// Set Images of Student
		Set<String> studentImages = student.getImages();
		
		studentImages.add("photo1.jpg");
		studentImages.add("photo2.jpg");
		studentImages.add("photo3.jpg");
		studentImages.add("photo4.jpg");
		studentImages.add("photo4.jpg"); //Duplicate, filtered at java level by HashSet!!!
		studentImages.add("photo5.jpg");
		studentImages.add("photo5.jpg"); //Duplicate, filtered at java level by HashSet!!!
		
		// Define StudentService
		StudentService studentService = new StudentService();
		
		// Create Student
		studentService.createStudent(student);
		
		
	} 
}
