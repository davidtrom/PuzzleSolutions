//Find the GCF of two numbers

import java.util.ArrayList;
import java.util.Collections;

public class GCF {

    public Integer findGCF (Integer num1, Integer num2){
        ArrayList <Integer> num1Factors;
        ArrayList <Integer> num2Factors;

        if(checkDivisible(num1, num2) != null){
            return checkDivisible(num1, num2);
        }
        num1Factors = num1Factors(num1);
        num2Factors = num2Factors(num2);
        System.out.println(num1Factors.toString());
        System.out.println(num2Factors.toString());
        num1Factors.retainAll(num2Factors);
        Collections.sort(num1Factors);
        System.out.println(num1Factors.toString());

        return num1Factors.get(num1Factors.size()-1);
    }

    public Integer checkDivisible (Integer num1, Integer num2){
        if(num1 > num2 && num1 % num2 == 0){
            return num2;
        }
        else if (num2 > num1 && num2 % num1 == 0){
            return num1;
        }
        else return null;
    }

    public ArrayList<Integer> num1Factors(Integer num1){
        ArrayList <Integer> num1Factors = new ArrayList<>();
        for (int i = 1; i <= num1; i++){
            if (num1 % i ==0 && !num1Factors.contains(i)){
                num1Factors.add(i);
                num1Factors.add(num1 / i);
            }
        }
        return num1Factors;
    }

    public ArrayList<Integer> num2Factors(Integer num2){
        ArrayList <Integer> num2Factors = new ArrayList<>();
        for (int i = 1; i <= num2; i++){
            if (num2 % i ==0 && !num2Factors.contains(i)){
                num2Factors.add(i);
                num2Factors.add(num2 / i);
            }
        }
        return num2Factors;
    }
}
