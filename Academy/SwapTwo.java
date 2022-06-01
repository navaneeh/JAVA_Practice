package Academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapTwo {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(0,1,7,4,5,3,2,6));
        int ans = 0;
        for(int i = 0 ; i < A.size() ; i++ ){
            if(A.get(i) == i)
            {
                System.out.println("--->"+A);
            }
            while(A.get(i) != i){
                ans++;
                Collections.swap(A, i, A.get(i));
                System.out.println(A);
            }
        }
    }
}
