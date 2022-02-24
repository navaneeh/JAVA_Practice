package search;

import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr={6 ,17, 19, 21 ,28 ,29, 30, 38, 40,67,78,90,123,234,300,378,456,789,800};
        int n=arr.length;
        int search=378;
       // int lowerbound=lowerBound(arr,arr.length,search);
//        if(lowerbound<0)
//        {
//            System.out.println("lower Bound Not found");
//        }else
//        {
//            System.out.println("Lower Bound Index:"+lowerbound+"-value:"+arr[lowerbound]);
//        }

        long start= System.currentTimeMillis();
        int upperbound=upperBound(arr,arr.length,search);
       // System.out.println(n);
//        if(upperbound<n)
//        {   System.out.println("upper Bound:"+upperbound+"-value:"+arr[upperbound]);
//
//        }else
//        {
//            System.out.println("upper Bound Not found");
//        }
        long end= System.currentTimeMillis();
        System.out.println("slef_ans:"+(end-start)+"--"+upperbound);

        long start_2= System.currentTimeMillis();
        int binarySearch=binarySearch(arr,search);
        long end_2= System.currentTimeMillis();

        System.out.println("optimized_ans:"+(end_2-start_2)+"--"+binarySearch);

    }

   static int lowerBound(int[] arr,int n,int key)
    {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(key<=arr[mid])
            {
                end=mid-1;
            }else
            {
                start=mid+1;
            }
        }

        return start-1;
    }

    static int upperBound(int[] arr,int n,int key)
    {
        int start=0;
        int end=n-1;
        int k=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(key<=arr[mid])
            {
                end=mid-1;
            }else
            {
                start=mid+1;
            }
            System.out.println("self"+k);
            k++;
        }


        end+=1;

        if(arr[end]==key)
        {
            end+=1;
        }
        return end;
    }

    static int binarySearch(int[] A, int val) {
        int l = 1, h = A.length, ans = 0;
int k=0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (A[mid - 1] > val) {
                h = mid - 1;
            } else {
                l = mid + 1;
                ans = mid;
            }
            System.out.println("optimized:"+k);
            k++;
        }

        return ans;
    }
}
