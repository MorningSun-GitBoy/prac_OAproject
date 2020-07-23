package cn.itcast.oa.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.util.ValueStack;

import cn.itcast.oa.base.BaseAction;
import cn.itcast.oa.domain.Role;

@Controller
@Scope("prototype")
public class RoleAction extends BaseAction<Role>{
	/**
	 * 1.查询岗位列表
	 */
	public String list() {
		List<Role> list = roleService.findAll();
		ValueStack vs = getValueStack();
		vs.set("list", list);//压栈
							 //pop into the stack
		return "list";
	}
	
	/**
	 * 2.根据id来删除项
	 */
	public String delet() {
		roleService.delete(model.getId());
		/**
		* if private T model;
		* roleService.delete(this.getModel().getId());
		* why 为啥不这么写？
		*/
		return "tolist";
	}
	
	/**
	 * 3.跳转到修改页面
	 */
	public String editUI() {
		//根据id查询岗位
		//according to id search the role
		Role r = roleService.getById(model.getId());
		getValueStack().push(r);//放入“值栈用于回显”
		return "editUI";
	}
	
	/**
	 * 4.完成数据修改
	 */
	public String edit() {
		//先查询，在修改
		//search then update
		Role r = roleService.getById(model.getId());
		r.setName(model.getName());
		r.setDescripeion(model.getDescripeion());
		roleService.update(r);
		return "tolist";
	}
	
	/**
	 * 5.跳转到添加页面
	 */
	public String addUI() {
		return "addUI";
	}
	
	/**
	 * 6.完成数据的添加
	 */
	public String add() {
		roleService.save(model);
		return "tolist";
	}
	
	/**
	 * 7.显示权限设置界面
	 */
	public String privilegeUI() {
		//查询岗位
		//查询全部权限，并树形展示
		Role r = roleService.getById(model.getId());
		getValueStack().push(r);
		
		return "privilege";
	}
}
