package com.company.timesheetwitcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "TIMESHEETWITHCUBA_USER")
@Entity(name = "timesheetwithcuba_User")
@NamePattern("%s %s %s|firstName,lastName,patronymic")
public class User extends StandardEntity {
    private static final long serialVersionUID = 5326984058453596372L;

    @Column(name = "NUMBER_TIMESHEET", unique = true)
    private Integer numberTimesheet;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PATRONYMIC")
    private String patronymic;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POSITION_ID")
    private Position position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

    @OneToMany(mappedBy = "user")
    private List<Datasheet> datasheet;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Datasheet> getDatasheet() {
        return datasheet;
    }

    public void setDatasheet(List<Datasheet> datasheet) {
        this.datasheet = datasheet;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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