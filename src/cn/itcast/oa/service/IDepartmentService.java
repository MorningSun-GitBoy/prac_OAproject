package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.Department;

public interface IDepartmentService {
	public void save(Department entity);// 添加 ：add

	public void delete(Long id);// 根据id删除 ： delete by id

	public void update(Department entity);// 根据id修改 ：update by id

	public Department getById(Long Id);// 根据id查询 ：select by id

	public List<Department> getByIds(Long[] ids);// 根据id查询多个 ：multiply select by ids

	public List<Department> findAll();// 输出整表 ：print the whole table

	public List<Department> findTopList();//输出表中无上级部门的对象
	
	public List<Department> findChildren(Long Id);//输出表中某项的子部门
	
}
