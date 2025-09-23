package easyProblems;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] numbs = {1,2,3};

        boolean has_Duplicate = containsDuplicate(numbs);

        System.out.println("Arrays contains duplicate value : "+has_Duplicate);
    }

    public static boolean containsDuplicate(int[] numbs){

        for(int i=0;i<numbs.length;i++){
            for(int j=i+1; j<numbs.length;j++){
                if(numbs[i]==numbs[j]){
                    return true;
                }
            }
        }

        return false;
    }
}
