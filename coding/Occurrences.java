package org.git.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurrences {
    public static void main(String[] args) {
        String str = "wasimm";

        Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(n -> System.out.println(n));
    }
}
