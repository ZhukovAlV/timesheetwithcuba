package com.company.timesheetwitcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "TIMESHEETWITHCUBA_USER")
@Entity(name = "timesheetwithcuba_User")
@NamePattern("%s|firstName")
public class User extends StandardEntity {
    private static final long serialVersionUID = 5326984058453596372L;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PATRONYMIC")
    private String patronymic;

    @Column(name = "NUMBER_TIMESHEET", unique = true)
    private Integer numberTimesheet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private Position user;

    public Position getUser() {
        return user;
    }

    public void setUser(Position user) {
        this.user = user;
    }

    public Integer getNumberTimesheet() {
        return numberTimesheet;
    }

    public void setNumberTimesheet(Integer numberTimesheet) {
        this.numberTimesheet = numberTimesheet;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}