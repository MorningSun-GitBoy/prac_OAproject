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
@SuppressWarnings("unchecked")
public class DepartmentServiceImpl implements IDepartmentService {

    @Resource
    private IDepartmentDao departmentDao;
    @Override
    public void insertEntity(Department entity) {
	// TODO Auto-generated method stub
	departmentDao.insertEntity(entity);
    }

    @Override
    public void deletEntity(Long id) {
	// TODO Auto-generated method stub
	departmentDao.deletEntity(id);
    }

    @Override
    public void updateEntiy(Department entity) {
	// TODO Auto-generated method stub
	departmentDao.updateEntiy(entity);
    }

    @Override
    public Department selectEntityById(Long id) {
	// TODO Auto-generated method stub
	return (Department) departmentDao.selectEntityById(id);
    }

    @Override
    public List<Department> selectEntityByIds(Long[] ids) {
	// TODO Auto-generated method stub
	return departmentDao.selectEntityByIds(ids);
    }

    @Override
    public List<Department> selectAllEntitys() {
	// TODO Auto-generated method stub
	return departmentDao.selectAllEntitys();
    }

}
