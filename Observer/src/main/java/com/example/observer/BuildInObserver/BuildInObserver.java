package com.example.observer.BuildInObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: zhengxx
 * @Date: 2019/10/29 11:33
 * @Description:
 */
public class BuildInObserver implements Observer {

    private String name;

    public BuildInObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name + " receive..." + arg);
    }
}
