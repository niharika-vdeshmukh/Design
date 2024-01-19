package org.example;

import java.util.function.Function;

public class LambdaExpression {

    public static void main(String[] args) {
        Function<Integer, Integer> absoluteValue = (a) -> {
            if(a < 0)
                return -a;
            else
                return a;
        };
        int output = absoluteValue.apply(-199);
        System.out.println(output);

        Function<String, Integer> stringLength = (a) -> {
            return a.length();
        };
        int l = stringLength.apply("Niharika Deshmukh");
        System.out.println(l);
    }
}
