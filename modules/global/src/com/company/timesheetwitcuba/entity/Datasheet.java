package com.company.timesheetwitcuba.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "TIMESHEETWITHCUBA_DATASHEET")
@Entity(name = "timesheetwithcuba_Datasheet")
public class Datasheet extends StandardEntity {
    private static final long serialVersionUID = -7348720272376774771L;

    @Column(name = "HOUR_")
    private Integer hour;

    @Column(name = "TYPE_", unique = true)
    private String type;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_")
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    public void setType(TypeDay type) {
        this.type = type == null ? null : type.getId();
    }

    public TypeDay getType() {
        return type == null ? null : TypeDay.fromId(type);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
}