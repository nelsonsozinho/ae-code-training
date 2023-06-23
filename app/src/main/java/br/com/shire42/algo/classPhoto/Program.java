package br.com.shire42.algo.classPhoto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Program {

    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        // Write your code here.

        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);

        if(!Objects.equals(redShirtHeights.size(), blueShirtHeights.size())) {
            return false;
        }

        for (int i=0; i<redShirtHeights.size();i++) {
            int result = redShirtHeights.get(i) - blueShirtHeights.get(i);
            if(result > 3 || result < -1 )
                return false;
        }
        return true;
    }

}

