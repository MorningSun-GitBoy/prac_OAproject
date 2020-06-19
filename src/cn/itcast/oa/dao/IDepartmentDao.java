package cn.itcast.oa.dao;

import java.util.List;

import cn.itcast.oa.base.IBaseDao;
import cn.itcast.oa.domain.Department;

public interface IDepartmentDao extends IBaseDao<Department>{
	public List<Department> findTopList();//查询Department表中parentId为空的项
	public List<Department> findChildren(Long Id);//查询Department表中parentId为Id的项
}
