package com.example.strategy;

import com.example.strategy.Context.HelloStrategyContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: zhengxx
 * @Date: 2019/10/24 16:52
 * @Description:
 */
@SpringBootTest
public class StrategyContextTest {
    @Autowired
    HelloStrategyContext helloStrategyContext;

    @Test
    public void helloStrategyTest(){
        System.out.println(helloStrategyContext.getHelloStrategy("ChineseHelloStrategy").hello());
        System.out.println(helloStrategyContext.getHelloStrategy("EnglishHelloStrategy").hello());
    }
}
