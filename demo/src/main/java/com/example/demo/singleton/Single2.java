package com.example.demo.singleton;

public class Single2 {

    /*
    *饿汉式，从名字上也很好理解，就是“比较勤”，实例在初始化的时候就已经建好了，
    * 不管你有没有用到，都先建好了再说。好处是没有线程安全的问题，坏处是浪费内存空间。
    * */
    private static final Single2 singel2 = new Single2();

    private Single2() {
    }

    public static Single2 getInstance(){
        return singel2;
    }
}
