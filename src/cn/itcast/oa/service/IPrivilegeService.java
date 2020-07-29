package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.Privilege;
import cn.itcast.oa.domain.Privilege;

public interface IPrivilegeService {

    public Privilege getById(Long Id);// 根据id查询 ：select by id

    public List<Privilege> getByIds(Long[] ids);// 根据id查询多个 ：multiply select by ids
    
    public List<Privilege> findAll();//查询全部
}
