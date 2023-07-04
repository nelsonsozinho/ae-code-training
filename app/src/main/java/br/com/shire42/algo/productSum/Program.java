package br.com.shire42.algo.productSum;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static int productSum(List<Object> array) {
        // Write your code here.
        return walkThrough(array, 1);
    }

    private static int walkThrough(List<Object> arrays, int deepLevel) {
        int result = 0;

        for(int i=0;i<arrays.size();i++) {
            int resultList = 0;
            Object object = arrays.get(i);

            System.out.println(object);

            if(object instanceof List<?> list) {
                deepLevel+=1;
                deepLevel = Math.min(deepLevel, 3);

                int resultWithDeep = deepLevel * walkThrough((List<Object>) list, deepLevel);
                resultList += resultWithDeep;
            } else {
                resultList += Integer.parseInt(object.toString());
            }


            result += resultList;

        }

        return result;
    }

}
