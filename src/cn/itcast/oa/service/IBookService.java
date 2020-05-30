package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.Book;

public interface IBookService {
	public void save(Book entity);// 添加 ：add

	public void delete(Long id);// 根据id删除 ： delete by id

	public void update(Book entity);// 根据id修改 ：update by id

	public Book getById(Long Id);// 根据id查询 ：select by id

	public List<Book> getByIds(Long[] ids);// 根据id查询多个 ：multiply select by ids

	public List<Book> findAll();// 输出整表 ：print the whole table
}
//为什么不继承IBaseDao呢？还需要每个都重新写一遍