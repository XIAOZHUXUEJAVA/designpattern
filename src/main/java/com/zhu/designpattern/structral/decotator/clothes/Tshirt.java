package com.zhu.designpattern.structral.decotator.clothes;

/**
 * @description: Tshirt 具体的服饰类装饰器
 * @date: 2023/4/12 14:43
 * @author: zdp
 * @version: 1.0
 */
public class Tshirt extends Finery {
    @Override
    public void show() {
        System.out.print("T-shirt+");
        this.component.show();
    }
}
