package cn.itcast.oa.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

import cn.itcast.oa.service.*;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {
	// 最好将一切所需的Service接口放在祖类里
	@Resource
	protected IBookService bookService;
	@Resource
	protected IRoleService roleService;
	@Resource
	protected IDepartmentService deparService;
	@Resource
	protected IUserService userService;
	protected T model;

	public BaseAction() {
		ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();// 获得真正父类 
																										 // get the true father class
		Type[] types = genericSuperclass.getActualTypeArguments();
		Class<T> clazz = (Class<T>) types[0];
		try {
			this.model = clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 重新实例化
	}

	@Override
	public T getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	
	/**
	 * ps:获得“值栈”
	 * @return
	 */
	protected ValueStack getValueStack() {
		return ActionContext.getContext().getValueStack();
	}
}
