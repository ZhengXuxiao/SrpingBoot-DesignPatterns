package com.example.strategy.Context;

import com.example.strategy.Strategy.HelloStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: zhengxx
 * @Date: 2019/10/24 16:39
 * @Description:
 */
@Service
public class HelloStrategyContext {

    @Autowired
    Map<String, HelloStrategy> helloStrategyMap = new ConcurrentHashMap<>(2);

    public HelloStrategy getHelloStrategy(String usedHelloStrategy){
        return helloStrategyMap.get(usedHelloStrategy);
    }

}
