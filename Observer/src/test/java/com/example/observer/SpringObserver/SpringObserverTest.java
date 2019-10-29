package com.example.observer.SpringObserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zhengxx
 * @Date: 2019/10/29 15:04
 * @Description:
 */
@SpringBootTest
class SpringObserverTest {
    @Resource(name = "helloObserverA")
    SpringObserver springObserverA;

    @Resource(name = "helloObserverB")
    SpringObserver springObserverB;

    @Resource(name = "helloObserverC")
    SpringObserver springObserverC;

    @Autowired
    SpringSubject springSubject;

    @Test
    public void helloPublish(){
        HelloEvent helloEvent = new HelloEvent("hello");
        springSubject.notify(helloEvent);
    }
}