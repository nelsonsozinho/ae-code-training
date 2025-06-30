package br.com.shire42.stream;

import java.util.List;
import java.util.stream.IntStream;

public class SimpleStream {

    private List<String> strs = List.of("Alone", "Bob", "Carl", "Francis");

    public void listIteration() {
        strs.forEach(System.out::println);
    }

    public void printReverse() {
        IntStream.range(0, strs.size())
                .mapToObj(i -> strs.get(strs.size() - 1 - i))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        SimpleStream stream = new SimpleStream();
        stream.listIteration();
        stream.printReverse();
    }

}
