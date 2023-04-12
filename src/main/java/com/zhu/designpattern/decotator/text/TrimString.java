package com.zhu.designpattern.decotator.text;

/**
 * @description: TrimString
 * @date: 2023/4/12 15:07
 * @author: zdp
 * @version: 1.0
 */
public class TrimString extends StringTextDecorator{
    public TrimString(StringComponent component) {
        super(component);
    }

    @Override
    public String getText() {
        return component.getText().trim();
    }
}
