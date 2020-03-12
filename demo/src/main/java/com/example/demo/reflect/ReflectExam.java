package com.example.demo.reflect;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectExam {

    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.example.demo.reflect.ReflectTest");
            Object o = aClass.newInstance();
            Method method = aClass.getMethod("queryName");
//            method.invoke(o, "wade");
            Field name = aClass.getDeclaredField("name");
            name.setAccessible(true);
            name.set(o,"wade1" );
            method.invoke(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
