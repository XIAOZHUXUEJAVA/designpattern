package com.zhu.designpattern.structral.decotator.html;

/**
 * @description: Clent 客户端 用于测试
 * @date: 2023/4/12 13:58
 * @author: zdp
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        TextNode n1 = new SpanNode();
        n1.setText("hello, world");
        // <span>hello, world</span>
        System.out.println(n1.getText());

        TextNode n2 = new BoldDecorator(n1);
        // <b><span>hello, world</span></b>
        System.out.println(n2.getText());

        TextNode n3 = new ItalicDecorator(n2);
        // <i><b><span>hello, world</span></b></i>
        System.out.println(n3.getText());
    }
}
