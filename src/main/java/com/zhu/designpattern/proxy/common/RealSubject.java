package com.zhu.designpattern.proxy.common;

/**
 * @description: RealSubject
 * @date: 2023/4/13 9:57
 * @author: zdp
 * @version: 1.0
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真正的请求");
    }
}
