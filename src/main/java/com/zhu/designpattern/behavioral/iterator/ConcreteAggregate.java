package com.zhu.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ConcreteAggregate
 * @date: 2023/4/20 16:34
 * @author: zdp
 * @version: 1.0
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private final List<T> list = new ArrayList<>();

    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public iterator<T> getIterator() {
        return new ConcreteIterator<>(list);
    }
}
