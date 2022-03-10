import java.util.Arrays;
import java.util.Collections;

public class HelloWorld {
    public static void main(String[] args) {

        int B=8;
        B--;
        int arr_size=25;
        for(int i=1;i<=100000;i++)
        {
            if(B<0)
            {
                System.out.println(100000-i-2);
            }

        }
        System.out.println("done");

    }

    public static String santize(String A)
    {
        int start,i=0;
            start=i;
        boolean start_pos_found=false;

        int end,end_pos=A.length()-1;
            end=end_pos;
        boolean end_pos_found=false;

        for(;i<(A.length()-1);i++,end_pos--)
        {

            if(start_pos_found)i--;
            if(end_pos_found)end_pos++;

            if(!(i<end_pos) || (start_pos_found && end_pos_found) ){break;}
            char start_char=A.charAt(i);

            //System.out.println("update-"+start +"-"+ start_pos_found+"-"+  start_char);
            if(start==0 && start_pos_found==false && start_char!='*')
            {
                start=i;
              //  System.out.println("in");
                start_pos_found=true;
            }

            //int end_pos=(A.length-(i+1));
            char end_char=A.charAt(end_pos);
            if(end==A.length()-1 && end_pos_found==false && end_char!='*' )
            {
                end=end_pos;
                end_pos_found=true;
            }
           // System.out.println("i-"+i+"end_pos-"+end_pos);
           // System.out.println("i:"+i+",end_pos:"+end_pos+"+start:"+start+",end:"+end);
        }
//        System.out.println("OuterLoop:i-"+i+"end_pos-"+end_pos);
//        System.exit(1);
//        System.out.println("check-start"+start+",end:"+end);
       //System.out.println("last-i:"+i+",end_pos:"+end_pos+"+start:"+start+",end:"+end+start_pos_found+end_pos_found);
        if(i==(end_pos))
        {
           if(start_pos_found==true && end_pos_found==false)
           {
               end=start+1;
           }else if(start_pos_found==false && end_pos_found==true)
            {
                start=end-1;
            }else {
               start = end_pos;
               end = start + 1;
           }
        }
        //System.out.println("check-start"+start+",end:"+end);
        A=A.substring(start,end+(end_pos_found?1:0));
        char first_char=A.charAt(0);
        if(first_char=='*')
        {
            return A.length()>1?String.valueOf(A.charAt(A.length()-1)):"";
        }else
        {
            return A;
        }

    }

}
