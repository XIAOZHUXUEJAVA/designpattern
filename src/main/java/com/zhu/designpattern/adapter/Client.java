package com.zhu.designpattern.adapter;

/**
 * @description: Client
 * @date: 2023/4/17 19:21
 * @author: zdp
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
