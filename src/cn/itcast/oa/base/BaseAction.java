package cn.itcast.oa.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.oa.service.IDepartmentService;
import cn.itcast.oa.service.IRoleService;
import cn.itcast.oa.service.IUserService;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
    @Resource
    protected IUserService userService;
    @Resource
    protected IDepartmentService departmentService;
    @Resource
    protected IRoleService roleService;
    protected T model;
    @SuppressWarnings("unchecked")
    public BaseAction() {
	// TODO Auto-generated constructor stub
	/**
	 * aim:初始化model
	 * 1.获得本类类型
	 * 2.根据本类类型指定T泛型
	 * 3.确定泛型变量的类型
	 * 4.将model赋值为泛型变量
	 */
	ParameterizedType genericSupperClass = (ParameterizedType) this.getClass().getGenericSuperclass();
	//ParameterizedType 具有<>符号的变量是参数化类型
	//只寻求类的泛型
	Type[] types = genericSupperClass.getActualTypeArguments();//得到泛型中的各类
	Class<T> clazz = (Class<T>) types[0];
	try {
	    model = clazz.newInstance();
	} catch (InstantiationException | IllegalAccessException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
    @Override
    public T getModel() {
	// TODO Auto-generated method stub
	return model;
    }

}
