package com.example.observer.SpringObserver;

import org.springframework.context.ApplicationListener;

/**
 * @Author: zhengxx
 * @Date: 2019/10/28 16:14
 * @Description:
 */
public class SpringObserver implements ApplicationListener<HelloEvent> {

    String name;

    public SpringObserver(String name){
        this.name = name;
    }

    @Override
    public void onApplicationEvent(HelloEvent helloEvent) {
        System.out.println(this.name+"...receive..."+(String)helloEvent.getSource());
    }
}
