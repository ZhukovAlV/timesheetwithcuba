package com.company.timesheetwitcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Table(name = "TIMESHEETWITHCUBA_HOLY_DAY")
@Entity(name = "timesheetwithcuba_HolyDay")
@NamePattern("%s|name")
public class HolyDay extends StandardEntity {
    private static final long serialVersionUID = 5799355443424019745L;

    @Column(name = "DATE_DAY")
    private LocalDate dateDay;

    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateDay() {
        return dateDay;
    }

    public void setDateDay(LocalDate dateDay) {
        this.dateDay = dateDay;
    }
}