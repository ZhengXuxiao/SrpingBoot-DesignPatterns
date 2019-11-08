package com.example.ommand;

import com.example.ommand.Command.Command;
import com.example.ommand.Command.SwitchOffCommand;
import com.example.ommand.Command.SwitchOnCommand;
import com.example.ommand.Receiver.Light;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhengxx
 * @Date: 2019/11/8 15:54
 * @Description:
 */
@Configuration
public class MultiBeanConf {

    @Bean(name = "lightOff")
    Command getSwitchOffCommand(@Autowired Light light){
        return new SwitchOffCommand(light);
    }

    @Bean(name = "lightOn")
    Command getSwitchOnCommand(@Autowired Light light){
        return new SwitchOnCommand(light);
    }

}
