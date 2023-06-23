package br.com.shire42.algo.tandemBicycle;

import java.util.Arrays;

public class Program {

    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        // Write your code here.
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        int result = 0;
        int size = redShirtSpeeds.length;

        if(fastest) {
            for (int i = 0; i < size; i++) {
                int redValue = blueShirtSpeeds[i];
                int blueValue = redShirtSpeeds[(size - 1)  - i];
                result += Math.max(redValue,  blueValue);
            }
        } else {
            for (int i = 0; i < size; i++) {
                int redValue = blueShirtSpeeds[i];
                int blueValue = redShirtSpeeds[i];
                result += Math.max(redValue,  blueValue);
            }
        }

        return result;
    }

}
