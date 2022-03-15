package Academy;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber3 {
    public static void main(String[] args) {
        ArrayList<Integer> ar= new ArrayList<Integer>(Arrays.asList(186, 256, 102, 377, 186, 377));
        int n=ar.size();
        int xor=0;
        while(n>0)
        {
            xor^=ar.get(n-1);
            n--;
        }
        System.out.println(xor);
        int a=0;int b=0;

        int mask=(xor & (xor-1)) ^ xor;
        System.out.println(mask);
        //1, 2, 3, 1, 2, 4
        for(int x:ar)
        {
             if((x & mask)==1)
             {
                 a = a ^ x;
             }
             else
             {
                 b = b ^ x;
             }
        }

        System.out.println(a+":"+b);

    }
}
