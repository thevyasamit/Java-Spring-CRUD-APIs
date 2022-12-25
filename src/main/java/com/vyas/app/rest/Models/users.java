package com.vyas.app.rest.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;

    @Column
    private String fname;

    @Column
    private String lname;

    @Column
    private int age;

    @Column
    private String preference;

    @Column
    private int budget;

    public long getUid(){
        return uid;
    }

    public void setUid(long uid){
        this.uid = uid;
    }

    public String getfname(){
        //String name = fname+lname;
        return fname;
    }

    public void setfname(String fname){
        this.fname = fname;
       // this.lname = lname;
    }

    public String getlname(){
        return lname;
    }

    public void setlname(String lname){
        this.lname = lname;
       // this.lname = lname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getPreference(){
        return preference;
    }

    public void setPreference(String pref){
        this.preference = pref;
    }

    public int getBudget(){
        return budget;
    }

    public void setBudget(int budget){
        this.budget = budget;
    }
}
