package com.example.strategy;

import com.example.strategy.Strategy.HelloStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: zhengxx
 * @Date: 2019/10/24 16:59
 * @Description:
 */
@SpringBootTest
public class BeanFactoryTest {

    @Autowired
    BeanFactory beanFactory;

    @Test
    public void helloStrategyTest(){
        System.out.println(beanFactory.getBean("ChineseHelloStrategy", HelloStrategy.class).hello());
        System.out.println(beanFactory.getBean("EnglishHelloStrategy", HelloStrategy.class).hello());
    }
}
