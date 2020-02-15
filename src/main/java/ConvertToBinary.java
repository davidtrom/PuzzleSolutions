//Convert a number from base10 to Binary.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ConvertToBinary {

    public Long convertToBinary (Long baseTen){
        Long half = baseTen;
        ArrayList<Long> halves = new ArrayList<>();
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
                halves.set(i, 0L);
            }
            else if (halves.get(i) % 2 != 0){
                halves.set(i, 1L);
            }
        }
        System.out.println(halves.toString());
        for (int i = 0; i < halves.size(); i++) {
             result += halves.get(i);
        }
        return Long.valueOf(result);
    }
}
