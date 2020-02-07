//Find the least common multiple of two numbers

import java.util.ArrayList;
import java.util.Iterator;

public class LCM {

    public Integer findLCM (Integer num1, Integer num2){
        if(checkDivisible(num1, num2) != null){
            return checkDivisible(num1, num2);
        }

        Integer lcm = num1 * num2;
        Integer multiple1 = num1;
        Integer multiple2 = num2;
        ArrayList <Integer> num1Multiples = new ArrayList<>();
        ArrayList <Integer> num2Multiples = new ArrayList<>();
        while(multiple1 <= lcm){
            num1Multiples.add(multiple1);
            multiple1 += num1;
        }
        while (multiple2 <= lcm){
            num2Multiples.add(multiple2);
            multiple2 += num2;
        }

        Iterator iterator = num1Multiples.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

            for(int i = 0; i <= num1Multiples.size(); i++){

        }

        return 0;
    }

    public Integer checkDivisible (Integer num1, Integer num2){
        if(num1 > num2 && num1 % num2 == 0){
            return num1;
        }
        else if (num2 > num2 && num2 % num1 == 0){
            return num2;
        }
        else return null;
    }

}
