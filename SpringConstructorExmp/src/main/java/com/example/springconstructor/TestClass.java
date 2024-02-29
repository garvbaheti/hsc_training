package com.example.springconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Addition addition = (Addition) context.getBean("addition");
        System.out.println("Addition Result: " + addition.add());

        Subtraction subtraction = (Subtraction) context.getBean("subtraction");
        System.out.println("Subtraction Result: " + subtraction.subtract());
    }
}
