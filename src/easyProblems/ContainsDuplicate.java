package easyProblems;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] numbs = {1,2,3,1};

//        boolean has_Duplicate = containsDuplicate(numbs);

        boolean has_Duplicate = containsDuplicate(numbs);

        System.out.println("Arrays contains duplicate value : "+has_Duplicate);
    }

    private static boolean containsDuplicate(int[] numbs) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<numbs.length;i++){
            if(!map.containsKey(numbs[i])){
                map.put(numbs[i],1);
            }else{
                map.put(numbs[i],map.get(numbs[i])+1);
                return true;
            }
        }

        return false;
    }

//    public static boolean containsDuplicate(int[] numbs){
//
//        for(int i=0;i<numbs.length;i++){
//            for(int j=i+1; j<numbs.length;j++){
//                if(numbs[i]==numbs[j]){
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }
}
