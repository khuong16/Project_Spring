package com.java.spring_donations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringDonationsApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testFindAll(){

    }

}
