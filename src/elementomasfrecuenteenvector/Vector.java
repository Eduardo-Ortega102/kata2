
package elementomasfrecuenteenvector;

import java.util.HashMap;

public class Vector {

    public int MostFrecuentElement(int[] vector) {

        HashMap<Integer, Integer> elements = null;
        int numberSearched;
        
        for (int index = 0; index < vector.length; index++) {
            numberSearched = vector[index];
            for (int number : vector) {
                if (number == numberSearched) {
                    if (elements.containsKey(number) == true) {
                        elements.put(number, (elements.get(number))+ 1);
                    } else {
                        elements.put(number, 1); //---
                    }
                }
            }
        }
        
        
        return 0;


    }
}
