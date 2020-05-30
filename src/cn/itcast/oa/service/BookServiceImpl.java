package cn.itcast.oa.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IBookDao;
import cn.itcast.oa.domain.Book;

@Service
@Transactional
public class BookServiceImpl implements IBookService {
	@Resource
	private IBookDao bookDao;

	@Override
	public void save(Book entity) {
		// TODO Auto-generated method stub
		bookDao.save(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		bookDao.delete(id);
	}

	@Override
	public void update(Book entity) {
		// TODO Auto-generated method stub
		bookDao.update(entity);
	}

	@Override
	public Book getById(Long Id) {
		// TODO Auto-generated method stub
		return bookDao.getById(Id);
	}

	@Override
	public List<Book> getByIds(Long[] ids) {
		// TODO Auto-generated method stub
		return bookDao.getByIds(ids);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}

}
//迷惑行为，为什么不直接用Dao这样还使一改改一连串啊