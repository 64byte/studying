package com.company;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Class<? extends Object> classes = CustomClass.class;

        for (Method method: classes.getDeclaredMethods()) {
            if (method.getAnnotation(CustomAnnotation.class) != null) {
                System.out.println("mehtod Name: " + method.getName());
            }
        }

    }
}
