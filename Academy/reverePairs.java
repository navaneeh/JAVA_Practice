package Academy;

import java.util.ArrayList;
import java.util.Arrays;

public class reverePairs {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(2000000000, 2000000000, -2000000000));
        int n= mergesort(arr,0,arr.size()-1);
        System.out.println(n);
    }

    public static int mergesort(ArrayList<Integer> A,int start,int end)
    {
        if(start==end)return 0;

        int mid=(start+end)/2;

        int l=mergesort(A,start,mid);
        int r=mergesort(A,mid+1,end);
        return ((l%1000000007)+(r%1000000007)+(mergeTwoArray(A,start,mid,end)%1000000007))%1000000007;
    }

    public static int mergeTwoArray(ArrayList<Integer> A,int start,int mid,int end)
    {
        int[] C=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;

        int i2=start;
        int j2=mid+1;

        int count=0;
        while(i2<=mid && j2<=end)
        {
            long val_j=(long)A.get(j2)+A.get(j2);
            long val_i=A.get(i);
            if(val_i>val_j)
            {
                System.out.println(val_j+":"+val_i);
                j2++;
                count=count+(mid-i2+1);
            }else{
                i2++;
            }
        }

        while(i<=mid && j<=end)
        {
            if(A.get(i)>A.get(j))
            {
                C[k]=A.get(j);
                j++;
            }else{
                C[k]=A.get(i);
                i++;
            }
            k++;
        }

        while(i<=mid)
        {
            C[k]=A.get(i);
            i++;
            k++;
        }

        while(j<=end)
        {
            C[k]=A.get(j);
            j++;
            k++;
        }

        for(int m=0;m<C.length;m++)
        {
            A.set(start+m,C[m]);
        }
        return count;
    }
}
