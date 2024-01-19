package org.example;

import java.util.function.BiFunction;

public class FunctionAsArguments {

    protected static class MyMath {
        private int add(int x, int y) {
            return x + y;
        }

        private int subtract(int x, int y) {
            return x - y;
        }

        private int combine2and3(BiFunction<Integer, Integer, Integer> combineFunc) {
            return combineFunc.apply(2, 3);
        }
    }

    public static void main(String[] args)  {
        MyMath myMath = new MyMath();
        int output = myMath.combine2and3(myMath::add);
        System.out.println(output);
        int subtract = myMath.combine2and3(myMath::subtract);
        System.out.println(subtract);
        int answer = myMath.combine2and3((x, y)-> 2*x + 2*y);
        System.out.println(answer);
    }
}
