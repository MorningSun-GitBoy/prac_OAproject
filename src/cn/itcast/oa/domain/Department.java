package cn.itcast.oa.domain;

import java.util.Set;

/**
 * @class Department
 * @author Bachelor
 * @parameters :
 * id:Long
 * name:String
 * descripeion:String
 * parent:Department
 * children:Set::Department
 * users:Set::User
 */
public class Department {
    private Long id;
    private String name;
    private String description;
    private Department parent;
    private Set<Department> children;
    private Set<User> users;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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
