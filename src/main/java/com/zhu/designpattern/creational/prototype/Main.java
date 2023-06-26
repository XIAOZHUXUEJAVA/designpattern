package com.zhu.designpattern.creational.prototype;

import com.sun.xml.internal.fastinfoset.util.PrefixArray;

/**
 * @description: Main
 * @date: 2023/6/26 22:55
 * @author: zdp
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.printInfo();

        try {
            Rectangle cloneRectangle = rectangle.clone();
            cloneRectangle.printInfo();

            cloneRectangle.setWidth(20);
            cloneRectangle.setHeight(10);

            cloneRectangle.printInfo();
            rectangle.printInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
