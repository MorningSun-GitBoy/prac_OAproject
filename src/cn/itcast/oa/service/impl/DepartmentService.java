package cn.itcast.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IDepartmentDao;
import cn.itcast.oa.domain.Department;
import cn.itcast.oa.service.IDepartmentService;

@Service
@Transactional
public class DepartmentService implements IDepartmentService{
	@Resource
	private IDepartmentDao departmentDao;
	@Override
	public void save(Department entity) {
		// TODO Auto-generated method stub
		departmentDao.save(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		departmentDao.delete(id);
	}

	@Override
	public void update(Department entity) {
		// TODO Auto-generated method stub
		departmentDao.update(entity);
	}

	@Override
	public Department getById(Long Id) {
		// TODO Auto-generated method stub
		return departmentDao.getById(Id);
	}

	@Override
	public List<Department> getByIds(Long[] ids) {
		// TODO Auto-generated method stub
		return departmentDao.getByIds(ids);
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return departmentDao.findAll();
	}

	@Override
	public List<Department> findTopList(){
		return departmentDao.findTopList();
	}
	
	@Override
	public List<Department> findChildren(Long Id){
		return departmentDao.findChildren(Id);
	}
}
