package com.example.observer.BaseObserver;

/**
 * @Author: zhengxx
 * @Date: 2019/10/29 10:18
 * @Description:
 */
public class BaseObserver implements Observer {

    private String name;

    public BaseObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println(this.name + " receive..." + event);
    }
}
