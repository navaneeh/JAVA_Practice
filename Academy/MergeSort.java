package Academy;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arrr={4,78,34,12,14,25,1,1,34,3,7,28,45,9,78,0};

        System.out.println(Arrays.toString(arrr));
        merge_sort(arrr,0,arrr.length-1);
        System.out.println(Arrays.toString(arrr));
    }

    public static void merge_sort(int[] A,int start,int end)
    {
        if(start==end)return;
            int mid = (start + end) / 2;
            merge_sort(A, start, mid);
            merge_sort(A, mid + 1, end);
            merge_two_array(A, start, mid, end);

    }

    public static void merge_two_array(int[] A,int start,int mid,int end)
    {
            int[] C=new int[end-start+1];
            int i=start;
            int j=mid+1;
            int k=0;

            while(i<= mid && j<=end)
            {
                if(A[i]<A[j])
                {
                    C[k]=A[i];
                    i++;
                }else
                {
                    C[k]=A[j];
                    j++;
                }
                k++;
            }

            while(i<=mid)
            {
                C[k]=A[i];
                i++;k++;
            }

            while(j<=end)
            {
                C[k]=A[j];
                j++;k++;
            }

            for(int m=0;m<C.length;m++) {
                A[start + m] = C[m];
            }
    }
}
