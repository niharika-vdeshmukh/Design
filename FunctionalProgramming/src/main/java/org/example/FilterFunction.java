package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterFunction {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {2, 3 ,4, 5, 6, 7};
        List<Integer> lst = new ArrayList<>(Arrays.asList(arr));
        List<Integer> evens = lst.stream().filter(element -> element%2 == 0).collect(Collectors.toList());
        System.out.println(evens);

        String[] words = new String[] {"Niharika", "Viswa", "Harshith", "Shraddha", "Anuja", "Sashi"};
        List<String> wordList = Arrays.stream(words).toList();
        List<String> longWords = wordList.stream().filter((x) -> x.length() > 6).collect(Collectors.toList());
        System.out.println(longWords);
    }
}
