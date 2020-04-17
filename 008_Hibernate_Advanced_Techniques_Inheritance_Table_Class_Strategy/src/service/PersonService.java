package service;

import java.util.List;

import dao.PersonDao;
import entity.Person;

public class PersonService {

	private PersonDao personDao;
	
	public PersonService() {
		super();
		//this.categoryDao = new CategoryDao(sessionFactory);
		this.personDao = new PersonDao();
	}
	
	public List<Person> listUser() {
		List<Person> students = personDao.listAll();
		return students;
	}
	
	public void createUser(Person user) {
		personDao.create(user);
	}
	
	public void updateUser(Person user) {
		personDao.update(user);
	}
	
	public void deleteUser(int userId) {
		personDao.delete(userId);
	}
	
	public Person getUser(int userId) {
		return personDao.get(userId);
	}
}
