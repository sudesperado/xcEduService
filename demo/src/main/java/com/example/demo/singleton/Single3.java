package com.example.demo.singleton;

public class Single3 {

    /*
    * 双检锁，又叫双重校验锁，综合了懒汉式和饿汉式两者的优缺点整合而成。
    * 看上面代码实现中，特点是在synchronized关键字内外都加了一层 if 条件判断，
    * 这样既保证了线程安全，又比直接上锁提高了执行效率，还节省了内存空间。
    * */
    private static Single3 single3 ;

    private Single3() {
    }

    public static Single3 getInstance(){
        if(single3 == null){
            synchronized (Single3.class){
                if (single3 == null){
                    single3 = new Single3();
                }
            }
        }
        return single3;
    }

}
