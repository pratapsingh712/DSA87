package easyProblems;

import java.io.CharArrayReader;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        if(sortString(s).equals(sortString(t))){
            System.out.println("They are Anagram of each other :"+true);
        }else{
            System.out.println("They are Anagram of each other :"+false);
        }
    }

    private static String sortString(String s) {

        char[] charArray = s.toCharArray();

//        for(int i=0;i<charArray.length;i++){
//            for(int j=i+1;j<charArray.length;j++){
//                if(charArray[i]>charArray[j]){
//                    char temp = charArray[i];
//                    charArray[i] = charArray[j];
//                    charArray[j] =  temp;
//                }
//            }
//        }

        Arrays.sort(charArray);

        return new String(charArray);
    }
}
