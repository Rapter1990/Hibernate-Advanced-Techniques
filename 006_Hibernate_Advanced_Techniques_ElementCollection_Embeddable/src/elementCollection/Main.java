package elementCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import entity.Status;
import entity.User;
import service.UserService;

public class Main {

	public static void main(String[] args) {

		User user1 = new User("Doðan", "Yýldýrým", "d@y.com",Status.ACTIVE);
		User user2 = new User("Göktuð", "Açýk", "g@a.com",Status.INACTIVE);

		// Define StudentService
		UserService studentService = new UserService();

		// Create Student
		studentService.createUser(user1);
		studentService.createUser(user2);

	}
}
