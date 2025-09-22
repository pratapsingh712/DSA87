package easyProblems;

import java.io.OptionalDataException;
import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12,0,0,2,4};

        int pointerZero = 0;
        int i=0;

        while(i<nums.length){
            if(nums[pointerZero]==0 && nums[i]!=0){
                int temp = nums[pointerZero];
                nums[pointerZero] = nums[i];
                nums[i] = temp;
                pointerZero++;
            }
            i++;
        }

        System.out.println(Arrays.toString(nums));

    }
}
