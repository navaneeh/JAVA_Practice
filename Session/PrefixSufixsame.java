package Session;

public class PrefixSufixsame {

    public static void main(String[] args)
    {
       String A="abcab";
       int count=A.length()-1;


       while(count>-1) {
           boolean flag=true;
           for (int i = 0; i <count; i++) {
               if (A.charAt(i) != A.charAt(A.length() - count + i)) {
                   count--;
                   flag=false;
                   break;
               }
           }

           if(flag==true)
           {
               System.out.println(count);
               break;
           }
       }
        System.out.println("end");


    }


}
