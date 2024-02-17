package com.tdd.TDDKATA;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void findTheSumOfEmptyString()
    {
    	String numbers = "";
        StringCalculator stringCal = new StringCalculator();
        int  sum = stringCal.add(numbers);
        int expected = 0;
        Assert.assertEquals(expected, sum);
       
    }
    @Test
    public void findTheSumOf1Number()
    {
    	String numbers = "1";
        StringCalculator stringCal = new StringCalculator();
        int  sum = stringCal.add(numbers);
        int expected = 1;
        Assert.assertEquals(expected, sum);
       
    }
}
