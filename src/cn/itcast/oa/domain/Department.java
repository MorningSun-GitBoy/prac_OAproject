package cn.itcast.oa.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * ps:部门实体
 * 
 * @author Bachelor
 *
 */
public class Department {
	private long id;
	private String name;
	private String descripeion;
	private Department parent;
	private Set<Department> children;
	private Set<User> users;

	public Department() {
		this.children = new HashSet<Department>();
		this.users = new HashSet<User>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripeion() {
		return descripeion;
	}

	public void setDescripeion(String descripeion) {
		this.descripeion = descripeion;
	}

	public Department getParent() {
		return parent;
	}

	public void setParent(Department parent) {
		this.parent = parent;
	}

	public Set<Department> getChildren() {
		return children;
	}

	public void setChildren(Set<Department> children) {
		this.children = children;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
