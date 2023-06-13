package br.com.shire42.foobar.getRepeatedNumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ArrayNumbers {

    public int repeatedNumber(int[] array) {
        return findRepeatedNumber(array);
    }

    private int findRepeatedNumber(int[] array) {
        Map<Integer, Integer> ammount = new HashMap<>();

        for(int i=0; i < array.length; i++) {
            if(Objects.nonNull(ammount.get(array[i]))) {
                int value = ammount.get(array[i]) + 1;
                ammount.put(array[i], ammount.get(array[i]) + 1 );
            } else {
                ammount.put(array[i], 1);
            }
        }

        ammount.entrySet().stream()
                .filter(a -> a.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList().forEach(
                        ammount.keySet()::remove);


        Optional<Integer> result =  ammount.keySet().stream().filter(value -> value > 1).findFirst();

        return result.orElse(-1);
    }

}
