package com.zhu.designpattern.decotator.clothes;

/**
 * @description: Person 具体的容器
 * @date: 2023/4/12 14:25
 * @author: zdp
 * @version: 1.0
 */
public class Person {
    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }
    private String name;
    public void show() {
        System.out.print(name);
    }
}
