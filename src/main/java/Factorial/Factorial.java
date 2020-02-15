package Factorial;//Find the factorial of a given number

import java.security.cert.CertificateRevokedException;

public class Factorial {

    public Integer findFactorial (Integer num){
        Integer result = 1;
        try {
            if (num == 0) {
                return 1;
            } else {
                for (int i = 1; i <= num; i++) {
                    result = result * i;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        else if (num < 0){
//           throw new NegativeFactorialException();
//        }


        return result;
    }
}
