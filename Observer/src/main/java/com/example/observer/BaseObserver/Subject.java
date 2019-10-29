package com.example.observer.BaseObserver;

/**
 * @Author: zhengxx
 * @Date: 2019/10/29 10:12
 * @Description:
 */
public interface Subject {

    void attachObserver(Observer observer);

    void detachObserver(Observer observer);

    void notifyObservers(String event);
}
