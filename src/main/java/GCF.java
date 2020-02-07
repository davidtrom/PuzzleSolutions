//Find the GCF of two numbers

public class GCF {

    public Integer findGCF (Integer num1, Integer num2){
        if(checkDivisible(num1, num2) != null){
            return checkDivisible(num1, num2);
        }

        return 0;
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
}
