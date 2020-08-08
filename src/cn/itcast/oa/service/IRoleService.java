package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.Role;

public interface IRoleService {
    /**
     * 1.增
     */
    public void insertEntity(Role entity);
    /**
     * 2.删
     */
    public void deletEntity(Long id);
    /**
     * 3.改
     */
    public void updateEntiy(Role entity);
    /**
     * 4.查
     */
    public Role selectEntityById(Long id);//根据id查找
    public List<Role> selectEntityByIds(Long[] ids);//根据多个id查找
    public List<Role> selectAllEntitys();//查找全部
}
