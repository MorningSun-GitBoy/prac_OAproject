package cn.itcast.oa.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * ps:职位实体
 * 
 * @author Bachelor
 *
 */
public class Role {
	private long id;
	private String name;
	private String descripeion;
	private Set<User> users;

	public Role() {
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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
