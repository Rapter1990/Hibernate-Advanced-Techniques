package service;

import java.util.List;

import dao.UserDao;
import entity.User;

public class UserService {

	private UserDao userDao;
	
	public UserService() {
		super();
		//this.categoryDao = new CategoryDao(sessionFactory);
		this.userDao = new UserDao();
	}
	
	public List<User> listUser() {
		List<User> students = userDao.listAll();
		return students;
	}
	
	public void createUser(User user) {
		userDao.create(user);
	}
	
	public void updateUser(User user) {
		userDao.update(user);
	}
	
	public void deleteUser(int userId) {
		userDao.delete(userId);
	}
	
	public User getUser(int userId) {
		return userDao.get(userId);
	}
}
