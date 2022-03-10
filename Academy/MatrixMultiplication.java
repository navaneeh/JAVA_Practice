package Academy;

import java.util.ArrayList;

public class MatrixMultiplication {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> temp2=new ArrayList<Integer>();
        temp2.add(1);
        temp2.add(2);

        A.add(temp2);

        ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp3=new ArrayList<Integer>();
        temp3.add(3);
        temp3.add(4);
        temp3.add(7);
        B.add(temp3);

        ArrayList<Integer> temp4=new ArrayList<Integer>();
        temp4.add(5);
        temp4.add(6);
        temp4.add(8);
        B.add(temp4);

       ArrayMultiplication(A,B);
    }

    public static ArrayList<ArrayList<Integer>> ArrayMultiplication(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B)
    {
        int r1=A.size();
        int c1=A.get(0).size();
        int r2=B.size();
        int c2=B.get(0).size();
        int[][] result=new int[r1][c2];

        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                result[i][j]=0;

                for(int k=0;k<r2;k++)
                {
                    System.out.println("i:"+i+",j:"+j+",k:"+k);
                    //A.get(k).get(j);
                    result[i][j]+=A.get(i).get(k) * B.get(k).get(j);
                }
            }
        }

        return arrayToArraylist(result);
    }

    public static ArrayList<ArrayList<Integer>> arrayToArraylist(int[][] data)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<data.length;i++)
        {
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int j=0;j<data[i].length;j++)
            {
                //temp.add(data[i][j]);
                System.out.print(data[i][j]+",");
            }
            System.out.println();
            ans.add(temp);
        }
        return ans;
    }
}
