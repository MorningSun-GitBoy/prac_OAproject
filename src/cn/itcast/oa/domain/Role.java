package cn.itcast.oa.domain;

import java.util.Set;

/**
 * @class Role
 * @author Bachelor
 * @parameters :
 * id:Long
 * name:String
 * descripeion:String
 * users:Set::User
 */
public class Role {
    private Long id;
    private String name;
    private String description;
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
    public Set<User> getUsers() {
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users = users;
    }
    
}
