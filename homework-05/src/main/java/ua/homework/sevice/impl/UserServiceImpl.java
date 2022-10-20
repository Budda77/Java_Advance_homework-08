package ua.homework.sevice.impl;

import java.sql.SQLException;
import java.util.List;

import ua.homework.dao.UserDao;
import ua.homework.dao.impl.UserDaoImpl;
import ua.homework.domain.User;
import ua.homework.service.UserService;


public class UserServiceImpl implements UserService{
	
	private UserDao userDao;

	public UserServiceImpl() {
			try {
				this.userDao = new UserDaoImpl();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	}

	@Override
	public User create(User t) {
		return userDao.create(t);
	}

	@Override
	public User read(Integer id) {
		return userDao.read(id);
	}

	@Override
	public User update(User t) {
		return userDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
		
	}

	@Override
	public List<User> readAll() {
		return userDao.readAll();
	}

}
