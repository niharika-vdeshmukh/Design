package org.example;

public class ReturningFunction {

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> greetCreator = () -> () -> "Hello World";
        NoArgFunction<String> greetor = greetCreator.apply();
        System.out.println(greetor.apply());
    }
}
