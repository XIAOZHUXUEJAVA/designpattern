package com.zhu.designpattern.structral.proxy.common;

/**
 * @description: Client
 * @date: 2023/4/13 9:59
 * @author: zdp
 * @version: 1.0
 */
public class ProxyClient {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
