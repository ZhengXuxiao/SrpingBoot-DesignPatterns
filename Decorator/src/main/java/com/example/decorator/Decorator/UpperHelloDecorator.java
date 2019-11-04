package com.example.decorator.Decorator;

import com.example.decorator.Component.HelloComponent;

/**
 * @Author: zhengxx
 * @Date: 2019/11/1 18:42
 * @Description:
 */
public class UpperHelloDecorator extends HelloDecorator {
    public UpperHelloDecorator(HelloComponent helloComponent) {
        super(helloComponent);
    }

    @Override
    public String hello() {
        return this.helloComponent.hello().toUpperCase();
    }
}
