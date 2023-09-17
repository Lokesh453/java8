package com.practice.java;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        FunctionExample example = new FunctionExample();
        Function<String , Integer> myFunction = x-> x.length();
        Integer apply = myFunction.apply("Lokesh");
        System.out.println(apply);
        System.out.println(example.findStringLength("Hanuman"));
    }


    public Integer findStringLength(String name)
    {

        Function<String,Integer> function2 =  x-> x.length();
        return function2.apply(name);
    }


}
