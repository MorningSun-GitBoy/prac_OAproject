package cn.itcast.oa.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.oa.base.BaseAction;
import cn.itcast.oa.domain.Department;

@Controller
@Scope("prototype")
public class DepartmentAction extends BaseAction<Department>{

}
