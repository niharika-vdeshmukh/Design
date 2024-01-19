package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceFunction {

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {2, 3, 4, 5, 6, 7, 8};
        List<Integer> lst = new ArrayList<>(Arrays.asList(arr));
        BinaryOperator<Integer> s = (sum, x) -> {
            return sum + x;
        };
        int ans = lst.stream().reduce(0, s);
        System.out.println(ans);
    }
}
