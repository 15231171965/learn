package com.yao.userAPI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
        System.out.println("启动成功");
        System.in.read();
    }
}
