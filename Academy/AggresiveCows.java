package Academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AggresiveCows {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(5,17,11,100));
        int B=2;
        Collections.sort(A);

        int start=1;
        int end=A.get(A.size()-1)-A.get(0);

        int ans=-1;

        while(start<=end)
        {
            int mid=(start+end)/2;
            boolean check=CheckDistance(A,B,mid);
            System.out.println("start:"+start+",end:"+end+",mid:"+mid+"check:"+check);
            if(check)
            {
                ans=mid;
                start=mid+1;
            }else
            {
                end=mid-1;
            }
        }
        System.out.println(ans);
    }

    public static boolean CheckDistance(ArrayList<Integer> A, int cows, int distance)
    {
        int previous=A.get(0);
        int cow_placed=1;
        for(int i=1;i<A.size();i++)
        {
            if(A.get(i)-previous>=distance)
            {
                cow_placed++;
                previous=A.get(i);
            }
            if(cows==cow_placed)
            {
                return true;
            }
        }
        return false;
    }
}
