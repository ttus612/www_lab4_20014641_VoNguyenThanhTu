package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Cach 1:
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("teo.xml");
//        Student t1 = ctx.getBean("t1", Student.class);
//        System.out.println(t1);

//        Cach 2:
        ApplicationContext context = new ClassPathXmlApplicationContext("teo.xml");
        Student student1 = context.getBean("st2", Student.class);
        System.out.println(student1);
        Student student2 = context.getBean("st3", Student.class);
        System.out.println(student2);
    }
}