package Academy;

import java.util.HashSet;

public class CountPairs {
    public static void main(String[] args) {
        int[] A={1,4,3,0,2,5,6,8};
        int k=1;
        HashSet<Integer> set=new HashSet<Integer>();
        int ans=0;
        for(int i=0;i<A.length;i++)
        {
            if(set.contains(A[i]+k))
            {
                ans++;
            }
            set.add(A[i]);
        }
        System.out.println(ans);
    }
}
