package com.example.observer.BaseObserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author: zhengxx
 * @Date: 2019/10/29 11:00
 * @Description:
 */
@SpringBootTest
class BaseObserverTest {

    @Autowired
    BaseSubject baseSubject;

    @Resource(name = "baseObserverA")
    BaseObserver baseObserverA;

    @Resource(name = "baseObserverB")
    BaseObserver baseObserverB;

    @Resource(name = "baseObserverC")
    BaseObserver baseObserverC;

    @Test
    void observerTest(){
        baseSubject.attachObserver(baseObserverA);
        baseSubject.attachObserver(baseObserverB);
        baseSubject.notifyObservers("hello");
        System.out.println("===========================");
        baseSubject.attachObserver(baseObserverC);
        baseSubject.notifyObservers("你好");
        System.out.println("===========================");
        baseSubject.detachObserver(baseObserverB);
        baseSubject.notifyObservers("bonjour ");
    }

}