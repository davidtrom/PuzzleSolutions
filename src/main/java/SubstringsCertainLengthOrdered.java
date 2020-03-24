// Complete the function
// 'smallest' must be the lexicographically smallest substring of length 'k'
// 'largest' must be the lexicographically largest substring of length 'k'

import java.util.ArrayList;
import java.util.Collections;

public class SubstringsCertainLengthOrdered {

    public String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> substrings = new ArrayList<>();

        //String [] letters = s.split("");
        for(int i = 0; i < s.length() -k + 1; i++){
            substrings.add(s.substring(i, (i+k)));
        }
        Collections.sort(substrings);
        smallest = substrings.get(0);
        largest = substrings.get(substrings.size()-1);
        System.out.println(substrings + " " + smallest + " " + largest  );
        return smallest + "\n" + largest;
    }

    public static String getSmallAndLargeIf(String s, int k) {
        String smallest = "";
        String largest = "";
        String test="";

        for(int i = 0; i < s.length() -k + 1; i++){
            //System.out.println(s.substring(i, (i+k)));
            if(i==0){
                smallest=s.substring(i, (i+k));
            }
            test=s.substring(i, (i+k));
            if(test.compareTo(smallest)<0){
                smallest=test;
            }
            if (s.substring(i, (i+k)).compareTo(largest)>0){
                largest=s.substring(i, (i+k));
            }
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
}
