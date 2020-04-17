package elementCollection;

import org.hibernate.annotations.SortComparator;

import entity.Person;
import service.PersonService;

public class MainCheck {

	public static void main(String[] args) {
		
		// Define StudentService
		PersonService personService = new PersonService();
		
		// get the student id
		int personId = 1;
		Person selectedPerson = personService.getUser(personId);
		
		//print the student detail
		System.out.println("User details: "+ selectedPerson);
		
	}
}
