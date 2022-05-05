package Academy;

public class Parenthis_check {
    public static void main(String[] args) {
        String A="{}()";
        char[] arr=new char[A.length()];
        int top=-1;
        for(int i=0;i<A.length();i++)
        {
            char temp=A.charAt(i);
            if(temp=='{' || temp=='(' || temp=='[')
            {
                arr[++top]=temp;
            }else
            {
                if(top==-1)System.out.println(0);

                if( (temp=='}' && arr[top]=='{' ) ||
                        (temp==')' && arr[top]=='(' ) ||
                        (temp==']' && arr[top]=='[' ))
                {
                    top--;
                }else{
                    System.out.println(0);;
                }
            }
        }

        if(top!=-1)System.out.println(0);;

        System.out.println(1);;
    }

}
