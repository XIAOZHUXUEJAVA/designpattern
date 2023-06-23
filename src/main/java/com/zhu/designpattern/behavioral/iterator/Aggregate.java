package com.zhu.designpattern.behavioral.iterator;

/**
 * @description: Aggregate
 * @date: 2023/4/20 16:25
 * @author: zdp
 * @version: 1.0
 */
public interface Aggregate<T> {
    public void add(T t);
    public void remove(T t);
    public iterator<T> getIterator();
}
