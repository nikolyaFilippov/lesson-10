package Lesson13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "word1",
                "word2",
                "word3",
                "word4",
                "word5",
                "word1",
                "word2",
                "word3",
                "word4",
                "word5",
                "word1",
                "word2",
                "word3",
                "word4",
                "word5",
                "word1",
                "word2",
                "word3",
                "word5"
        };


        List<String> wordsListWithoutDuplication = Arrays.stream(words)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("unique words list:");
        wordsListWithoutDuplication.forEach(System.out::println);


        System.out.println();
        System.out.println("Words with count:");

        Map<String, Long> collect = Arrays.stream(words)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        collect.forEach((s, aLong) -> {System.out.println(s + " met " + aLong + " times");});


    }
}
