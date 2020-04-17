package dao;

import java.util.List;

import entity.Person;

public class PersonDao extends HibernateDao<Person> implements GeneticDao<Person>{

	public PersonDao() {
		super();
	}
	
	@Override
	public Person create(Person t) {
		// TODO Auto-generated method stub
		return super.create(t);
	}
	
	@Override
	public Person get(Object id) {
		// TODO Auto-generated method stub
		return super.get(Person.class, id);
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		super.delete(Person.class, id);
	}

	@Override
	public List<Person> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
