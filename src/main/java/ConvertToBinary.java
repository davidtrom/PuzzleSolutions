//Convert a number from base10 to Binary.

import java.util.ArrayList;

public class ConvertToBinary {

    public Integer convertToBinary (Integer baseTen){
        Integer half = baseTen;
        ArrayList<Integer> halves = new ArrayList<>();

        while (half >= 1){
            halves.add(half);
            half = half / 2;
        }

        System.out.println(halves.toString());


        return 0;
    }
}
