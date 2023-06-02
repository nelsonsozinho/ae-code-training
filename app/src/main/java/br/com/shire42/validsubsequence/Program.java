package br.com.shire42.validsubsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Program {

    public boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        if(array.isEmpty() || sequence.isEmpty())
            return false;

        for(int i = array.size()-1; i >= 0; i--) {

            if(!sequence.isEmpty() && Objects.equals(sequence.get(sequence.size() - 1), array.get(i))) {
               sequence.remove(sequence.size() - 1 );
            }
        }


        return sequence.isEmpty();
    }

}
