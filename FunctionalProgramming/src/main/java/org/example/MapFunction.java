package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFunction {

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {2, 3, 4, 5,  6};
        List<Integer> lst = new ArrayList<>(Arrays.asList(arr));
        List<Integer> doubled = lst.stream().map(element -> 2* element).collect(Collectors.toList());
        System.out.println(doubled);
    }
}
