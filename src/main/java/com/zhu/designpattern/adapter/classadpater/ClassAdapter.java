package com.zhu.designpattern.adapter.classadpater;


/**
 * @description: ClassAdapter
 * @date: 2023/4/19 22:39
 * @author: zdp
 * @version: 1.0
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }
}
