package com.zhu.designpattern.decotator.html;

/**
 * @description: ItalicDecorator 装饰器实现子类
 * @date: 2023/4/12 14:04
 * @author: zdp
 * @version: 1.0
 */
public class ItalicDecorator extends NodeDecorator {

    public ItalicDecorator(TextNode textNode) {
        super(textNode);
    }
    @Override
    public void setText(String text) {
        this.textNode.setText(text);
    }

    @Override
    public String getText() {
        return "<i>" + this.textNode.getText() + "</i>";
    }
}
