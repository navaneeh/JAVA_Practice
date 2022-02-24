package TwodArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TwoDmatrixRotate
{
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=row;

        ArrayList<ArrayList<Integer>> data=new ArrayList<ArrayList<Integer>>(row);
        int m=1;
        for(int i=0;i<row;i++)
        {
            ArrayList<Integer> temp_array=new ArrayList<Integer>(col);
            for(int j=0;j<col;j++) {
                temp_array.add(m);
                m++;
            }
            data.add(temp_array);
        }
        printArray(data);
        System.out.println("----------------");
        printArray(solve(data));

        //Main Logic --start
        //        for(int i=0;i<n;i++)
        //        {
        //            for(int j=n-1;j>=0;j--)
        //            {
        //                System.out.print(arr[j][i]+" ");
        //
        //            }
        //            System.out.println();
        //        }
        //Main Logic --End
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();

        B=(ArrayList)A.clone();
        A.clear();

        int k=0;
        for(int i=0;i<B.size();i++)
        {
            int m=0;
            ArrayList<Integer> temp_array=new ArrayList<Integer>();
            for(int j=B.get(i).size()-1;j>=0;j--)
            {
                temp_array.add(B.get(j).get(i));
            }
            A.add(temp_array);
        }
        return A;
    }

    public static void printArray(ArrayList<ArrayList<Integer>> A)
    {
        for(int i=0;i<A.size();i++)
        {
            for(int j=0;j<A.get(i).size();j++)
            {
                System.out.print(A.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }
}
