package cn.itcast.oa.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.util.ValueStack;

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
	ValueStack vs = getValueStack();
	vs.set("list", roles);
	return "list";//返回url
    }
    /**
     * 2.返回更改页面
     */
    /**
     * 3.进行更改
     */
    /**
     * 4.返回添加页面
     */
    /**
     * 5.进行添加操作
     */
    /**
     * 6.进行删除操作
     */
}
