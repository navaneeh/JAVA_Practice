package Leetcode;

public class BinaryAddtion {
    public static void main(String[] args) {


        String a="1";
        String b="111";
        System.out.println(addBinary(a, b));
    }
        public  static String addBinary(String a, String b) {
            if(a.length()<b.length())
            {
                String temp=a;
                a=b;
                b=temp;
            }
            int a_len=a.length();
            int b_len=b.length();

            int n=0;
            int temp_value=0;

            int b_sub_value=0;
            String str="";
            boolean n_update_status=false;
            for(int i=0;i<a.length();i++)
            {
                boolean temp_n_check=false;
                if(n_update_status)
                {
                    temp_n_check=true;
                    n_update_status=false;
                }
                int posa=a_len-1-i;
                int posb=b_len-1-i;

                if(!(i<=b_len-1))
                {   if(temp_n_check==false)
                    {
                        n=0;
                    }
                    b_sub_value=0;
                }else
                {
                    b_sub_value=Character.getNumericValue(b.charAt(posb));
                }

                temp_value=binaryAddition(n+Character.getNumericValue(a.charAt(posa)),b_sub_value);
               // System.out.println("a:"+a.charAt(posa)+",b:"+b_sub_value+",temp_value:"+temp_value+",n:"+n);
                if(temp_value==10 || temp_value==11 )
                {
                    if(i==a_len-1)
                    {

                        if(temp_value>9)
                        {
                            String Reverse= String.valueOf(temp_value);
                            Reverse=Character.toString(Reverse.charAt(1))+Character.toString(Reverse.charAt(0));
                            str+=Reverse;
                        }else
                        {
                            str+=temp_value;
                        }

                    }else
                    {
                        n_update_status=true;
                        str+=temp_value%10;
                        n=temp_value/10;
                    }
                }else
                {
                    n=0;
                    str+=temp_value;
                }
               // System.out.println(str);
            }

            StringBuilder ans=new StringBuilder();
            ans.append(str);
            ans.reverse();

            String str1=ans.toString();
            return str1;

        }

        public static int binaryAddition(int a,int b)
        {
            int ans=a+b;
            if(ans==0)return 0;
            else if(ans==1)return 1;
            else if(ans==2)return 10;
            else return 11;

        }


//    public  static String addBinary(String a, String b) {
//        int binary_addtion=binaryToDecimal(a)+binaryToDecimal(b);
//        //System.out.println(binary_addtion);
//        return DecimalToBinary(binary_addtion);
//    }

    public static int binaryToDecimal(String num)
    {
        int a=Integer.valueOf(num);
        int ans=0;
        int pow=1;
        while(a>0)
        {
            ans=ans+((a%10)* pow);
            pow*=2;
            a/=10;
        }
        return ans;
    }

    public static String DecimalToBinary(long n)
    {
        long ans=0;
        long pow=1;
        while(n>0)
        {
            ans=ans+(n%2*pow);
            pow*=10;
            n/=2;
        }
        return String.valueOf(ans);
    }
}
