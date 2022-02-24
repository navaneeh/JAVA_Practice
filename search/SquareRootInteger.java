package search;

public class SquareRootInteger {
    public static void main(String[] args) {

            for(int i=0;i<100;i++)
            {
                System.out.println("i"+i+",solution_value"+solution(i));
            }

    }

    static int solution(int A)
        {

            if(A==1 || A==2 || A==3)return 1;
            else if(A==0)return 0;

            long  start=0;
            long  end=A;
            long mid=0;
            boolean status=false;
            int i=1;
            long min_value=0;
            while(start<=end)
            {

                boolean prev_status=status;

                status=false;

                long pre=mid;
                mid=(start+end)/2;
                // System.out.println("step-"+i+",prev:"+pre+",mid:"+mid+",start:"+start+",End:"+end+",status:"+status+",prev_st:"+prev_status+",min_value:"+min_value);
                long square_root=mid*mid;

                if(square_root>A)
                {
                    if(prev_status &&  (mid-pre==1))return (int)pre;
                    //else
                    // if(prev_status && square_root>min_value*min_value )return (int)min_value;
                    // else if(prev_status && (pre+1*pre+1)>A )return (int)pre;

                    if(start==end)
                    {
                        if(pre*pre >A)return (int) min_value;
                        return (int)pre;
                    }
                    end=mid-1;
                }else if(square_root<A)
                {
                    min_value=(int)mid;
                    status=true;
                    start=mid+1;
                }else{
                    return (int)mid;
                }
                i++;
            }
            if(mid*mid>A) return (int)min_value;
            return (int)mid;
    }
}
