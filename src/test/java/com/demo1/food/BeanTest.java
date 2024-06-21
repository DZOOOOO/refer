package com.demo1.food;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeanTest {

    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    void test1() {
        food.eat();
    }

}