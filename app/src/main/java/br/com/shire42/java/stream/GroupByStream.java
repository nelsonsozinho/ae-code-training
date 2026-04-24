package br.com.shire42.java.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByStream {

    public void findAUniqueNumber() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 5);
        List<Integer> uniqueNumbers = numbers.stream()
                .filter(num -> Collections.frequency(numbers, num) == 1)
                .toList();
        System.out.println("Unique Numbers: " + uniqueNumbers);
    }

    public void findLargesMaximumNUmber() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 50);
        int maxNumber = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new NoSuchElementException("List is empty"));
        System.out.println("Max number: " + maxNumber);
    }

    public void numbersAlongTheirSequence() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        Map<Integer, Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        frequency.forEach( (key, value) -> System.out.println(key + " -> " + value));
    }

    public void findDuplicatedMembers() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
        Set<Integer> duplicates = numbers.stream()
                .filter(num -> Collections.frequency(numbers, num) > 1)
                .collect(Collectors.toSet());
        System.out.println("Duplicated numbers: " + duplicates);
    }

    public void findNumbersOccurringOnce() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> singleOccurrence = numbers.stream()
                        .filter(num -> Collections.frequency(numbers, num) == 1)
                                .toList();
        System.out.println("Numbers Occurring Once: " + singleOccurrence);
    }

    public void findLongestString() {
        String[] strings = {"apple", "banana", "cherry", "watermelon"};
        String longestString = Arrays.stream(strings)
                .max(Comparator.comparingInt(String::length))
                .orElse("No string found");
        System.out.println("Longest String: " + longestString);
    }

    public void printCharacterFrequency() {
        String input = "hello world";
        Map<Character, Long> charFrequency = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        charFrequency.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    

    public static void main(String...args) {
        GroupByStream gbs = new GroupByStream();
        gbs.findAUniqueNumber();
        gbs.findLargesMaximumNUmber();
        gbs.numbersAlongTheirSequence();
        gbs.findDuplicatedMembers();
        gbs.findNumbersOccurringOnce();
        gbs.findLongestString();
        gbs.printCharacterFrequency();
    }

}
