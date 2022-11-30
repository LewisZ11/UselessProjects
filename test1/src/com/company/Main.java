package com.company;

public class Main {

    public static void foo(String text) {
        text = text.concat("dddsx"); //返回值
        System.out.println(text);
    }

    public static void main(String[] args) {
	// write your code here
    // 如果要在 main() 方法中调用本类中的其他方法，则该方法也必须是静态的，否则需要先创建本类的实例对象，然后再通过对象调用成员方法
    // main() 方法中只能直接调用静态方法，如果想调用非静态方法，需要将当前类实例化，然后通过类的对象来调用
        String s = "菜鸟教程：";
        foo(s);
        System.out.println(s);
    }
}
