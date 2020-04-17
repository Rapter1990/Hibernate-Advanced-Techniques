package dao;

import java.util.List;

import entity.User;

public class UserDao extends HibernateDao<User> implements GeneticDao<User>{

	public UserDao() {
		super();
	}
	
	@Override
	public User create(User t) {
		// TODO Auto-generated method stub
		return super.create(t);
	}
	
	@Override
	public User get(Object id) {
		// TODO Auto-generated method stub
		return super.get(User.class, id);
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		super.delete(User.class, id);
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
