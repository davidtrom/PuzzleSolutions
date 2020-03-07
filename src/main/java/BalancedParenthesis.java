
/*
    Determine whether the number of parenthesis is balanced or not:

    Example: ()()(()) is balanced since any that is opened is also closed
             ()( is not balanced since it leaves one opened
             (()))() is not balanced
             )( not balanced because they don't close
             return 1 if they are balanced, return 0 if they are not
 */

public class BalancedParenthesis {

    private String leftParen = "(";
    //private String rightThesis = ")";

    public Integer checkIfBalanced (String checkString){
        Integer parenCount = 0;
        Integer thesisCount = 0;
        Integer result;
        String[] checkStringArray = checkString.split("");

        for (int i = 0; i < checkStringArray.length; i++) {
            System.out.println("i = " + i);
            if (checkStringArray[i].equals(leftParen)) {
                parenCount++;
                System.out.println("Paren Count: " + parenCount);
            }
            else {
                thesisCount++;
                System.out.println("Thesis count: "+ thesisCount);
            }
           if (thesisCount > parenCount) {
               System.out.println("Thesis > Paren");
               result = 0;
               return result;
         }
        }

        if(parenCount > thesisCount) {
            result = 0;
        }
        else {
            result = 1;
        }
        return result;
    }

}
