package com.tpassignment3q3;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/13.
 */
public class TestClass2 {

    private ClassCalculator ncal ;


    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ncal = (ClassCalculator)ctx.getBean("newcal");
    }

    @Test
    public void testsub()
    {
        int result = calculator1.subtration(10,5);
        org.junit.Assert.assertEquals(result,5);
    }

    @Test
    public void testdiv()throws Exception
    {
        int result = calculator1.division(10,5);
        org.junit.Assert.assertEquals(result,2);
    }
}
