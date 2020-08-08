package cn.itcast.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IRoleDao;
import cn.itcast.oa.domain.Role;
import cn.itcast.oa.service.IRoleService;

@Service
@Transactional
@SuppressWarnings("unchecked")
public class RoleServiceImpl implements IRoleService {
    @Resource
    private IRoleDao roleDao;
    @Override
    public void insertEntity(Role entity) {
	// TODO Auto-generated method stub
	roleDao.insertEntity(entity);
    }

    @Override
    public void deletEntity(Long id) {
	// TODO Auto-generated method stub
	roleDao.deletEntity(id);
    }

    @Override
    public void updateEntiy(Role entity) {
	// TODO Auto-generated method stub
	roleDao.updateEntiy(entity);
    }

    @Override
    public Role selectEntityById(Long id) {
	// TODO Auto-generated method stub
	return (Role) roleDao.selectEntityById(id);
    }

    @Override
    public List<Role> selectEntityByIds(Long[] ids) {
	// TODO Auto-generated method stub
	return roleDao.selectEntityByIds(ids);
    }

    @Override
    public List<Role> selectAllEntitys() {
	// TODO Auto-generated method stub
	return roleDao.selectAllEntitys();
    }

}
