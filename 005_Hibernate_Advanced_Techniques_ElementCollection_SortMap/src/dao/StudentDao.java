package dao;

import java.util.List;

import entity.Student;

public class StudentDao extends HibernateDao<Student> implements GeneticDao<Student>{

	public StudentDao() {
		super();
	}
	
	@Override
	public Student create(Student t) {
		// TODO Auto-generated method stub
		return super.create(t);
	}
	
	@Override
	public Student get(Object id) {
		// TODO Auto-generated method stub
		return super.get(Student.class, id);
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		super.delete(Student.class, id);
	}

	@Override
	public List<Student> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
