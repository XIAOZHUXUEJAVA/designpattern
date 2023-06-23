package com.zhu.designpattern.structral.decotator.text;

/**
 * @description: BaseString
 * @date: 2023/4/12 15:01
 * @author: zdp
 * @version: 1.0
 */
public class BaseString implements StringComponent {
    protected String text;

    public BaseString(String text) {
        this.text = text;
    }
    @Override
    public String getText() {
        return text;
    }
}
