package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
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
class PoliceTest {

    private static Police police;
    private Driver driver;


    @BeforeAll
    public static void setUp(){
        police = new Police();
    }


    @Test
    void should_return_true_when_call_checkDriver_given_18() {

        driver = new Driver(18);
        Boolean result1 = police.checkDriver(driver);
        Assertions.assertSame(true,result1);

    }

    @Test
    void should_return_false_when_call_checkDriver_given_12() {

        driver = new Driver(12);
        Boolean result1 = police.checkDriver(driver);
        Assertions.assertSame(false,result1);

    }


    @Test
    void should_return_true_when_call_checkDriver_given_30() {

        driver = new Driver(30);
        Boolean result1 = police.checkDriver(driver);
        Assertions.assertSame(true,result1);

    }
}