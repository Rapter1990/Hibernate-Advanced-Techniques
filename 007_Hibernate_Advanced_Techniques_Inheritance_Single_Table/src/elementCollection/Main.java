package elementCollection;


import entity.Student;
import entity.Instructor;
import service.PersonService;

public class Main {

	public static void main(String[] args) {
		
		// create the objects

		Student student = new Student("Doðan", "Yýldýrým", "d@y.com", "Hibernate");
		Instructor instructor = new Instructor("Göktuð", "Açýk", "g@a.com", 20000.00);

		// Define StudentService
		PersonService personService = new PersonService();

		// Create Student and Instructor
		personService.createUser(student);
		personService.createUser(instructor);
		
	
	}
}
