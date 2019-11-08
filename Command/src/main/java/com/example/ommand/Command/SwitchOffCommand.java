package com.example.ommand.Command;

import com.example.ommand.Receiver.Light;

/**
 * @Author: zhengxx
 * @Date: 2019/11/8 15:46
 * @Description:
 */
public class SwitchOffCommand implements Command {
    private final Light light;

    public SwitchOffCommand(Light light) {
        this.light = light;
    }

    @Override // Command
    public void execute() {
        light.turnOff();
    }
}
