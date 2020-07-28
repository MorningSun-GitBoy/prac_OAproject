package cn.itcast.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.itcast.oa.dao.IPrivilegeDao;
import cn.itcast.oa.domain.Privilege;
import cn.itcast.oa.service.IPrivilegeService;

public class PrivilegeServiceImpl implements IPrivilegeService {
    @Resource
    private IPrivilegeDao privilegeDao;
    @Override
    public List<Privilege> findAll() {
	// TODO Auto-generated method stub
	return privilegeDao.findAll();
    }

}
