package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.User;

public interface IUserService {
    /**
     * 1.增
     */
    public void insertEntity(User entity);
    /**
     * 2.删
     */
    public void deletEntity(Long id);
    /**
     * 3.改
     */
    public void updateEntiy(User entity);
    /**
     * 4.查
     */
    public User selectEntityById(Long id);//根据id查找
    public List<User> selectEntityByIds(Long[] ids);//根据多个id查找
    public List<User> selectAllEntitys();//查找全部
}
