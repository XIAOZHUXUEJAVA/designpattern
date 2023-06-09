package com.zhu.designpattern.structral.decotator.text;

/**
 * @description: StringTextDecorator
 * @date: 2023/4/12 15:03
 * @author: zdp
 * @version: 1.0
 */
public abstract class StringTextDecorator implements StringComponent {
    protected StringComponent component;

    public StringTextDecorator(StringComponent component) {
        this.component = component;
    }
}
