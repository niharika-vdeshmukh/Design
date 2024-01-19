package org.example;

import java.util.function.Function;

public class MyMath {

    public static int triple(int x) {
        return 3*x;
    }

    public static void main(String[] args) {
        //<Integer, Integer> --- Parameter, return type
        Function<Integer, Integer> triple = MyMath::triple;
        int output = triple.apply(5);
        System.out.println(output);
    }
}
