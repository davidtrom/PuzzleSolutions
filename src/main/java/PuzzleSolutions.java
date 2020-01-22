import java.util.*;

public class PuzzleSolutions {

    //Solves the puzzle how many holes does a certain string of numbers have

    public Integer findHoleTotal(String numbers) {
        Map<String, Integer> mapToUse = holesInNumbersMap();
        String[] numbersSplit = numbers.split("");
        List<Integer> numberOfHoles = new ArrayList<>();
        Set<String> mySet = new HashSet<>();
        mySet=mapToUse.keySet();
        ArrayList<String> keySetArrayList= new ArrayList<>(mySet);
        System.out.println("map to use: " + mapToUse.entrySet());
        System.out.println("keyset: " + keySetArrayList.toString());


        for (int i = 0; i < numbersSplit.length; i++) {
            for (int j = 0; j < keySetArrayList.size(); j++) {
                if (numbersSplit[i].equals(keySetArrayList.get(j))) {
                    numberOfHoles.add(mapToUse.get(keySetArrayList.get(j)));
                }
            }
        }

        Integer totalHoles = 0;
        for (int i = 0; i < numberOfHoles.size(); i++) {
            totalHoles += numberOfHoles.get(i);
        }
        System.out.println("totalHoles: " + totalHoles);
        return totalHoles;
    }

    public Map<String, Integer> holesInNumbersMap (){
        Map <String, Integer> holesMap = new HashMap<>();
        holesMap.put("0", 1);
        holesMap.put("1", 0);
        holesMap.put("2", 0);
        holesMap.put("3", 0);
        holesMap.put("4", 1);
        holesMap.put("5", 0);
        holesMap.put("6", 1);
        holesMap.put("7", 0);
        holesMap.put("8", 2);
        holesMap.put("9", 1);
        return holesMap;
    }
}
