package cn.itcast.oa.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.oa.base.BaseAction;
import cn.itcast.oa.domain.Department;
import cn.itcast.oa.utils.TreeView;

@Controller
@Scope("prototype")
public class DepartmentAction extends BaseAction<Department>{
	private Long parentId;//属性驱动:属性自动进入值栈
	public Long getParentId() {
		return parentId;
	}
	public void setParentID(Long parentID) {
		this.parentId = parentID;
	}
	/**
	 * 1.展示部门列表
	 */
	public String list() {
		//List<Department> list = deparService.findAll();
		List<Department> list ;
		if (parentId == null) {
			list = deparService.findTopList();
		}else {
			list = deparService.findChildren(parentId);
			Department dep = deparService.getById(parentId);
			getValueStack().set("dep", dep);
		}
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
		List<Department> toplist = deparService.findTopList();
		List<Department> list = TreeView.getTreeList(toplist,model.getId());
		getValueStack().set("deparList", list);
		Department depar = deparService.getById(model.getId());
		if(depar.getParent()!=null) {
			parentId = depar.getParent().getId();
		}else {
			parentId = 0l;
		}
		getValueStack().push(depar);
		return "editUI";
	}
	/**
	 * 4.完成更改
	 */
	public String edit() {
		Department depar = deparService.getById(model.getId());
		depar.setName(model.getName());
		if(parentId != null && parentId != 0) {
			Department parent = deparService.getById(parentId);
			depar.setParent(parent);
		}else {
			depar.setParent(null);
		}
		depar.setDescripeion(model.getDescripeion());
		deparService.update(depar);
		return "tolist";
	}
	/**
	 * 5.显示新建页面
	 */
	public String addUI() {
		List<Department> toplist = deparService.findTopList();
		List<Department> list = TreeView.getTreeList(toplist);
		getValueStack().set("deparList", list);
		return "addUI";
	}
	/**
	 * 6.完成新建
	 */
	public String add() {
		if(parentId != null && parentId != 0) {
			Department parent = deparService.getById(parentId);
			model.setParent(parent);
		}else {
			model.setParent(null);
		}
		deparService.save(model);
		return "tolist";
	}
}
