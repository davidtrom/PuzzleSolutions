//This is a demo task.
//
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [−1,000,000..1,000,000].


import java.util.ArrayList;
import java.util.Arrays;

public class SmallestPositiveInt {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int result=0;
        ArrayList<Integer> allNums = new ArrayList<>();
        Arrays.sort(A);
        for(int a : A){
            System.out.println(a);
            if(a >= 0){
                allNums.add(a);
            }
        }
        System.out.println(allNums);
        if (allNums.size() == 0){
            result = 1;
            return result;
        }
        else {
            for(int i = 0; i < allNums.size()-1; i++){
                if((allNums.get(i+1) - allNums.get(i) > 1) || allNums.get(allNums.size()-1) - allNums.get(allNums.size()-2) > 1){
                    result = allNums.get(i) + 1;
                }
                else{
                    result = allNums.get(allNums.size()-1) + 1;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
