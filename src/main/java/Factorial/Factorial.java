package Factorial;//Find the factorial of a given number

public class Factorial {

    public Integer findFactorial (Integer num){
        Integer result = 1;
        if (num == 0){
            return 1;
        }

       //Set up a custom exception class for this.
        else if (num < 0){
            System.out.println("ERROR: The factorial of a negative number is undefined");
        }

        else {
            for (int i = 1; i <= num; i++){
                result = result * i;
            }
        }

        return result;
    }
}
