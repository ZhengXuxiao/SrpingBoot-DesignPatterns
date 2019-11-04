package com.example.decorator;

import com.example.decorator.Component.HelloComponent;
import com.example.decorator.Component.HelloComponentImpl;
import com.example.decorator.Decorator.HelloDecorator;
import com.example.decorator.Decorator.LowerHelloDecorator;
import com.example.decorator.Decorator.UpperHelloDecorator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @Author: zhengxx
 * @Date: 2019/11/4 10:43
 * @Description:
 */
@Configuration
public class MultiBeanConf {

    @Bean(name = "baseHello")
    HelloComponent baseHelloComponent(){
        return new HelloComponentImpl();
    }

    @Bean(name = "upperHello")
    HelloDecorator upperHelloDecorator(@Qualifier("baseHello") final HelloComponent helloComponent){
        return new UpperHelloDecorator(helloComponent);
    }

    @Bean(name = "lowerHello")
    HelloDecorator lowerHelloDecorator(@Qualifier("baseHello") final HelloComponent helloComponent){
        return new LowerHelloDecorator(helloComponent);
    }
}
