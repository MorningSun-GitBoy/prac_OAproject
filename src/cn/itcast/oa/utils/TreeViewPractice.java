package cn.itcast.oa.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cn.itcast.oa.domain.Department;

/**
 * Attention:不能使用多层循环的方式，因为需要支持任意层
 * @author Bachelor
 *
 */
public class TreeViewPractice {
	public static String prefix = "├";
	public static String space = "  ";
	/**
	 * format: |- XXX部
	 * 			 |- XXX部
	 * 			   |- XXX部
	 * 			 |- XXX部
	 * 			   |- XXX部
	 * 		   |- XXX部
	 * 			 |- XXX部
	 */
	public static List<Department> getTreeList(List<Department> toplist) {
		List<Department> treelist = new ArrayList<Department>();
		for(Department dep:toplist) {
			Department copy = new Department();
			copy.setId(dep.getId());
			copy.setName(prefix+dep.getName());
			treelist.add(copy);
			//避免更改持久化数据，用备份来完成
			for(Department d:getChildrens(dep.getChildren(),space,null)) {
				treelist.add(d);
			}
		}
		return treelist;
	}
	
	public static List<Department> getTreeList(List<Department> toplist,Long removeId) {
		List<Department> treelist = new ArrayList<Department>();
		for(Department dep:toplist) {
			if(removeId != null && dep.getId() == removeId)
				continue;
			Department copy = new Department();
			copy.setId(dep.getId());
			copy.setName(prefix+dep.getName());
			treelist.add(copy);
			//避免更改持久化数据，用备份来完成
			for(Department d:getChildrens(dep.getChildren(),space,removeId)) {
				treelist.add(d);
			}
		}
		return treelist;
	}
	
	public static List<Department> getChildrens(Set<Department> childrenSet,String space,Long removeId){
		List<Department> result = new ArrayList<Department>();
		for(Department dep:childrenSet) {
			if(removeId != null && dep.getId() == removeId)
				continue;
			Department copy = new Department();
			copy.setId(dep.getId());
			copy.setName(space+prefix+dep.getName());
			result.add(copy);
			for(Department d:getChildrens(dep.getChildren(),space+space,removeId)) {
				result.add(d);
			}
		}
		return result;
	}
}
