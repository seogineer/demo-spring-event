package com.seogineer.demoevents.ThisDomain.event;

public class SpringEventPublisher {
    private final String message;

    public SpringEventPublisher(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
