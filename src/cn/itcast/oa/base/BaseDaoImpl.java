package cn.itcast.oa.base;

import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDaoImpl<T> implements IBaseDao<T> {
    @Resource
    private SessionFactory sessionFactory;//会话工厂
    private Class<T> clazz;//泛型的类型
    
    @SuppressWarnings("unchecked")
    public BaseDaoImpl() {
	/**
	 * aim:获得泛型的类型，即初始化clazz
	 * 1.获得本类类型
	 * 2.根据本类类型指定T泛型
	 * 3.确定泛型变量的类型，并将其赋予entity
	 */
	ParameterizedType genericSupperClass = (ParameterizedType) this.getClass().getGenericSuperclass();
	//ParameterizedType 具有<>符号的变量是参数化类型
	//只寻求类的泛型
	Type[] types = genericSupperClass.getActualTypeArguments();//得到泛型中的各类
	clazz = (Class<T>) types[0];
    }
    public Session getCurrentSession() {
	return sessionFactory.getCurrentSession();
    }
    @Override
    public void insertEntity(T entity) {
	// TODO Auto-generated method stub
	getCurrentSession().save(entity);
    }

    @Override
    public void deletEntity(Long id) {
	// TODO Auto-generated method stub
	Object entity = getCurrentSession().get(clazz, id);
	getCurrentSession().delete(entity);
    }

    @Override
    public void updateEntiy(T entity) {
	// TODO Auto-generated method stub
	getCurrentSession().update(entity);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T selectEntityById(Long id) {
	// TODO Auto-generated method stub
	return (T) getCurrentSession().get(clazz, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> selectEntityByIds(Long[] ids) {
	// TODO Auto-generated method stub
	/* 
	 * List<T> entities = new ArrayList<T>(); for(Long id : ids) { entities.add((T)
	 * getCurrentSession().get(entity, id)); }
	 *///使用java不如使用hql，这样更省资源
	String hql = "FROM "+entity.getSimpleName()+" WHERE id in (:ids)";//(:ids)命名参数
	return getCurrentSession().createQuery(hql).setParameterList("ids", ids).list();
	//setParameterList("ids", ids) 用于给参数赋值
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> selectAllEntitys() {
	// TODO Auto-generated method stub
	String hql = "FROM "+entity.getSimpleName();
	return getCurrentSession().createQuery(hql).list();
    }

}
