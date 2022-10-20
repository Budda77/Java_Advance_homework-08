package ua.homework.sevice.impl;

import java.sql.SQLException;
import java.util.List;

import ua.homework.dao.BucketDao;
import ua.homework.dao.impl.BucketDaoImpl;
import ua.homework.domain.Bucket;
import ua.homework.service.BucketService;


public class BucketServiceImpl implements BucketService{
	
	private BucketDao bucketDao;
	
	

	public BucketServiceImpl() {
		try {
			this.bucketDao = new BucketDaoImpl();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Bucket create(Bucket t) {
		return bucketDao.create(t);
	}

	@Override
	public Bucket read(Integer id) {
		return bucketDao.read(id);
	}

	@Override
	public Bucket update(Bucket t) {
		return bucketDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		bucketDao.delete(id);
	}

	@Override
	public List<Bucket> readAll() {
		return bucketDao.readAll();
	}

}
