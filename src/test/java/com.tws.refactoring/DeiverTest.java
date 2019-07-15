package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/15
 * @Time:14:44
 * @description:
 */
class DeiverTest {


    private static Driver driver;

    @BeforeEach
    void setUp() {
        driver = new Driver();
    }

    @Test
    void should_return_true_when_call_checkDriver_given_18() {

        driver.setAge(18);
        Boolean result1 = driver.isLegalDriver();
        Assertions.assertSame(true,result1);

    }

    @Test
    void should_return_false_when_call_checkDriver_given_12() {

        driver.setAge(12);
        Boolean result1 = driver.isLegalDriver();
        Assertions.assertSame(false,result1);

    }


    @Test
    void should_return_true_when_call_checkDriver_given_30() {

        driver.setAge(30);
        Boolean result1 = driver.isLegalDriver();
        Assertions.assertSame(true,result1);

    }
}