package service;

import java.util.List;

import dao.StudentDao;
import entity.Student;

public class StudentService {

	private StudentDao studentDao;
	
	public StudentService() {
		super();
		//this.categoryDao = new CategoryDao(sessionFactory);
		this.studentDao = new StudentDao();
	}
	
	public List<Student> listArticle() {
		List<Student> students = studentDao.listAll();
		return students;
	}
	
	public void createStudent(Student student) {
		studentDao.create(student);
	}
	
	public void updateStudent(Student student) {
		studentDao.update(student);
	}
	
	public void deleteStudent(int studentId) {
		studentDao.delete(studentId);
	}
	
	public void getStudent(int studentId) {
		studentDao.get(studentId);
	}
}
