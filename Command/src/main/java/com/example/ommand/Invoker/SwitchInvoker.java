package com.example.ommand.Invoker;

import com.example.ommand.Command.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: zhengxx
 * @Date: 2019/11/8 16:07
 * @Description:
 */
@Service
public class SwitchInvoker {
    @Autowired
    Map<String,Command> commandMap;

    public void invoke(String commandName){
        commandMap.get(commandName).execute();
    }

}
