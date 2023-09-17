package com.practice.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample1 {

    public static void main(String[] args) {
        BinaryOperatorExample1  binaryOperatorEx = new BinaryOperatorExample1();
        Integer[] integers = {1,2,3,4,5,6,7,8,11,10,9};
        Integer result =
                binaryOperatorEx.findSumoftheDetails(Arrays.asList(integers),0,(a,b)->a+b);
        Integer result2 =
                binaryOperatorEx.findSumoftheDetails(Arrays.asList(integers),0,Integer::sum);
        System.out.println("Sum of the integers is ::"+result);
        System.out.println("Sum of the integers is ::"+result2);
    }

    public <T>T findSumoftheDetails(List<T> list , T init, BinaryOperator<T> binaryOperator)
    {
        T result = init;
        for(T t : list)
        {
            result = binaryOperator.apply(result,t);
        }

        return  result;
    }
}
