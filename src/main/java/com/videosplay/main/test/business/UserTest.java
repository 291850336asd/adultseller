package com.videosplay.main.test.business;

/**
 * Created by sunmeng on 17/8/1.
 */
public class UserTest {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                '}';
    }
}
