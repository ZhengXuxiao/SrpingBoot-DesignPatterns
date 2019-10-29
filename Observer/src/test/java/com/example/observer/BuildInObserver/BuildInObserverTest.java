package com.example.observer.BuildInObserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zhengxx
 * @Date: 2019/10/29 14:36
 * @Description:
 */
@SpringBootTest
class BuildInObserverTest {

    @Resource(name = "BuildInObserverA")
    BuildInObserver buildInObserverA;

    @Resource(name = "BuildInObserverB")
    BuildInObserver buildInObserverB;

    @Resource(name = "BuildInObserverC")
    BuildInObserver buildInObserverC;

    @Autowired
    BuildInSubject buildInSubject;

    @Test
    void observerTest(){
        buildInSubject.addObserver(buildInObserverA);
        buildInSubject.addObserver(buildInObserverB);
        buildInSubject.notify("hello");
        System.out.println("===========================");
        buildInSubject.addObserver(buildInObserverC);
        buildInSubject.notify("你好");
        System.out.println("===========================");
        buildInSubject.deleteObserver(buildInObserverB);
        buildInSubject.notify("bonjour");
    }

}