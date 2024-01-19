package org.example;
import java.util.function.BiFunction;
public class BiFunc {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        int output = add.apply(3 , 5);
        System.out.println(output);

        TriFunction<Integer, Integer, Integer, Integer> addTriple = (x, y, z) -> x + y + z;
        int triple = addTriple.apply(3, 4, 5);
        System.out.println(triple);

        NoArgFunction<String> sayHello = () -> "Hello World";
        System.out.println(sayHello.apply());
    }
}
