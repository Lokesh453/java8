package com.practice.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    //main
    public static void main(String[] args) {
        // square the each number in list using UnaryOperator
        List<Integer> intList = Arrays.asList(1, 2, 4, 5, 4, 5, 6, 7, 8, 10);
        UnaryOperatorExample unExample = new UnaryOperatorExample();
        List<Integer> result = unExample.squareListElement(intList, x -> x * x);
        result.stream().forEach(System.out::println);
    }

    public <T> List<T> squareListElement(List<T> list, UnaryOperator<T> unaryOperator) {
        List<T> squaredItemList = new ArrayList<>();
        for (T t : list) {
            squaredItemList.add((T) unaryOperator.apply(t));
        }
        return squaredItemList;
    }

}
