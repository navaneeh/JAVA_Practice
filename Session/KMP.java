package Session;

import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
        String text="cacycacabcacycacy";
        String pattern="cac";
        String new_string=pattern+"$"+text;

        int[] lps=new int[new_string.length()];
        lps[0]=0;

        for(int i=1;i<new_string.length()-1;i++)
        {
            int x=lps[i-1];

            while(new_string.charAt(x)!=new_string.charAt(i))
            {
                if(x==0){x=-1;break;}
                x=lps[x-1];
            }
            lps[i]=x+1;
        }

        int count=0;
        for(int j=0;j<lps.length;j++)
        {
            if(lps[j]==pattern.length())
            {
                count++;
            }
        }
        System.out.println(Arrays.toString(lps));
        System.out.println(count);

    }
}
