package Lesson13;

import java.util.*;
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
        System.out.println("\n");
        TelephoneDirectory directory6 = new TelephoneDirectory("Петров",297544333);
        Data.objectList.add(directory6);
        TelephoneDirectory.get("Петров");

        List<TelephoneDirectory> objectList = Data.getObjectList();
        List<TelephoneDirectory> objectList1 = objectList.stream().filter(o ->o.getSurname()== o.temp)
                .collect(Collectors.toList());

        for (int i =0; i<objectList1.size(); i++){
            System.out.println(objectList1.get(i));
        }










    }

}
