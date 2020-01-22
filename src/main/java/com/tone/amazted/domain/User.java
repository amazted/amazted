package com.tone.amazted.domain;

/**
 * <p> className:    User
 * <p> package:    com.tone.amazted
 * <p> description:    测试Springboot 整合JSP
 * <p> datetime:    2020/1/22   15:59
 * <p> author:   scshfei@gmail.com
 */
public class User {

    private int id;
    private String name;
    private String address;

    public User(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}