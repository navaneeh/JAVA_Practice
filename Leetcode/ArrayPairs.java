package Leetcode;

public class ArrayPairs
{
    public static void main(String[] args) {
        int[] nums={1,4,3,2};
                int maxval=0;

                for(int i=0;i<nums.length-1;i++)
                {
                   // System.out.println("i-"+i);
                    int sum=0;
                    for(int j=i+1;j<nums.length;j++)
                    {
                        sum=+Math.min(nums[i],nums[j]);
                        System.out.println(sum);
                    }
                    break;
                    //System.out.println(sum);
                   // if(maxval<sum)maxval=sum;
                }

        System.out.println(maxval);

        }
    }

