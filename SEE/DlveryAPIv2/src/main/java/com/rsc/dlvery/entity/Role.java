package com.rsc.dlvery.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
    @Id
    private String role;

    private String roleDesc;

    public String getRole() {
        return role;
    }

    @ManyToMany(mappedBy = "roles")
    private List<User> users = new ArrayList<>();

    public void setRole(String role) {
        this.role = role;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    
}
