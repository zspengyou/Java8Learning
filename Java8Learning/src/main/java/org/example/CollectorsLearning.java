package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsLearning {
    public static void main(String[] args) {
        CollectorsLearning test = new CollectorsLearning();
        test.StringFrequency();
    }

    private void StringFrequency() {
        List<String> words = Arrays.asList("hello", "hello", "mighty");
        Map<String,Long> map = words.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )
        );
        System.out.println("map = " + map);

    }
}
