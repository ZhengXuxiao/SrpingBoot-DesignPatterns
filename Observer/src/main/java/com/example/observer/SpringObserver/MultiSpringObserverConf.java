package com.example.observer.SpringObserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhengxx
 * @Date: 2019/10/28 16:50
 * @Description:
 */
@Configuration
public class MultiSpringObserverConf {

    @Bean("helloObserverA")
    public SpringObserver buildSpringObserverA(){
        return new SpringObserver("helloObserverA");
    }

    @Bean("helloObserverB")
    public SpringObserver buildSpringObserverB(){
        return new SpringObserver("helloObserverB");
    }

    @Bean("helloObserverC")
    public SpringObserver buildSpringObserverC(){
        return new SpringObserver("helloObserverC");
    }

}
