package com.zhu.designpattern.singleton;

/**
 * @description: 饿汉式
 * @date: 2023/5/23 13:54
 * @author: zdp
 * @version: 1.0
 */
public class Singleton1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        // 说明bank1和bank2指代的是同一个对象
        System.out.println(bank1 == bank2);
    }

}

class Bank {

    // 1. 私有化构造器
    private Bank() {

    }

    // 2. 类内部创建对象，必须是静态的
    private static Bank instance = new Bank();

    // 3. 使用公共的静态方法，我们不需要创建Bank对象
    public static Bank getInstance() {
        return instance;
    }
}