package com.example.strategy.StrategyImp;

import com.example.strategy.Strategy.HelloStrategy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: zhengxx
 * @Date: 2019/10/24 16:11
 * @Description:
 */
@Component("ChineseHelloStrategy")
public class ChineseHelloStrategy implements HelloStrategy {
    @Override
    public String hello() {
        return "你好";
    }
}
