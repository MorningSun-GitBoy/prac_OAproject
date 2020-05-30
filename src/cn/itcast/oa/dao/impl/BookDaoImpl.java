package cn.itcast.oa.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.itcast.oa.base.BaseDaoImpl;
import cn.itcast.oa.dao.IBookDao;
import cn.itcast.oa.domain.Book;
/**
 * BookDao 继承 BaseDaoImpl
 * @author Bachelor
 * ps:增删改查使用父类方法即可，无须重写
 */
@Repository//由于要使用注解方式进行数据库操作
public class BookDaoImpl extends BaseDaoImpl<Book> implements IBookDao {
	
}
