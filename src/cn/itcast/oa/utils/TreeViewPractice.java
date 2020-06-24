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
			dep.setName(prefix+dep.getName());
			treelist.add(dep);
			for(Department d:getChildrens(dep.getChildren(),space)) {
				treelist.add(d);
			}
		}
		return treelist;
	}
	
	public static List<Department> getChildrens(Set<Department> childrenSet,String space){
		List<Department> result = new ArrayList<Department>();
		for(Department dep:childrenSet) {
			dep.setName(space+prefix+dep.getName());
			result.add(dep);
			for(Department d:getChildrens(dep.getChildren(),space+space)) {
				result.add(d);
			}
		}
		return result;
	}
}
