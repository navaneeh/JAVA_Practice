package Academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimalPOwer {
    public static void main(String[] args) {
        List<Integer> A= Arrays.asList(97, 43, 29, 11, 100, 47, 76, 83, 37, 19, 17, 19, 71, 0, 1, -82, 2, -83, 37, 13, 5, 97, 17, 30, 31, 48, 2, 19, 31, 91, 19, 2, 5, 89, 2, 67, 31, 47, 43, 31, 5, 17, 83, 11, 47, 73, 19, 3, 3, 19, 59, 91, 67, 7, 43, 4, 3, 51, 52, 23, 3, 37, 53, 89, 9, 41, 19, 61, 7, 5, 53, 59, 19, 11, 79, 37, 31, 37, 73, 82, 41, 2, 13, 8, 2, 36, 19, 58, 17, 17, 59, 59, 37, 11, 13, 37, 47, 83, 31, 3);
        int count=0;
        for(int i=0;i<A.size();i++)
        {
           if(isPrime2(A.get(i))!=isPrime(A.get(i)))
           {
               System.out.println(i+"-get("+A.get(i)+")-"+isPrime2(A.get(i))+":"+isPrime(A.get(i)));
           }
        }
        //55,64

       //System.out.println(isPrime2(55));
    }

    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

            // Check if number is 2
        else if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrime2(int n)
    {
         if(n<2)return false;
//         if(n==2) return true;
//        if(n%2==0) return false;
         int i=2;


         while(i*i<=n)
         {
                 if(n%i==0)return false;

                 i++;
         }
         return true;

    }
}
