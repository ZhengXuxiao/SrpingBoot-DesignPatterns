package com.example.observer.BuildInObserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhengxx
 * @Date: 2019/10/29 14:19
 * @Description:
 */
@Configuration
public class MultiBuildInObserverConf {

    @Bean("BuildInObserverA")
    public BuildInObserver buildBuildInObserverA(){
        return new BuildInObserver("BuildInObserverA");
    }

    @Bean("BuildInObserverB")
    public BuildInObserver buildBuildInObserverB(){
        return new BuildInObserver("BuildInObserverB");
    }

    @Bean("BuildInObserverC")
    public BuildInObserver buildBuildInObserverC(){
        return new BuildInObserver("BuildInObserverC");
    }

}
