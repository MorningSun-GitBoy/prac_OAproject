package cn.itcast.oa.action;

import java.util.HashSet;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.oa.base.BaseAction;
import cn.itcast.oa.domain.Department;
import cn.itcast.oa.domain.Role;
import cn.itcast.oa.domain.User;
import cn.itcast.oa.utils.TreeViewPractice;

@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User>{
	private Long deparId;
	private Long[] roleIds;
	/**
	 * 1.展示用户列表
	 */
	public String list() {
		List<User> list = userService.findAll();
		getValueStack().set("list", list);
		return "list";
	}
	/**
	 * 2.删除用户
	 */
	public String delete() {
		userService.delete(model.getId());
		return "tolist";
	}
	/**
	 * 3.展示添加页面
	 */
	public String addUI() {
		List<Department> topList = deparService.findTopList();
		List<Department> deparTree = TreeViewPractice.getTreeList(topList);
		List<Role> roleList = roleService.findAll();
		getValueStack().set("treeList", deparTree);
		getValueStack().set("roleList", roleList);
		return "addUI";
	}
	/**
	 * 4.完成添加动作
	 */
	public String add() {
		if(null != deparId) {
			Department dept = deparService.getById(deparId);
			model.setDepartments(dept);
		}
		if(null != roleIds&&roleIds.length>0) {
			List<Role> roleList = roleService.getByIds(roleIds);
			model.setRoles(new HashSet<Role>(roleList));
		}
		userService.save(model);
		return "tolist";
	}
	/**
	 * 5.展示修改页面
	 */
	public String editUI() {
		User usr = userService.getById(model.getId());
		getValueStack().push(usr);
		return "editUI";
	}
	/**
	 * 6.完成修改动作
	 */
	public String edit() {
		User usr = userService.getById(model.getId());
		usr.setName(model.getName());
		usr.setDescription(model.getDescription());
		userService.update(usr);
		return "edit";
	}
	/**
	 * 7.初始化密码
	 */
	public String initPW() {
		User usr = userService.getById(model.getId());
		usr.setPassword("123456");
		userService.update(usr);
		return "tolist";
	}
	
}
