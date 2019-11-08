package com.example.ommand.Command;

import com.example.ommand.Receiver.Light;

/**
 * @Author: zhengxx
 * @Date: 2019/11/8 15:41
 * @Description:
 */
public class SwitchOnCommand implements Command{
    private final Light light;

    public SwitchOnCommand(Light light) {
        this.light = light;
    }

    @Override // Command
    public void execute() {
        light.turnOn();
    }
}
