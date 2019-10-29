package com.example.observer.BuildInObserver;

import org.springframework.stereotype.Service;

import java.util.Observable;

/**
 * @Author: zhengxx
 * @Date: 2019/10/29 11:36
 * @Description:
 */
@Service
public class BuildInSubject extends Observable {

    public void notify(String event) {
        setChanged();
        notifyObservers(event);
    }

}
