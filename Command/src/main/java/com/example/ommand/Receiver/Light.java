package com.example.ommand.Receiver;

import org.springframework.stereotype.Component;

/**
 * @Author: zhengxx
 * @Date: 2019/11/8 15:41
 * @Description:
 */
@Component
public class Light {

    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}
