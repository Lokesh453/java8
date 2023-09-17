package com.practice.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ListToMapUsingFunction {

    public static void main(String[] args) {
        ListToMapUsingFunction func1 = new ListToMapUsingFunction();
        List<String> list = Arrays.asList("Hanuman", "Rama", "Krishna", "balaji");
        Function<String,Integer> function1 = str -> str.length();
        Function<String,Integer> function2 = function1.andThen(x->x*x);
        Map<String, Integer> result = func1.convertListoMap(list, function2);

        result.entrySet().forEach((x) ->
        {
            System.out.println("Key is ::" + x.getKey() + "        " + "value ::" + x.getValue());
        });

    }

    public <T, R> Map<T, R> convertListoMap(List<T> list, Function<T, R> function) {
        Map<T,R> resultMap = new HashMap<>();
        for (T t : list)
        {
            resultMap.put(t,function.apply(t));
        }
        return resultMap;
    }
}
