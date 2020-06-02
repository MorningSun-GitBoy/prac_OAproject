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
public class RoleServiceImpl implements IRoleService {
	@Resource
	private IRoleDao roleDao;
	@Override
	public void save(Role entity) {
		// TODO Auto-generated method stub
		roleDao.save(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		roleDao.delete(id);
	}

	@Override
	public void update(Role entity) {
		// TODO Auto-generated method stub
		roleDao.update(entity);
	}

	@Override
	public Role getById(Long Id) {
		// TODO Auto-generated method stub
		return roleDao.getById(Id);
	}

	@Override
	public List<Role> getByIds(Long[] ids) {
		// TODO Auto-generated method stub
		return roleDao.getByIds(ids);
	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return roleDao.findAll();
	}

}
