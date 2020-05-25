package cn.itcast.oa.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 * ps:通用Dao实现
 * @author Bachelor
 * @param <T>
 */
public class BaseDaoImpl<T> implements IBaseDao<T> {
	private SessionFactory sessionFactory;
	private Class<T> clazz;
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		//获得实体类型 ：get object class type
		ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();//获得真正父类 ：get the true father class
		Type[] types = genericSuperclass.getActualTypeArguments();
		clazz =(Class<T>) types[0];
	}

	@Override
	public void save(T entity) {
		getSession().save(entity);
	}

	@Override
	public void delete(Long id) {
		getSession().delete(getSession().get(clazz, id));
	}

	@Override
	public void update(T entity) {
		getSession().update(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		String hql = "FROM "+clazz.getCanonicalName();
		return getSession().createQuery(hql).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getById(Long Id) {
		return (T) getSession().get(clazz, Id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> getByIds(Long[] ids) {
		String hql = "FROM "+clazz.getCanonicalName()+"WHERE id in (:ids)";
		Query query = getSession().createQuery(hql);
		query.setParameterList("ids", ids);//一次赋值多个参数 ：set parameters in ine time
		return query.list();
	}
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
