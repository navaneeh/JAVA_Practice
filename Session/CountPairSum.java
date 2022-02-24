package Session;

public class CountPairSum {
//https://www.geeksforgeeks.org/two-pointers-technique/
        public static int isPairSum(int A[], int N, int X)
        {
           int count=0;
           int i=0;
           int j=N-1;
           while(i<j)
           {
               System.out.println("i:"+i+",j:"+j+",total:"+(A[i]+A[j]));
               if(A[i]+A[j]==X)return 1;
               else if(A[i]+A[j]<X)i++;
               else j--;
           }
           return count;
        }

        // Driver code
        public static void main(String[] args)
        {
            int arr[] = { 2, 3, 5, 8, 9, 10, 11 };

            int val = 19;

            int arrSize = arr.length;

            System.out.println(isPairSum(arr, arrSize, val));
        }

}
