package com.videosplay.main.test.business;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by sunmeng on 17/7/4.
 */

@Entity // This tells Hibernate to make a table out of this class
public class Customers{

    @Id
    private int id;
    private String firstname;
    private String lastname;
    private int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
