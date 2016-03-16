package com.tpassignment3q3;

import com.tpassignment3q3.AppConfig;
import com.tpassignment3q3.CalculatorImp;
import com.tpassignment3q3.ClassCalculator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by student on 2016/03/14.
 */
public class TestClass {

   private ClassCalculator cal ;


    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cal = (ClassCalculator)ctx.getBean("cal");
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
