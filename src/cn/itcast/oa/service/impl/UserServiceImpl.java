package cn.itcast.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IUserDao;
import cn.itcast.oa.domain.User;
import cn.itcast.oa.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;
	@Override
	public void save(User entity) {
		// TODO Auto-generated method stub
		userDao.save(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getById(Long Id) {
		// TODO Auto-generated method stub
		return userDao.getById(Id);
	}

	@Override
	public List<User> getByIds(Long[] ids) {
		// TODO Auto-generated method stub
		return userDao.getByIds(ids);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
