package com.zhu.designpattern.structral.adapter;

/**
 * @description: Adaptee 需要适配的类, 和Target抽象类中的request不同 客户只能使用Target当中的接口，不能直接使用Adaptee的接口
 * @date: 2023/4/17 19:09
 * @author: zdp
 * @version: 1.0
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("特殊的请求");
    }
}
