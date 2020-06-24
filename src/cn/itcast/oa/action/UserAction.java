package cn.itcast.oa.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.oa.base.BaseAction;
import cn.itcast.oa.domain.User;

@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User>{
	
	public String list() {
		return "list";
	}
	
	public String delete() {
		return "tolist";
	}
	
	public String addUI() {
		return "addUI";
	}
	
	public String add() {
		return "tolist";
	}
	
	public String editUI() {
		return "editUI";
	}
	
	public String edit() {
		return "edit";
	}
	
	public String initPW() {
		return "tolist";
	}
}
