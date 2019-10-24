package com.example.strategy.StrategyImp;

import com.example.strategy.Strategy.HelloStrategy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: zhengxx
 * @Date: 2019/10/24 16:12
 * @Description:
 */
@Component("EnglishHelloStrategy")
public class EnglishHelloStrategy implements HelloStrategy {
    @Override
    public String hello() {
        return "hello";
    }
}
