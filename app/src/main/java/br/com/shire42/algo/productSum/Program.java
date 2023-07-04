package br.com.shire42.algo.productSum;

import java.util.List;

public class Program {

    public static int productSum(List<Object> array) {
        // Write your code here.
        int result = 0;
        for(Object element: array) {
            result += walkThrough(element, 1);
        }
        return result;
    }

    private static int walkThrough(Object element, int deepLevel) {
        int tmpResult = 0;

        if(element instanceof Integer) {
            tmpResult += Integer.parseInt(element.toString());
        } else {
            List<Object> elements = (List<Object>) element;
            for(Object innerElement: elements) {
                tmpResult += walkThrough(innerElement, deepLevel+1);
            }
        }

        return tmpResult * deepLevel;
    }

}
