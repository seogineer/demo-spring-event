package com.seogineer.demoevents.OtherDomain.event;

import com.seogineer.demoevents.ThisDomain.event.SpringEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SpringEventListener {
    @EventListener
    public void listener(SpringEventPublisher eventPublisher){
        System.out.println("==================================");
        System.out.println("Receive message : " + eventPublisher.getMessage());
        System.out.println("==================================");
    }
}
