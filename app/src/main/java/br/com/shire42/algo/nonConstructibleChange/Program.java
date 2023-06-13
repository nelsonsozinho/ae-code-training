package br.com.shire42.nonConstructibleChange;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {

    private Sort sort;

    public Program() {
        sort = new Sort();
    }

    public int nonConstructibleChange(int[] coins) {
        int changes = 0;

        if(coins.length == 0)
            return 1;

        sort.sort(coins);
        for(int value : coins) {
            if(value > (changes + 1)) {
                break;
            }
            changes += value;
        }

        return changes + 1;
    }

}
