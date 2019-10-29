package com.example.observer.SpringObserver;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @Author: zhengxx
 * @Date: 2019/10/28 16:18
 * @Description:
 */
@Service
public class SpringSubject implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void notify(HelloEvent helloEvent) {
        this.publisher.publishEvent(helloEvent);
    }

}
