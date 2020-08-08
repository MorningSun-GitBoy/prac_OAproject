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
@SuppressWarnings("unchecked")
public class UserServiceImpl implements IUserService {
    
    @Resource
    private IUserDao userDao;
    @Override
    public void insertEntity(User entity) {
	// TODO Auto-generated method stub
	userDao.insertEntity(entity);
    }

    @Override
    public void deletEntity(Long id) {
	// TODO Auto-generated method stub
	userDao.deletEntity(id);
    }

    @Override
    public void updateEntiy(User entity) {
	// TODO Auto-generated method stub
	userDao.updateEntiy(entity);
    }

    @Override
    public User selectEntityById(Long id) {
	// TODO Auto-generated method stub
	return (User) userDao.selectEntityById(id);
    }

    @Override
    public List<User> selectEntityByIds(Long[] ids) {
	// TODO Auto-generated method stub
	return userDao.selectEntityByIds(ids);
    }

    @Override
    public List<User> selectAllEntitys() {
	// TODO Auto-generated method stub
	return userDao.selectAllEntitys();
    }

}
