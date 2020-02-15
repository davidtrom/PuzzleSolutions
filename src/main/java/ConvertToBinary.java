//Convert a number from base10 to Binary.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ConvertToBinary {

    public Integer convertToBinary (Integer baseTen){
        Integer half = baseTen;
        ArrayList<Integer> halves = new ArrayList<>();
        String result = "";
        //ArrayList<Integer> result = new ArrayList<>();

        while (half >= 1){
            halves.add(half);
            half = half / 2;
        }
        System.out.println(halves.toString());
        Collections.reverse(halves);
        System.out.println(halves.toString());

        for (int i = 0; i < halves.size(); i++) {
            if(halves.get(i) %2 == 0){
                halves.set(i, 0);
            }
            else if (halves.get(i) % 2 != 0){
                halves.set(i, 1);
            }
        }
        System.out.println(halves.toString());
        for (int i = 0; i < halves.size(); i++) {
             result += halves.get(i);
        }
        return Integer.valueOf(result);
    }
}
