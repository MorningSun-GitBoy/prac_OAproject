package cn.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.oa.domain.Book;
import cn.itcast.oa.service.IBookService;

/**
 * ps :测试BaseDao
 * 
 * @author Bachelor
 *
 */
public class TestBaseDao {
	@Test
	public void test1() {
		// 初始化spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IBookService bookService = (IBookService) ctx.getBean("bookServiceImpl");// 首字母要改为小写
		// spring 采用代理来实现类型所以返回的应该是接口
		Book book = new Book();
		book.setName("java");
		
		bookService.save(book);
	}
	@Test
	public void test2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IBookService bookService = (IBookService) ctx.getBean("bookServiceImpl");
		bookService.delete(1L);;
	}
	@Test
	public void test3() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IBookService bookService = (IBookService) ctx.getBean("bookServiceImpl");
		Book book = new Book();
		book.setId(3L);
		book.setName("php");
		bookService.update(book);
	}
	@Test
	public void test4() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		IBookService bookService = (IBookService) ctx.getBean("bookServiceImpl");
		bookService.getById(1L);
	}
}
