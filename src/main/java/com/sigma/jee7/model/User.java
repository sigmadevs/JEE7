package com.sigma.jee7.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String pass;

    public User() { }
    
    public User(int id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + ", name=" + name + ", pass=" + pass + '}';
    }
    
}
