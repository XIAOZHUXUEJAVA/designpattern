package com.zhu.designpattern.structral.decotator.clothes;

/**
 * @description: Finery 服饰类装饰器
 * @date: 2023/4/12 14:40
 * @author: zdp
 * @version: 1.0
 */
public abstract class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
