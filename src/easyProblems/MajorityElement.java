package easyProblems;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        /*
        I need to get the element that is appearing more tha half the length of array
         */
        int[] numbs = {2,2,1,1,1,1,1,1,2,2,2,2,1,2,2};

        int appearedMoreThanNByTwo = numbs.length/2;

        Arrays.sort(numbs);

        System.out.println("The number that appeared more than half of the length of array is :"+numbs[appearedMoreThanNByTwo]);

//        HashMap<Integer,Integer> counter = new HashMap<>();
//
//        for(int i=0;i<numbs.length;i++){
//            if(counter.containsKey(numbs[i])) {
//                counter.put(numbs[i], counter.get(numbs[i])+1);
//            }else{
//                counter.put(numbs[i],1);
//            }
//        }
//
//        for(Map.Entry<Integer,Integer> set : counter.entrySet()){
//            int num = set.getValue();
//            if(num>appearedMoreThanNByTwo){
//                System.out.println("Number that appeared more than half the length of array is : "+set.getKey());
//                break;
//            }
//        }
    }
}
