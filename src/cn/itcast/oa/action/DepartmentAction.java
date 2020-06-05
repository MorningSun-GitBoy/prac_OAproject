package cn.itcast.oa.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.oa.base.BaseAction;
import cn.itcast.oa.domain.Department;

@Controller
@Scope("prototype")
public class DepartmentAction extends BaseAction<Department>{
	/**
	 * 1.展示部门列表
	 */
	public String list() {
		List<Department> list = deparService.findAll();
		getValueStack().set("lsit", list);
		return "list";
	}
	/**
	 * 2.根据id删除
	 */
	public String delet() {
		deparService.delete(model.getId());
		return "tolist";
	}
	/**
	 * 3.显示更改页面
	 */
	public String editUI() {
		Department depar = deparService.getById(model.getId());
		getValueStack().push(depar);
		return "editUI";
	}
	/**
	 * 4.完成更改
	 */
	public String edit() {
		Department depar = deparService.getById(model.getId());
		depar.setName(model.getName());
		depar.setParent(model.getParent());
		depar.setDescripeion(model.getDescripeion());
		deparService.update(depar);
		return "edit";
	}
	/**
	 * 5.显示新建页面
	 */
	public String addUI() {
		return "addUI";
	}
	/**
	 * 6.完成新建
	 */
	public String add() {
		deparService.save(model);
		return "add";
	}
}
