package cn.itcast.oa.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.oa.base.BaseAction;
import cn.itcast.oa.domain.Role;

@Controller
@Scope("prototype")
public class RoleAction extends BaseAction<Role>{

}
