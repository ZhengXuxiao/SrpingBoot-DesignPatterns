package com.example.observer.BaseObserver;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: zhengxx
 * @Date: 2019/10/29 10:19
 * @Description:
 */
@Service
public class BaseSubject implements Subject {

    private final List<Observer> observersList = new LinkedList<>();

    @Override
    public void attachObserver(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        this.observersList.forEach(ob -> ob.update(event) );
    }
}
