// Text Wrap Problem
//
//Write a program that takes an input string and prints it as multiple lines of text such that no line of text is greater than 13 characters and words are kept whole.


public class WordsSeparateLines {

    public String returnLines (String line){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            for(int j = 0; j<13; j++){
                if(line.charAt(j) == ' '){
                    String fullWords = line.substring(i, j);
                    result.append(fullWords);
                }
                else {
                    int space = line.lastIndexOf(" ", i);
                    result.append(line.charAt(i));
                }

            int lineCounter = 1;
            )
            Integer totalLength = null;
            Integer wordLength = 0;
            wordLength = lineSplit[i].length();
            totalLength = totalLength + wordLength;
            if(totalLength >= 13)
            result;
            
            

        }
    }
}
