package com.zhu.designpattern.structral.decotator.html;

/**
 * @description: NodeDecorator 装饰器接口类
 * @date: 2023/4/12 13:53
 * @author: zdp
 * @version: 1.0
 */
public abstract class NodeDecorator implements TextNode {
    protected TextNode textNode;

    public NodeDecorator(TextNode textNode) {
        this.textNode = textNode;
    }
    public void setTextNode(String text) {
        this.textNode.setText(text);
    }
}
