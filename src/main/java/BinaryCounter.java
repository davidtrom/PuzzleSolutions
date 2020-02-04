//Count the  number of 1's in a binary number

import java.util.ArrayList;

public class BinaryCounter {

    public Integer binaryOnesCounter (Integer numToCheck) {
        ArrayList<Integer> halves = new ArrayList<>();
        Integer result =0;
        Integer dividedAnswer = numToCheck;
        while (dividedAnswer >= 1) {
            halves.add(dividedAnswer);
            dividedAnswer=dividedAnswer / 2;
        }
        for(int i = 0; i < halves.size(); i++) {
            System.out.println(halves.get(i));
        }
        return result;
    }
}
