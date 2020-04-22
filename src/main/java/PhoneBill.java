import java.util.*;

public class PhoneBill {
    public int solution(String S) {
        // write your code in Java SE 8
        // write your code in Java SE 8
        Map<String, String> occurences = new HashMap<>();

        String [] billDetailsByLine = S.split("\n");

        for (String detail : billDetailsByLine) {
            System.out.println(detail);
        }
        ArrayList <String[]> indiviudalList = new ArrayList<>();
        String [] individualDetails = new String[billDetailsByLine.length * 2];
        for (int i = 0; i < billDetailsByLine.length; i++) {
            String [] splitInfo = billDetailsByLine[i].split(",");
            indiviudalList.add(splitInfo);
        }
        List<String> detailsList = new ArrayList<String>(Arrays.asList(billDetailsByLine));

        for (String[] detail : indiviudalList) {
            System.out.println(detail[0]);
            System.out.println(detail[1]);
        }


        for (int i = 0; i < indiviudalList.size(); i++) {
            String[] duration = detailsList.get(i).split(":");
            System.out.println(duration.toString());
            Integer durationInSecs = (Integer.valueOf(duration[0]) * 3600) + (Integer.valueOf(duration[1]) * 60) + Integer.valueOf(duration[2]);
            detailsList.set(i, String.valueOf(durationInSecs));
        }

         for(String detail: detailsList){
             System.out.println(detail);
         }

        // for (int i = 0; i < billDetails.length; i++) {
        //     if(i % 2 != 0){
        //         if(!occurences.containsKey(billDetails[i])){
        //             occurences.put(billDetails[i], billDetails[i-1]);
        //         }
        //     }

        //      System.out.println(occurences.entrySet());

        // }


        // for(String detail: detailsList){

        // }

        // System.out.println(detail);
        return -1;
    }
}

