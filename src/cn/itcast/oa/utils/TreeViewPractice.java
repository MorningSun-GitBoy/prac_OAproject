package cn.itcast.oa.utils;

import java.util.ArrayList;
import java.util.List;

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
			
		}
		return treelist;
	}
	
	
}
