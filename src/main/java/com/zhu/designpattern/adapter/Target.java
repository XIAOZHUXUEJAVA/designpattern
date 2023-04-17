package com.zhu.designpattern.adapter;

/**
 * @description: Target
 * @date: 2023/4/17 19:07
 * @author: zdp
 * @version: 1.0
 */
public abstract class Target {
    public void request() {
        System.out.println("普通的请求");
    }
}
