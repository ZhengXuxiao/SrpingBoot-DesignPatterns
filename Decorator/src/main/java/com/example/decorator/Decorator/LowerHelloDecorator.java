package com.example.decorator.Decorator;

import com.example.decorator.Component.HelloComponent;

/**
 * @Author: zhengxx
 * @Date: 2019/11/4 10:16
 * @Description:
 */
public class LowerHelloDecorator extends HelloDecorator {
    public LowerHelloDecorator(HelloComponent helloComponent) {
        super(helloComponent);
    }

    @Override
    public String hello() {
        return this.helloComponent.hello().toLowerCase();
    }
}
