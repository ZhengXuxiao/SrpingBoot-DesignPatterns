package com.example.observer.SpringObserver;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: zhengxx
 * @Date: 2019/10/28 16:10
 * @Description:
 */
public class HelloEvent extends ApplicationEvent{

    public HelloEvent(Object source) {
        super(source);
    }
}
