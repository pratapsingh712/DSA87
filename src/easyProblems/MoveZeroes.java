package easyProblems;

import java.io.OptionalDataException;
import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12,0,0,2,4};

        int pointerZero = 0;
        int nonZero=0;

        while(nonZero<nums.length){
            if(nums[pointerZero]==0 && nums[nonZero]!=0){
                int temp = nums[pointerZero];
                nums[pointerZero] = nums[nonZero];
                nums[nonZero] = temp;
                pointerZero++;
            }
            nonZero++;
        }

        System.out.println(Arrays.toString(nums));

    }
}
