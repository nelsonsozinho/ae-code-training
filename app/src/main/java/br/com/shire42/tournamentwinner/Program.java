package br.com.shire42.tournamentwinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> points = new HashMap<>();

        for(int i=0; i < competitions.size(); i++) {
            List<String> row = competitions.get(i);

            Integer resultIndicator = results.get(i);


            if(resultIndicator > 0) {
                if(points.containsKey(row.get(0))) {
                    points.put(row.get(0), points.get(row.get(0)) + 3);
                } else {
                    points.put(row.get(0) , 3);
                }
            } else {
                if(points.containsKey(row.get(1))) {
                    points.put(row.get(1), points.get(row.get(1)) + 3);
                } else {
                    points.put(row.get(1) , 3);
                }
            }
        }

        return Collections.max(points.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

}
