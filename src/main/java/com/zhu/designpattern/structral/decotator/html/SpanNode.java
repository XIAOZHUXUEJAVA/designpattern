package com.zhu.designpattern.structral.decotator.html;

/**
 * @description: SpanNode 实际的基础的容器Component
 * @date: 2023/4/12 13:52
 * @author: zdp
 * @version: 1.0
 */
public class SpanNode implements TextNode {
    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "<span>" + text + "</span>";
    }
}
