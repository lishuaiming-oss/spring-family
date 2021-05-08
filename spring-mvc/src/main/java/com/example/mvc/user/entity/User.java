package com.example.mvc.user.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @programe: spring-family
 * @Description: 封装前台表单参数
 * @Author: li shuai ming
 * @Create: 2021/5/7-14:24
 */
public class User {
    private String name;
    private int age;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date birthday;
    private int gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", gender=" + gender +
                '}';
    }
}
