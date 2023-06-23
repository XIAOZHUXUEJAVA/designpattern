package com.zhu.designpattern.behavioral.iterator;

/**
 * @description: Client
 * @date: 2023/4/20 16:39
 * @author: zdp
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Aggregate<String> ag = new ConcreteAggregate<>();
        ag.add("山东大学");
        ag.add("山东建筑大学");
        ag.add("济宁学院");
        System.out.println("聚合的内容有:");

        iterator<String> it = ag.getIterator();
        while (it.hasNext()) {
            String school = it.next();
            System.out.print(school.toString() + "\t");
        }
        System.out.println();
        System.out.println(it.first());
    }
}
