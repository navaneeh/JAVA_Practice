package Academy;

import java.util.Scanner;

public class StartPattern {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int i=n;

            while(i>=0)
            {
                int m=0;
                while(m<n-i)
                {
                    System.out.print("*");
                    m++;
                }
                int t=0;
                while(t<i*2)
                {
                    System.out.print("-");
                    t++;
                }
                int l=0;
                while(l<n-i)
                {
                    System.out.print("*");
                    l++;
                }
                System.out.println("");
                i--;
            }
        }

}
