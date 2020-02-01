//    Given a list of user names KEEPING THEM IN ORDER, each username needs to be unique.  For example if you have
//    {bob, samantha, bob, robert, sarah, sarah, bob} the names will become
//    {bob, samantha, bob1, robert, sarah, sarah1, bob2} so that each is unique.

import java.util.ArrayList;

public class UniqueNames {

    //String [] userNames;
    public String [] uniqueUserNames (String [] userNames) {
       //userNames = new String[] {"bob", "samantha", "bob", "robert", "sarah", "sarah", "bob"};
        //ArrayList<String> userNamesList =
        ArrayList<String> uniqueNamesList = new ArrayList<>(0);
//        for(String name : userNames){
//            if(!uniqueNamesList.contains(name)){
//                uniqueNamesList.add(name);
//            }
//            else if (uniqueNamesList.contains(name)){
//                uniqueNamesList.contains()
//            }
//        }
        for (int i = 0; i < userNames.length; i++){
            int counter = 1;
            for (int j = i+1; j < userNames.length; j++){

                if(userNames[i].equals(userNames[j])){
                    userNames[j] = userNames[j] + String.valueOf(counter);
                    counter++;
                }

            }
        }
        for (int i = 0; i < userNames.length; i++) {
            System.out.println("unqiueNamesList: " + userNames[i]);
        }
        return userNames;
    }


}

//    String lastLetter = userNames[i].substring(userNames.length-1);
//                System.out.println(lastLetter);
//                        if(lastLetter != "1" || lastLetter !=  "2" || lastLetter !=  "3" || lastLetter !=  "4" || lastLetter != "5" || lastLetter != "6" || lastLetter != "7" || lastLetter != "8" || lastLetter != "9"){
//                        //System.out.println("inside loop check");
//                        uniqueNamesList.add(userNames[j]);
//                        }