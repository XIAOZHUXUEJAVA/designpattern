package com.zhu.designpattern.behavioral.iterator;

import java.util.List;

/**
 * @description: ConcreteIterator
 * @date: 2023/4/20 16:16
 * @author: zdp
 * @version: 1.0
 */
public class ConcreteIterator<T> implements iterator<T> {
    private List<T> list = null;
    private int index = -1;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public T next() {
        return this.hasNext() ? list.get(++index) : null;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }
}
