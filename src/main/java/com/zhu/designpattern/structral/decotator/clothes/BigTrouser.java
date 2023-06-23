package com.zhu.designpattern.structral.decotator.clothes;

/**
 * @description: BigTrouser
 * @date: 2023/4/12 14:48
 * @author: zdp
 * @version: 1.0
 */
public class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.print("BigTrouser+");
        this.component.show();
    }
}
