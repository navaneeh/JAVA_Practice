package Academy;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithLeastAverage {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>();
        A.add(15);A.add(7);A.add(11);A.add(7);A.add(9);A.add(8);A.add(18);A.add(1);
        A.add(16);A.add(18);A.add(6);A.add(1);A.add(1);A.add(4);A.add(18);

        int b=6;
        System.out.println(solve( A, b));

    }
    public static int solve(ArrayList<Integer> A, int B) {
        int[] ps=prefixSum(A);
        System.out.println(Arrays.toString(ps));
        int n=A.size();

        int least_value=Integer.MAX_VALUE;
        int pos=-1;
        for(int i=0;i<=n-B;i++)
        {   int temp=0;
            if(i==0)
            {
                temp=A.get(i+B-1);
            }
            else if(B==1)
            {
                temp=A.get(i);
            }else
            {
                int start_pos=i-1>=0?i-1-1:0;
                System.out.println("start:"+start_pos+",end:"+(i+B-2));
                temp=(ps[i+B-1-1]-ps[start_pos]/B);
            }

            System.out.println(least_value+"-"+temp+"-i:"+i);
            if(least_value>temp)
            {
                //System.out.println(temp+"-"+i);
                least_value=temp;
                pos=i;
            }
        }
        return pos;
    }

    public static int[] prefixSum(ArrayList<Integer> A)
    {
        int[] arr=new int[A.size()];
        arr[0]=A.get(0);
        for(int i=1;i<A.size();i++)
        {
            arr[i]=arr[i-1]+A.get(i);
        }
        return arr;
    }
}
