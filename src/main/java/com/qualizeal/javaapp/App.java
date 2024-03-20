package com.qualizeal.javaapp;

/**
 * Hello world!
 *
 */
import com.qualizeal.javaapp.mathematics.Addition;
import com.qualizeal.javaapp.mathematics.Subtraction;
import com.qualizeal.javaapp.mathematics.Multiplication;
import com.qualizeal.javaapp.mathematics.Division;

public class App 
{
    public static void main( String[] args )
    {
        Addition addition = new Addition();
        int result = addition.add();
        System.out.println("sum :" + result);

        Subtraction subtraction = new Subtraction();
        int result1 = subtraction.sub();
        System.out.println("difference :" + result);
        
        Multiplication multiplication = new Multiplication();
        int result2 = multiplication.multiply();
        System.out.println("product :" + result);

        Division division = new Division();
        int result3 = division.div();
        System.out.println("reminder:" + result);

        
    }
      
}
