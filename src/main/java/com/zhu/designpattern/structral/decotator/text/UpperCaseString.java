package com.zhu.designpattern.structral.decotator.text;

/**
 * @description: UpperCaseString
 * @date: 2023/4/12 15:05
 * @author: zdp
 * @version: 1.0
 */
public class UpperCaseString extends StringTextDecorator {

    public UpperCaseString(StringComponent component) {
        super(component);
    }

    @Override
    public String getText() {
        return component.getText().toUpperCase();
    }
}
