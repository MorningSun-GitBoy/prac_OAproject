package cn.itcast.oa.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.oa.base.BaseAction;
import cn.itcast.oa.dao.IRoleDao;
import cn.itcast.oa.domain.Role;

@Controller
@Scope("prototype")
public class RoleAction extends BaseAction<Role>{
    /**
     * 1.查询全部岗位
     */
    public String list() {
	List<Role> roles = roleService.selectAllEntitys();
	return "list";//返回页面的名称
    }
}
