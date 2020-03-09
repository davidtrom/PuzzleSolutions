/* Check to see if two words are anagrams.  If they are they will
contain the same number of the same letters
Ex) cat and act are anagrams
beware and ewbaaer are not
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagrams {

    public Boolean anagramCheck(String a, String b) {
        a.toLowerCase();
        b.toLowerCase();
        String[] lettersA = a.split("");
        List<String> listA = new ArrayList<String>(Arrays.asList(lettersA));
        String [] lettersB = b.split("");
        List<String> listB = new ArrayList<String>(Arrays.asList(lettersB));
        Map<String, Long> Acounts =
                listA.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        Map<String, Long> Bcounts =
                listB.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        if(Acounts.equals(Bcounts)){
            return true;
        }
        else return false;
    }

}
