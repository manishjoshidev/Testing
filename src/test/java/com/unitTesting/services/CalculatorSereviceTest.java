package com.unitTesting.services;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import services.CalculatorService;

import java.util.Date;


public class CalculatorSereviceTest
{
    @BeforeClass     //this will execute before test cases
    public static void init()
    {
        System.out.println("This will execute before test cases");
        System.out.println("start test:" +new Date());
    }
    //test method of addTwoNumbers
    @Test
    public void addTwoNumbersTest(){
       int result= CalculatorService.addTwoNumbers(50,89);

   // if (actual result == expected result ,logic is correct)
      int expected=139;
        Assert.assertEquals(expected,result);

    }
    @Test
    public void sumAnyNumbersTest(){
        int result=CalculatorService.sumAnyNumbers(2,4,8,2,8,5,1,4,8);
     int expectedResult=42;
     Assert.assertEquals(expectedResult,result);
    }
    @AfterClass
   public static void cleanup()
   {
       System.out.println("this will close all open connections");
   }
}
