package com.zhu.designpattern.testextends;

/**
 * @description: Teacher
 * @date: 2023/7/9 15:08
 * @author: zdp
 * @version: 1.0
 */
public class Teacher extends Human {
    public String age;

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public Teacher() {

    }

    public static void main(String[] args) {

        Human human = new Teacher();
    }
}

