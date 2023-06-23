package br.com.shire42.algo.minimumWaitingTime;

import java.util.Arrays;

public class Program {


    public int solution(int[] queries) {
        Arrays.sort(queries);

        int first = 0, second = 0;


        for(int i=1;i<queries.length;i++) {
            first += queries[i-1];
            second += first;
        }

        return second;
    }

}
