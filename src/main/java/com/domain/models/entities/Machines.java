package com.domain.models.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_machines")
public class Machines implements Serializable {

    @Id
    private String id_mch;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String com;

    @Column(length = 50)
    private String loc;

    @Column(length = 50)
    private String kind;

    @Column(length = 4)
    private String year;

    public Machines() {
    }

    public String getId_mch() {
        return id_mch;
    }

    public void setId_mch(String id_mch) {
        this.id_mch = id_mch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
