package com.zhu.designpattern.adapter.classadpater;

/**
 * @description: Client
 * @date: 2023/4/19 22:40
 * @author: zdp
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器模式的测试");
        Target target = new ClassAdapter();
        target.request();
    }
}
