package com.thanhtrung.doman;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vote {

    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private Option option;

    public Vote() {
    }

    public Vote(Long id, Option option) {
        this.id = id;
        this.option = option;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Option getOption() {
        return this.option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public Vote id(Long id) {
        this.id = id;
        return this;
    }

    public Vote option(Option option) {
        this.option = option;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", option='" + getOption() + "'" + "}";
    }

}