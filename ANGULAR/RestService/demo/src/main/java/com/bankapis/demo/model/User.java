package com.bankapis.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "lastname" , nullable = false)
    private String lastname;

    @Column(name = "adhar", nullable = false)
    private long adhar;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "DOB" , nullable = true)
    private Date dob;

    @Column(name = "email", nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uid")
    @JsonManagedReference
    private  UserBank userbank;


    public User(long id, String firstname, String lastname, long adhar, Date dob, String email, UserBank userbank)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.adhar = adhar;
        this.dob = dob;
        this.email = email;
        this.userbank = userbank;
    }

    public User(long id, String firstname, String lastname, long adhar, Date dob, String email)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.adhar = adhar;
        this.dob = dob;
        this.email = email;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getAdhar() {
        return adhar;
    }

    public void setAdhar(long adhar) {
        this.adhar = adhar;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserBank getUserbank() {
        return userbank;
    }

    public void setUserbank(UserBank userbank) {
        this.userbank = userbank;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", adhar=" + adhar +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", userbank=" + userbank +
                '}';
    }

}
