package com.example.demo.singleton;

public class Single1 {


    /*
    * 单例模式 ：只有一个实例  自己创建自己的对象
    * 懒汉式  饿汉式
    * 懒汉式，顾名思义就是实例在用到的时候才去创建，“比较懒”，
    * 用的时候才去检查有没有实例，如果有则返回，没有则新建。
    * 有线程安全和线程不安全两种写法，区别就是synchronized关键字。
    * */
    private Single1 single1;

    private Single1() {
    }

    public Single1 getInstance(Single1 single1){
        if (single1 == null){
            single1 = new Single1();
        }
        return single1;
    }

}
