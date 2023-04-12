package com.zhu.designpattern.decotator.html;

/**
 * @description: TextNode 最顶层的容器接口
 * @date: 2023/4/12 13:51
 * @author: zdp
 * @version: 1.0
 */
public interface TextNode {
    // 设置text
    void setText(String text);
    // 获取text
    String getText();
}
