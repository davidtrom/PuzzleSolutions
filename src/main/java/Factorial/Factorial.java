package Factorial;//Find the factorial of a given number

import java.security.cert.CertificateRevokedException;

public class Factorial {

    public Integer findFactorial (Integer num){
        Integer result = 1;
        if (num == 0){
            return 1;
        }

       //Set up a custom exception class for this.
        else if (num < 0){
           throw new NegativeFactorialException();
        }

        else {
            for (int i = 1; i <= num; i++){
                result = result * i;
            }
        }
        return result;
    }
}
