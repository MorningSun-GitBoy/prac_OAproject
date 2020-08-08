package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.Department;

public interface IDepartmentService {
    /**
     * 1.增
     */
    public void insertEntity(Department entity);
    /**
     * 2.删
     */
    public void deletEntity(Long id);
    /**
     * 3.改
     */
    public void updateEntiy(Department entity);
    /**
     * 4.查
     */
    public Department selectEntityById(Long id);//根据id查找
    public List<Department> selectEntityByIds(Long[] ids);//根据多个id查找
    public List<Department> selectAllEntitys();//查找全部
}
