package Leetcode;

import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] nums={3,2,2,3,6,3,7,8,9,3,10};
        int val=3;
        int duplicate_count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val || nums[i]==-1)
            {
                if(nums[i]==val)duplicate_count++;

                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[j]!=val && nums[j]!=-1)
                    {
                        nums[i]=nums[j];
                        nums[j]=-1;
                        break;
                    }
                }
            }
        }
        System.out.println(duplicate_count);
        System.out.println(Arrays.toString(nums));
    }
}
