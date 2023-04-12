package com.zhu.designpattern.decotator.text;

/**
 * @description: Client
 * @date: 2023/4/12 15:07
 * @author: zdp
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        StringComponent sc = new BaseString(" hello, world ");
        System.out.println(sc.getText());
        StringTextDecorator std = new TrimString(sc);
        System.out.println(std.getText());
        StringTextDecorator ucs = new UpperCaseString(std);
        System.out.println(ucs.getText());

    }
}
