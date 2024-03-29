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
	
	StringCalculator stringCal = new StringCalculator();
    @Test
    public void findTheSumOfEmptyString()
    {
    	String numbers = "";
        int  sum = stringCal.add(numbers);
        int expected = 0;
        Assert.assertEquals(expected, sum);
       
    }
    @Test
    public void findTheSumOf1Number()
    {
    	String numbers = "1";
        int  sum = stringCal.add(numbers);
        int expected = 1;
        Assert.assertEquals(expected, sum);
       
    }
    
    @Test
    public void findTheSumOf2Number()
    {
    	String numbers = "1,2";
        int  sum = stringCal.add(numbers);
        int expected = 3;
        Assert.assertEquals(expected, sum);
       
    }
    
    @Test
    public void findTheSumOfManyNumber()
    {
    	String numbers = "1,2,3,4,5,8,9";
        int  sum = stringCal.add(numbers);
        int expected = 32;
        Assert.assertEquals(expected, sum);
       
    }
    
    @Test
    public void findTheSumOfManyNumberHAvingNewLine()
    {
    	String numbers = "1,2\n,3,4,5,8,9";
    	
        int  sum = stringCal.add(numbers);
        int expected = 32;
        Assert.assertEquals(expected, sum);
       
    }
    
    @Test(expected = RuntimeException.class)
    public void findTheSumOfManyNumberHAvingNewLineInvalid()
    {
    	String numbers = "1,2,\n,3,4,5,8,9";
    	
        int  sum = stringCal.add(numbers);
        int expected = 32;
        Assert.assertEquals(expected, sum);
       
    }
    
  
    @Test
    public void findTheSumWithDelimiter()
    {
    	String numbers = "1,2,\\1,3,4,5,8,9";
    	
    	
    	
        int  sum = stringCal.add(numbers);
        int expected = 32;
        Assert.assertEquals(expected, sum);
       
    }
    
    @Test(expected = RuntimeException.class)
    public void findNegative()
    {
    	String numbers = "1,2,-1,3,4,5,8,9";
    	
    	
    	
        int  sum = stringCal.add(numbers);
        int expected = 32;
        Assert.assertEquals(expected, sum);
       
    }

}
