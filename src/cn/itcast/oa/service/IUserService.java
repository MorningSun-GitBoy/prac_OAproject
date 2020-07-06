package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.User;

public interface IUserService {
	public void save(User entity);// 添加 ：add

	public void delete(Long id);// 根据id删除 ： delete by id

	public void update(User entity);// 根据id修改 ：update by id

	public User getById(Long Id);// 根据id查询 ：select by id

	public List<User> getByIds(Long[] ids);// 根据id查询多个 ：multiply select by ids

	public List<User> findAll();// 输出整表 ：print the whole table

	public boolean findLoginName(String loginName);//查找loginName项为数据的项
}
