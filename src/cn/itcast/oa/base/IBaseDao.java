package cn.itcast.oa.base;

import java.util.List;

/**
 * 1.通用Dao设计
 * @author Bachelor
 * @param T entity 指各种Dao的类型
 * @method 增
 * @method 删
 * @method 改
 * @method id查
 * @method ids查
 * @method 查找全部
 */
public interface IBaseDao<T> {
    /**
     * 1.增
     */
    public void insertEntity(T entity);
    /**
     * 2.删
     */
    public void deletEntity(Long id);
    /**
     * 3.改
     */
    public void updateEntiy(T entity);
    /**
     * 4.查
     */
    public T selectEntityById(Long id);//根据id查找
    public List<T> selectEntityByIds(Long[] ids);//根据多个id查找
    public List<T> selectAllEntitys();//查找全部
}
