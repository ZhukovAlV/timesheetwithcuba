package com.company.timesheetwitcuba.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TypeDay implements EnumClass<String> {

    ЯВКА("Я"),
    ВЫХОДНОЙ("В"),
    ВЫХОД_В_ВЫХОДНОЙ("РП"),
    БОЛЬНИЧНЫЙ("Б");

    private String id;

    TypeDay(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypeDay fromId(String id) {
        for (TypeDay at : TypeDay.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}