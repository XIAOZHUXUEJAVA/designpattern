package com.zhu.designpattern.decotator.html;

/**
 * @description: BoldDecorator 装饰器实现子类
 * @date: 2023/4/12 13:56
 * @author: zdp
 * @version: 1.0
 */
public class BoldDecorator extends NodeDecorator {
    public BoldDecorator(TextNode textNode) {
        super(textNode);
    }

    @Override
    public void setText(String text) {
        this.textNode.setText(text);
    }

    @Override
    public String getText() {
        return "<b>" + textNode.getText() + "</b>";
    }
}
