package com.zhu.designpattern.creational.prototype;

/**
 * @description: Rectangle
 * @date: 2023/6/26 22:51
 * @author: zdp
 * @version: 1.0
 */
public class Rectangle implements Cloneable {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public void printInfo() {
        System.out.println("Rectangle: width = " + width + ", height = " + height);
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle)super.clone();
    }

}
