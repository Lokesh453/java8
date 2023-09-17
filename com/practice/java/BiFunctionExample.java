package com.practice.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunctionExample example = new BiFunctionExample();
        //combine FN and LN and find the length
        BiFunction<String, String, Integer> biFunction = (fN, lN) -> (fN + lN).length();
        Map<String, String> nameInfoMap = new HashMap<>();
        nameInfoMap.put("Lokesh", "Reddy");
        nameInfoMap.put("Kiran", "Th");
        Map<String, Integer> result = example.findFullNameLength(nameInfoMap, biFunction);
        result.entrySet().forEach((x) ->
        {
            System.out.println("Key is ::" + x.getKey() + "        " + "value ::" + x.getValue());
        });

    }


    public <T, U, R> Map<T, R> findFullNameLength(Map<T, U> nameMap, BiFunction<T, U, R> biFunction) {
        Map<T, R> finalMap = new HashMap<>();
        for (Map.Entry<T, U> map : nameMap.entrySet()) {
            finalMap.put((T) map.getKey().toString().concat(map.getValue().toString()), biFunction.apply(map.getKey(), map.getValue()));
        }
        return finalMap;
    }
}
