package com.zhu.designpattern.behavioral.iterator;

/**
 * @description: iterator
 * @date: 2023/4/20 16:14
 * @author: zdp
 * @version: 1.0
 */
public interface iterator<T> {

    T first();
    T next();
    boolean hasNext();
}
