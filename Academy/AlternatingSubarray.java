package Academy;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatingSubarray {
    public static void main(String[] args) {
        int B=2;
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(0,1,0,1,0,0,0,1,0,1,0,1));
        int len=2*B+1;
        int n=A.size();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<=n-len;i++)
        {
            int temp=A.get(i);
            int limit =i+len;
            int pre_value=0;
            boolean check=true;
            System.out.println(i);
            for(int j=i;j<limit;j++)
            {
                if(j!=i)
                {
                    if(!(pre_value!=A.get(j)))
                    {
                        check=false;
                        break;
                    }
                }
                pre_value=A.get(j);
            }

            //System.out.println(i);
            //break;
            if(check)ans.add((i+limit-1)/2);

        }
        System.out.println(ans.toString());

    }
}
