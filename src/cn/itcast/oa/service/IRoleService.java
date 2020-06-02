package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.Role;

public interface IRoleService {
	public void save(Role entity);// 添加 ：add

	public void delete(Long id);// 根据id删除 ： delete by id

	public void update(Role entity);// 根据id修改 ：update by id

	public Role getById(Long Id);// 根据id查询 ：select by id

	public List<Role> getByIds(Long[] ids);// 根据id查询多个 ：multiply select by ids

	public List<Role> findAll();// 输出整表 ：print the whole table

}
