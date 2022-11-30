package com.lewis.lzw;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        //

        List<Integer> list = new ArrayList<>();

        Cat c = new Cat();
        System.out.println(c.age); // 与子类保持一致
        Animal a = new Cat(); //多态
        Cat c1 = (Cat) a; // 向下转型
        System.out.println(c1.kcp);
        System.out.println(a.age); // 只能用父类有的方法
    }
}
