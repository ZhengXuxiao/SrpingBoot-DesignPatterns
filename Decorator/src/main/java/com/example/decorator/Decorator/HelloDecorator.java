package com.example.decorator.Decorator;

import com.example.decorator.Component.HelloComponent;

/**
 * @Author: zhengxx
 * @Date: 2019/11/1 18:35
 * @Description:
 */
public abstract class HelloDecorator implements HelloComponent{
    protected HelloComponent helloComponent;

    public HelloDecorator(HelloComponent helloComponent){
        this.helloComponent = helloComponent;
    }
}
