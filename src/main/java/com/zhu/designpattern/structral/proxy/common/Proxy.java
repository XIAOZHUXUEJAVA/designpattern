package com.zhu.designpattern.structral.proxy.common;

/**
 * @description: Proxy
 * @date: 2023/4/13 9:57
 * @author: zdp
 * @version: 1.0
 */
public class Proxy implements Subject {
    private RealSubject realSubject;
    public Proxy() {
        realSubject = new RealSubject();
    }

    @Override
    public void request() {
        preRequest();
        this.realSubject.request();
        postRequest();
    }
    private void preRequest() {
        System.out.println("准备请求");
    }
    private void postRequest() {
        System.out.println("发送请求");
    }
}
