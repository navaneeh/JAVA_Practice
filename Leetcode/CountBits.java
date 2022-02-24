package Leetcode;

public class CountBits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(1011));
    }
    public static int hammingWeight(int n) {
        int count=0;
        while(n>0)
        {
            if(n%10==1)
            {
                count++;
            }
            n/=10;
        }
        return count;
    }
}
