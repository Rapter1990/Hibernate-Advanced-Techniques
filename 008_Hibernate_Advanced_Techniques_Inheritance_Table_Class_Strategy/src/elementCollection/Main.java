package elementCollection;


import entity.Student;
import entity.Instructor;
import service.PersonService;

public class Main {

	public static void main(String[] args) {
		
		// create the objects

		Student student = new Student("Esra", "Özgür", "d@y.com", "Spring");
		Instructor instructor = new Instructor("Ilým", "Çaðrý", "i@c.com", 7000.0);

		// Define StudentService
		PersonService personService = new PersonService();

		// Create Student and Instructor
		personService.createUser(student);
		personService.createUser(instructor);
		
	
	}
}
