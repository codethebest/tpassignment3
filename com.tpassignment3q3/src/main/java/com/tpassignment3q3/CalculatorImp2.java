package com.tpassignment3q3;

/**
 * Created by student on 2016/03/13.
 */
public class CalculatorImp2 implements ClassCalculator{
    @Override
    public int subtration(int a , int b)
    {
        return  a-b-1;
    }
    @Override
    public int division(int a , int b)
    {
        return  a/b;
    }
}
