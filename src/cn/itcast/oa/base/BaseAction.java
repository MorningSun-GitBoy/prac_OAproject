package cn.itcast.oa.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.oa.service.*;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
	@Resource
	//最好将一切所需的Service接口放在祖类里
	protected IBookService bookService;
	protected T model;
	public BaseAction(){
		ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();//获得真正父类 ：get the true father class
		Type[] types = genericSuperclass.getActualTypeArguments();
		Class<T> clazz =(Class<T>) types[0];
		try {
			this.model = clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//重新实例化  
	}
	@Override
	public T getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	
}
