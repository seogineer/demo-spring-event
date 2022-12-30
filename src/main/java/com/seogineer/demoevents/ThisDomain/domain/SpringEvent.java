package com.seogineer.demoevents.ThisDomain.domain;

import com.seogineer.demoevents.ThisDomain.event.SpringEventPublisher;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.domain.AbstractAggregateRoot;

@Entity
public class SpringEvent extends AbstractAggregateRoot<SpringEvent> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected SpringEvent() {
    }

    public SpringEvent sendMessage(){
        registerEvent(new SpringEventPublisher("event message"));
        return this;
    }
}
