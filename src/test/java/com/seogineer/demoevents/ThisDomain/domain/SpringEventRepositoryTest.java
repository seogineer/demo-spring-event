package com.seogineer.demoevents.ThisDomain.domain;

import com.seogineer.demoevents.config.SpringEventRepositoryTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(SpringEventRepositoryTestConfig.class)
public class SpringEventRepositoryTest {
    @Autowired
    SpringEventRepository repository;

    @Test
    void crud() {
        SpringEvent event = new SpringEvent();
        repository.save(event.sendMessage());

        repository.findAll();

        repository.delete(event);

        repository.flush();
    }
}
