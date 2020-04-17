package elementCollection;

import org.hibernate.annotations.SortComparator;

import entity.User;
import service.UserService;

public class MainCheck {

	public static void main(String[] args) {
		
		// Define StudentService
		UserService userService = new UserService();
		
		// get the student id
		int userId = 2;
		User selectedStudent = userService.getUser(userId);
		
		//print the student detail
		System.out.println("User details: "+selectedStudent);
		
	}
}
