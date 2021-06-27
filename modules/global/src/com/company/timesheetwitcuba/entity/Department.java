package com.company.timesheetwitcuba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "TIMESHEETWITHCUBA_DEPARTMENT")
@Entity(name = "timesheetwithcuba_Department")
@NamePattern("%s|name")
public class Department extends StandardEntity {
    private static final long serialVersionUID = 4217093347899435939L;

    @Column(name = "NAME")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOSS_ID")
    private User boss;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERFORMER_ID")
    private User performer;

    public User getPerformer() {
        return performer;
    }

    public void setPerformer(User performer) {
        this.performer = performer;
    }

    public User getBoss() {
        return boss;
    }

    public void setBoss(User boss) {
        this.boss = boss;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}