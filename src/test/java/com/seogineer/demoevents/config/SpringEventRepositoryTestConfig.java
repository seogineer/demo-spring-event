package com.seogineer.demoevents.config;

import com.seogineer.demoevents.OtherDomain.event.SpringEventListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringEventRepositoryTestConfig {
    @Bean
    public SpringEventListener SpringEventListener() {
        return new SpringEventListener();
    }
}
