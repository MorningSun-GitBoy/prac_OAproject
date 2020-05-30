package cn.itcast.oa.base;

import java.util.List;

/**
 * ps:通用Dao接口
 * 
 * @author Bachelor
 * @param <T>
 */
public interface IBaseDao<T> {
	public void save(T entity);// 添加 ：add

	public void delete(Long id);// 根据id删除 ： delete by id

	public void update(T entity);// 根据id修改 ：update by id

	public T getById(Long Id);// 根据id查询 ：select by id

	public List<T> getByIds(Long[] ids);// 根据id查询多个 ：multiply select by ids

	public List<T> findAll();// 输出整表 ：print the whole table
}