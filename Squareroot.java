public class Squareroot {
    public static void main(String[] args) {
                int A=2147483647;
                for(int i=4;i<100;i++)
                {
                    System.out.println("i:"+i+"square_value-"+square_calc(i));

                }
       // System.out.println(square_calc(A));

    }

    static int square_calc(int A)
    {
        if(A==1 || A==2 || A==3)return 1;
        else if(A==0)return 0;

        long  start=0;
        long  end=A;
        long mid=0;
        boolean status=false;
        int i=1;
        while(start<=end)
        {
            boolean prev_status=status;
            status=false;

            long pre=mid;
            mid=(start+end)/2;
            //System.out.println("step-"+i+",prev:"+pre+",mid:"+mid+",start:"+start+",End:"+end+",status:"+status+",prev_st:"+prev_status);
            long square_root=mid*mid;

            if(square_root>A)
            {
               // if(prev_status && start==end && mid==start)return (int)pre;
                if(prev_status)return (int)pre;
                if(start==end)return (int)pre;
                end=mid-1;
            }else if(square_root<A)
            {
                status=true;
                start=mid+1;
            }else{
                return (int)mid;
            }
            i++;
        }
        return (int)mid;
    }
}
