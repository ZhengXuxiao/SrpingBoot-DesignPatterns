package com.example.observer.BaseObserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhengxx
 * @Date: 2019/10/28 16:50
 * @Description:
 */
@Configuration
public class MultiBaseObserverConf {

    @Bean("baseObserverA")
    public BaseObserver buildBaseObserverA(){
        return new BaseObserver("BaseObserverA");
    }

    @Bean("baseObserverB")
    public BaseObserver buildBaseObserverB(){
        return new BaseObserver("BaseObserverB");
    }

    @Bean("baseObserverC")
    public BaseObserver buildBaseObserverC(){
        return new BaseObserver("BaseObserverC");
    }

}
