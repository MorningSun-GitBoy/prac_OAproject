package cn.itcast.oa.action;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.oa.base.BaseAction;
import cn.itcast.oa.domain.Department;
import cn.itcast.oa.domain.Role;
import cn.itcast.oa.domain.User;
import cn.itcast.oa.utils.TreeView;

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
		List<Department> deparTree = TreeView.getTreeList(topList);
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
		//if(modle.get)
		userService.save(model);
		return "tolist";
	}
	/**
	 * 5.展示修改页面
	 */
	public String editUI() {
		List<Department> topList = deparService.findTopList();
		List<Department> deparTree = TreeView.getTreeList(topList);
		List<Role> roleList = roleService.findAll();
		getValueStack().set("treeList", deparTree);
		getValueStack().set("roleList", roleList);
		User usr = userService.getById(model.getId());
		getValueStack().push(usr);
		if(usr.getDepartments()!=null) {
			deparId = usr.getDepartments().getId();
		}
		if(usr.getRoles().size()>0) {
			roleIds = new Long[usr.getRoles().size()];
			int i = 0;
			for(Role r : usr.getRoles()) {
				roleIds[i] = r.getId();
			}
		}
		return "editUI";
	}
	/**
	 * 6.完成修改动作
	 */
	public String edit() {
		User usr = userService.getById(model.getId());
		usr.setLoginName(model.getLoginName());
		usr.setName(model.getName());
		usr.setGender(model.getGender());
		usr.setEmail(model.getEmail());
		usr.setDescription(model.getDescription());
		if(deparId!=null) {
			Department depar = deparService.getById(model.getId());
			usr.setDepartments(depar);
		}else {
			usr.setDepartments(null);
		}
		if(roleIds!=null&&roleIds.length>0) {
			List<Role> roles = roleService.getByIds(roleIds);
			usr.setRoles(new HashSet<Role>(roles));
		}else {
			usr.setRoles(null);
		}
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
	/**
	 * 8.确定登录名的唯一性
	 */
	public String findByLoginName() {
		String loginName = model.getLoginName();
		ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
		String flag = userService.findLoginName(loginName)?"1":"0";
		try {
			ServletActionContext.getResponse().getWriter().print(flag);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return NONE;
	}
}
