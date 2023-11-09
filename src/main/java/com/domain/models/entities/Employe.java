package com.domain.models.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tbl_employe")
public class Employe implements Serializable {

    @Id
    @Column(length = 8)
    private long emp_no;

    @Column(length = 50, nullable = false)
    private String first_name;

    @Column(length = 50, nullable = false)
    private String last_name;

    private String departement;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date birth_date;

    public Employe() {
    }

    public long getEmp_no() {
        return emp_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getDepartement() {
        return departement;
    }

    public Gender getGender() {
        return gender;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setEmp_no(long emp_no) {
        this.emp_no = emp_no;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

}
