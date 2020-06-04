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
}
