package Academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MaxDistanceArray {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(100,100,100,100,100));
        int n=A.size();
        ArrayList<ArrayList<Integer>> pairsArray=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> temp=new ArrayList<Integer>(Arrays.asList(A.get(i),i));
            pairsArray.add(temp);
        }

        Collections.sort(pairsArray,new Comparator<ArrayList<Integer>>()
        {
            public int compare(ArrayList<Integer> a1,ArrayList<Integer> a2)
            {
                if(a1.get(0)>=a2.get(0))
                {
                    return 1;
                }
                return -1;
            }
        });

        int max_j=pairsArray.get(n-1).get(1);
        int ans=Integer.MIN_VALUE;
        System.out.println(pairsArray);


        for(int j=n-1;j>=0;j--)
        {
            System.out.println(max_j+"-"+pairsArray.get(j).get(1));
            ans=Math.max(ans,max_j-pairsArray.get(j).get(1));
            max_j=Math.max(max_j,pairsArray.get(j).get(1));
            //System.out.println(ans);

        }
        System.out.println(ans);
    }
}
