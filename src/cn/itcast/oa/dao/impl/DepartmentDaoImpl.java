package cn.itcast.oa.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.itcast.oa.base.BaseDaoImpl;
import cn.itcast.oa.dao.IDepartmentDao;
import cn.itcast.oa.domain.Department;

@Repository
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements IDepartmentDao {
	@Override
	public List<Department> findTopList(){
		/**Java method:
		 * List<Department> list = findAll();
		 * List<Department> rlist = list.stream()
		 * .filter(d->d.parentId==null)
		 * .collect(Collectors.toList());
		 */
		//SQL method
		String hql = "FROM Department d WHERE d.parent IS NULL;";
		List<Department> rlist = this.getSession().createQuery(hql).list();
		return rlist;
	}
	
	@Override
	public List<Department> findChildren(Long Id){
		String hql = "FROM Department d WHERE d.parent.id = ?";
		return this.getSession().createQuery(hql).setParameter(0, Id).list();
	}
}
