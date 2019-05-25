package com.thanhtrung.doman;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Option {

    @Id
    @GeneratedValue
    @Column(name = "OPTION_ID")
    private Long id;

    @Column(name = "OPTION_VALUE")
    private String value;

    public Option() {
    }

    public Option(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Option id(Long id) {
        this.id = id;
        return this;
    }

    public Option value(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", value='" + getValue() + "'" + "}";
    }

}