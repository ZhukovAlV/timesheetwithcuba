package com.company.timesheetwitcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "TIMESHEETWITHCUBA_POSITION")
@Entity(name = "timesheetwithcuba_Position")
@NamePattern("%s|name")
public class Position extends StandardEntity {
    private static final long serialVersionUID = 948964868874689887L;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "position")
    private List<User> user;

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}