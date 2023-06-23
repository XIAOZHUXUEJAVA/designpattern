package com.zhu.designpattern.creational.singleton;

/**
 * @description: Singleton3
 * @date: 2023/5/23 14:38
 * @author: zdp
 * @version: 1.0
 */
public class Singleton3 {
    public static void main(String[] args) {

    }

}

class Article {
    private Article() {

    }




    private static volatile Article instance = null; // volatile 保证所有线程都可以得到最新的数据 线程之间的可见性

    public static Article getInstance() {
        if (instance == null) { // 如果不为空直接返回就行了，不用在那等着了
            synchronized (Article.class) { // 加锁, 两个线程同时过了if(instance == null)  只有一个能进代码块
                if (instance == null) { // 第一个线程创建了，第二个线程再判断一次，如果不为空的话，直接返回
                    instance = new Article();
                }
            }
        }
        return instance;
    }
}
